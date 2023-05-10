import { TestBed } from '@angular/core/testing';
import {SampleComponent} from "./sample.component";
import {SampleService} from "./sample.service";


//TODO: Fix test case
describe('SampleComponent', () => {
  let sampleService: SampleService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [],
      declarations: [SampleComponent],
      providers: [SampleService]
    })
    sampleService = TestBed.get(SampleService);
  });

  it("should render data fetched from service", () => {
    jest.spyOn(sampleService, "getSampleData").mockResolvedValueOnce({data: "Data Found"})
    const fixture = TestBed.createComponent(SampleComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    console.log(compiled.textContent);
    expect(compiled.querySelector("h5")?.textContent).toContain("Data Found");
  });
});

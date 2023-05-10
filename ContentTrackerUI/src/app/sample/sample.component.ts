import {Component, OnInit} from "@angular/core";
import {SampleData} from "./models/sampleData";
import {SampleService} from "./sample.service";

@Component({
  selector: "sample-component",
  templateUrl: "./sample.component.html",
  styleUrls: ["./sample.component.css"]
})
export class SampleComponent implements OnInit {
  sampleData?: SampleData;

  constructor(private sampleService: SampleService) {}

  ngOnInit() {
    this.setSampleData();
  }

  setSampleData(): void {
    this.sampleService.getSampleData().then(data => {
      this.sampleData = data;
    });
  }

}

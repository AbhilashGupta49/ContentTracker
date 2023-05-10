import {Injectable} from "@angular/core";
import {SampleData} from "./models/sampleData";
import axios from "axios";
import {environment} from "../../../environment";

@Injectable({
  providedIn: "root"
})
export class SampleService {

  private sampleDataUrl = environment.baseUrl + "sample"

  constructor() {}

  getSampleData(): Promise<SampleData> {
    return axios.get(this.sampleDataUrl)
      .then(response => response)
      .catch(error => {
        console.error(error);
        return {data: ""}
      });
  }
}

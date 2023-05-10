import axios from "axios";
import {environment} from "../environment";

axios.defaults.baseURL = environment.baseUrl;

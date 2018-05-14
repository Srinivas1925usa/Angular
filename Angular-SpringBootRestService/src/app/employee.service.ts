import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IEmployee  } from './employee';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class EmployeeService {

  
  private _url: string = '/topics/hi';
  // "http://localhost:8080/topics.json"
      // "/assets/data/employees.json";

  constructor(private http: HttpClient) { }

  getEmployees():Observable<IEmployee[]>{

    return this.http.get<IEmployee[]>(this._url); 
    
   }
}
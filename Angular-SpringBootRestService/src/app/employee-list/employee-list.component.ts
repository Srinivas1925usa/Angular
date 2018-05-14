import { EmployeeService } from '../employee.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-list',
  template: `
    <h2>
      employee-list works!</h2>
<ul *ngFor="let employee of employees">
<li>{{employee.id}}; {{employee.name}};{{employee.description}}
</ul>
  `,
  styles: []
})
export class EmployeeListComponent implements OnInit {

  constructor(private _employeeService: EmployeeService) { }
  
  public employees = [];

  ngOnInit() {
  this._employeeService.getEmployees()
    .subscribe(data=> this.employees=data);
  }

}

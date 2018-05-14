import { TestBed, inject } from '@angular/core/testing';

import { EmpoyeeService } from './empoyee.service';

describe('EmpoyeeService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [EmpoyeeService]
    });
  });

  it('should be created', inject([EmpoyeeService], (service: EmpoyeeService) => {
    expect(service).toBeTruthy();
  }));
});

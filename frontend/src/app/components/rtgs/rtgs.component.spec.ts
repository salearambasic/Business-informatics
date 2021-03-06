import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RtgsComponent } from './rtgs.component';

describe('RtgsComponent', () => {
  let component: RtgsComponent;
  let fixture: ComponentFixture<RtgsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RtgsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RtgsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

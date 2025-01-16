import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Supplier } from '../../types/Supplier';
import { of } from 'rxjs';

@Component({
  selector: 'app-suppliersample',
  standalone: true,
  imports: [], // Add necessary imports
  templateUrl: './suppliersample.component.html',
  styleUrls: ['./suppliersample.component.css'] 
})
export class SupplierSampleComponent {
  // Component logic goes here
  supplier:Supplier=new Supplier(1,"Anuj","anuj123@gmail.com","1234567898","Navi-Mumbai","anuj123","anujpass123","IT_Head");
}
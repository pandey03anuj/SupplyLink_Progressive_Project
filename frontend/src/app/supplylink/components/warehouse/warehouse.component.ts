import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component ({
    selector : 'app-warehouse',
    template : './warehouse.component.html',
    styleUrls : ['./warehouse.component.scss']
})


export class WarehouseComponent implements OnInit {

    warehouseForm:FormGroup;
    isSubmitted:boolean=false;

    constructor(private fb:FormBuilder){}

    ngOnInit(): void {
        this.warehouseForm=this.fb.group({
            warehouseId:[null,[Validators.required]],
            supplierId:[null,[Validators.required,Validators.min(1)]],
            warehouseName:['',[Validators.required]],
            location:['',[Validators.required]],
            capacity:[null,[Validators.required,Validators.min(0)]],
        });        
    }

    onSubmit(){
        throw new Error('Method not implemented');

        // if(this.warehouseForm.valid){
        //     this.isSubmitted=true;
        // }
        

    }
    


}

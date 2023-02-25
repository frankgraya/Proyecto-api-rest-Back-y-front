import { EmpleadoService } from './../empleado.service';
import { Empleado } from './../empleado';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista-empleados',
  templateUrl: './lista-empleados.component.html',
  styleUrls: ['./lista-empleados.component.css']
})
export class ListaEmpleadosComponent implements OnInit{
    empleados:Empleado[];

  constructor(private empleadoService:EmpleadoService){

    }


  ngOnInit(): void {
   this.obtenerEmpleados();
  }


  private obtenerEmpleados(){
    this.empleadoService.obtenerListaDeEmpleados().subscribe(dato => {
      this.empleados = dato;
    })
  }
}

import { Empleado } from './empleado';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClientModule } from '@angular/common/http';


@Injectable({
  providedIn: 'root',
})
export class EmpleadoService {

  //obtiene el listado de todos los empleados
  private baseURL = "http://localhost:4000/api/empleado";

  constructor(private httpCliente : HttpClient) {}

  //https://www.youtube.com/watch?v=o_HV_FCs-Z0&t=4699s
  //minuto una hora
  //Este metodo nor sirve para obetener los empleados
  obtenerListaDeEmpleados():Observable<Empleado[]>{
    return this.httpCliente.get<Empleado[]>(`${this.baseURL}`);
  }
}

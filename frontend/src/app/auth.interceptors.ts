import { Injectable } from "@angular/core";
import {
  HttpInterceptor,
  HttpRequest,
  HttpHandler,
  HttpEvent,
} from "@angular/common/http";
import { Observable } from "rxjs";
import { AuthService } from "./auth/services/auth.service";

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

  constructor (private authService : AuthService) {}
  
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

    if(req.url.includes('login') || req.url.includes('register'))
        return next.handle(req);

    const token = localStorage.getItem('token');
    req = req.clone(
      {
        headers : req.headers.set('Authorization', 'beared ' + token )
      }
    )
    return next.handle(req);
  }
  
}
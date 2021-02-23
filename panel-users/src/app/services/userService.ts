import {Injectable} from '@angular/core';
import {HttpClient ,HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {User} from '../models/user';

@Injectable()

export class UserService{

	public url:string;

	constructor(private _http: HttpClient){
		this.url = 'http://127.0.0.1:8080/';
	}

	public getListUsers():Observable<any>{

		this.url = this.url+"listUsers";
		return this._http.get(this.url);	

	}
}
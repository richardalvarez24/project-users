import { Component, OnInit } from '@angular/core';
import {User} from '../models/user';
import {UserService} from '../services/userService';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  providers: [UserService]
})
export class HomeComponent implements OnInit {
	public listUsers:any;
  constructor(private userService: UserService) { }

  ngOnInit(): void {
  	this.listUsers = this.userService.getListUsers().subscribe(response=>{
      console.log('lista de usuarios2');
      console.log(response);
      this.listUsers = response;
     });
  	
  }

}

import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';

@Component({
  selector: 'app-bookform',
  templateUrl: './bookform.component.html',
  styleUrls: ['./bookform.component.css']
})
export class BookformComponent implements OnInit {
  books : Array<any> = [];
  constructor(private bookSvc : BookserviceService) { }

  ngOnInit(): void {
  }
  onLoad(){
    const self = this;
    this.bookSvc.getBookDetails()
    .subscribe( (data: any) => this.books =data);
  }

}

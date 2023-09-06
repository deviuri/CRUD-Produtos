import { Observable } from 'rxjs';
import { Product } from './../product.model';
import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-product-read',
  templateUrl: './product-read.component.html',
  styleUrls: ['./product-read.component.css']
})
export class ProductReadComponent {

  products!: Product[];
  product: Product | undefined;
  displayedColumns = ['id', 'name', 'price', 'action'];

  constructor(private productService: ProductService){}

  ngOnInit(){
    this.productService.read().subscribe(products => {
      this.products = products;
      console.log(products)
    });
  }
}

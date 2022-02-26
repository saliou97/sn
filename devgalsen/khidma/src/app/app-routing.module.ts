import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AcceuilComponent} from "./acceuil/acceuil.component";
import {NousComponent} from "./nous/nous.component";
import {ProduitsComponent} from "./produits/produits.component";
import {ServicesComponent} from "./services/services.component";

const routes: Routes = [
  {path: 'accueil', component:AcceuilComponent},
  {path: 'nous',component:NousComponent},
  {path: 'produits', component:ProduitsComponent},
  {path: 'contact', component:ServicesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[AcceuilComponent, NousComponent,ProduitsComponent,ServicesComponent]

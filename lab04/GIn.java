class Gin extends Decorator{
Gin(offering offering)
this.offering=offering;
}
String getName(){
return offering.getName() + "With Gin";
}
int getPrice(){
return offering.getPrice() + 35;
}

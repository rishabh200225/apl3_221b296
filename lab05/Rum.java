class Rum extends Decorator{
Rum(offering offering)
this.offering=offering;
}
String getName(){
return offering.getName() + "With Rum";
}
int getPrice(){
return offering.getPrice() + 55;
}

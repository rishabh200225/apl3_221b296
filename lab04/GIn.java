class Gin extends Decorator{
Gin(Offering Offering)
this.Offering=Offering;
}
String getName(){
return Offering.getName() + "With Gin";
}
int getPrice(){
return Offering.getPrice() + 35;
}

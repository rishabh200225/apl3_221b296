class Voice {
 void prepareVoice() 
    

    {
         Animal[] animals = new Animal[6];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();		
	animals[5] = new Tiger();
	
	
    }
    void hear(Animal[] animal){
 	for(int i=0;i<6;i++){
	animal[i].makeVoice();
}
}
}
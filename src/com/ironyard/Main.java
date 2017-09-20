package com.ironyard;

public class Main {

    public static void main(String[] args) {
	    Army pete = new Army("Pete", "Sergeant", 1234);
	    Navy goose = new Navy("Goose", "Captain",2345);
	    Marines gomer = new Marines("Gomer", "Private", 3456);
	    AirForce jane = new AirForce("Jane", "Colonel", 4567);
	    CarrierGuy john = new CarrierGuy("John", "2nd L", 5678);
	    ArmyBoxer rocky = new ArmyBoxer("Rocky", "Major", 6789);

        System.out.println("Pete's name is: " + pete.getName());
        System.out.println("Goose's rank is: " + goose.getRank());
        System.out.println("Gomer's number is: "+ gomer.getSerial());

        System.out.println("Army: " + pete.speak());
        System.out.println("Navy: " + goose.speak());
        System.out.println("Marines: " + gomer.speak());
        System.out.println("Air Force: " + jane.speak());

        System.out.println("Army shoots gun: " + pete.gun());
        System.out.println("Navy drop scatter: " + goose.scatterBomb());
        System.out.println("Marines shoots grenade: " + gomer.grenadeLauncher());
        System.out.println("Air Force drops an A-bomb: " + jane.aBomb());

        System.out.println("Navy drops A-bomb: " + goose.aBomb());
        System.out.println("Marine shoots gun: " + gomer.gun());

        System.out.println("Carrier guy speaks: " + john.speak());
        System.out.println("Carrier guy tries to shoot: " + john.gun());
        Bomb tempBomb = john.loadBomb();
        String johnsBomb = tempBomb.convert();
        System.out.println("Carrier guy loads bomb: " + johnsBomb);

        System.out.println("Army tries out the new flamethrower: " + pete.flameThrower());
        System.out.println("Marine tries the flamethrower after override: " + gomer.flameThrower());

        System.out.println("Boxer throws a left: " + rocky.left());
        System.out.println("Boxer speaks: " + rocky.speak());
    }
}

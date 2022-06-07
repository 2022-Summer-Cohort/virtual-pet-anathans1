package virtual_pet;

import org.w3c.dom.ls.LSOutput;

import java.time.Clock;
import java.time.Duration;
import java.util.Random;

public class VirtualPet {


    private String name;

    private int hungerLevel;

    private int urgeToSteal;

    private int thirstLevel;

    private int boredomLevel;

    private int foodInTheFridge;

    private int keys;

    private int phone;

    private int life;
    //public int getTheLifeVariableValue() {
    //   return this.life;
    // }


    // public void setLife(int userSetsLife) {
    //    this.life = userSetsLife;
    //this makes the user able to call the user's ability to set the int and set it using rocky.setLife(4) // four being the variable set through the application
    // }

    // new VirtualPet("Rocky", 3, 5,5,5);
    public VirtualPet(String name, int hungerLevel, int urgeToSteal, int thirstLevel, int boredomLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.urgeToSteal = urgeToSteal;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        //     this.foodInTheFridge = foodInTheFridge;
        //     this.keys = keys;
        //     this.phone = phone;
        //     this.life = life;
    }
// line 26-36 defining the way that the class is initialized
    public String getName() {
        return name;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public int getUrgeToSteal() {
        return urgeToSteal;
    }
    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }
    //TODO
    //TODO:
    // public int getFoodInTheFridge() {
    //    return foodInTheFridge;
    // }
    // public int getKeys() {
    //     return keys;
    // }
    // public int getPhone() {
    //    return phone;
    // }
    // public int life() {
    //     return life;
    // }
    public void greeting() {
        System.out.print("\uD83E\uDD9D" + name + "'s" + "🦝 hunger level is " + hungerLevel + ", his thirst level is " + thirstLevel);
        System.out.println(", his boredom level is " + boredomLevel + " and his urge to steal is " + urgeToSteal);

    }
    public void feed() {
        hungerLevel = -1;
        //TODO:  thirstLevel = thirstLevel +2;
    }

    public void water() {
        thirstLevel = -1;
        // TODO:  hungerLevel = hungerLevel + 2;
    }

    public void play() {
        boredomLevel = -1;
    }

    public void tick() {
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
        // TODO 5/25/22 add boredom level randomized
        // TODO eventually want to do this ---> boredomLevel = new Random().nextInt(4) + 1;
        // TODO but confused about how to make the boredom level go over 5 due to user negligence not randomization

//       TODO if (hungerLevel > 5) {
//            urgeToSteal++;
//        }
//        if (thirstLevel > 5) {
//            urgeToSteal++;
//        }
//        if (boredomLevel > 5) {
//            urgeToSteal++;
//        }
//        if (urgeToSteal > 9) {
//            System.out.println("You're raccoon has stolen your food, phone and keys. You are now their pet!");
//            System.out.println("                                                              _/;\n" +
//                    "                                                            _(~  ;\n" +
//                    "                                                          _(##    ;\n" +
//                    "                                    ___                 _(   ###   ;\n" +
//                    "                           __,-----'   `--.__         _( ##    ### ;\n" +
//                    "               ,-.   _,---'  ,-,      ,      `---.   (##  ###    ###\n" +
//                    "              //\\\\ -'       //~\\\\   , `           `--. ##   ###   #;\n" +
//                    "            ,'/\"\"\\`,--'~~`-'/ \"\";;  `                 `-.##   ###  ;\n" +
//                    "            (( \"__;;  ,.,.,   ~~ ; ,                  ,  `.##   ##;\n" +
//                    "            ; '~_,-.      _,-'~~`-.`        ;         `,  ; ##   ;\n" +
//                    " *(*)      ;_.-'  _ `.   ;   _    `.     - `          ,`  ;  ## ;\n" +
//                    " ***     ;;   _,-'::-.: | ,-'::-._,|       _`         `   ; _,-'\n" +
//                    " \\/ +   ; ;,-:::(0)::\\; :/(0):::::::      '               |;\n" +
//                    " ---   ;  `.:::::,-'~)   (`-.::--.:;     '           ,    : --  ----\n" +
//                    "      ;    :~`-'~     \\__\\   ~~  ~.'    ;            `   ;\n" +
//                    "     ;      `-._    . (~..) `;_,-'      ;               ;    *\n" +
//                    "     .         ;`-`._ .`--'_;           ;           _,-'   *[o]*\n" +
//                    "     ;     ;  ; `-.  `--'`-'  ;        ;\\       _,-'         !\n" +
//                    "     (    ;  ;     `-.____,--;     ;  _; `-,___(_     \\?/\n" +
//                    "      \\      `-,_     ~~~~  ;       ;;    /    __}\n" +
//                    "       `._       `-.      ,-'    ; _,' ,-',,,-'\n" +
//                    " @@@@@@@  `--,~~~~~ ;    ;     _,-'    C^c^c           @@@@@@@@@\n" +
//                    " ~~~~~~~~~__ ))(_)()\\ ___)~~~~( ____         @@@@@@@@@@@@@@@/~~~~~~~\n" +
//                    "      ,-'oo //:; :; ); o ))))))) oooo-.~~~~~~~~~~~~~~~~~~~~~\n" +
//                    "     { ooo  ()() () () o ()()()() ooooo}                     -\n" +
//                    "      `-.oo ~ ~  ~  ~ oo ~ ~ ~ ~ ooo,-'     ~~~~~      ~~~\n" +
//                    "          `-------------------------\n" +
//                    "   ~~~~                  ~~~~~               ~~~~~~~   __    ~~\n" +
//                    "\n" +
//                    "      ~~~~~~                         ~~               ~~\n" +
//                    " -------------------------------------------------------------------");
//            System.exit(0);
//
//        }
    }
}

        // TODO:
       /*
        // TODO: if (foodInTheFridge == 0) {
            System.out.println("Your racoons raided your fridge. You now have no food!");
        }
        // TODO: if (keys == 0) {
            System.out.println("Your racoons have stolen your phone. You can't call for help!");
        }
        // TODO: if (phone == 0) {
            System.out.println("Your racoons have stolen your keys. You are trapped!");
        }
         //TODO: if ((foodInTheFridge + keys + phone) == 0) {
         // System.out.println("Your racoons have taken over your house. You are now their pet...");
            }
        }
    }


    // TODO Maybe........ public static Clock tick(Clock baseClock, Duration tickDuration) {


// TODO create another class? that details what you have in your house.
//  if the urge to steal gets above 5... you lose something
//   you only have so many things. you lose if everything is stolen
//    steal food can't eat... steal phone can't call animal control
*/

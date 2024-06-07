package com.Calculusratiocinator.affirmation;

import com.Calculusratiocinator.LogicUtils;
import com.Calculusratiocinator.Personne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AffirmationTest {
    @Test
    void isLouPauvreAndGenerous() {
        var Lou = new Personne("Lou");
        var Generous = new Generous(true);
        var Pauvre = new Pauvre();
        assertFalse(LogicUtils.AndLogic(Pauvre.isTruth(), Generous.isTruth()));
    }
    @Test
    void isLouBeauDoncPauvre(){
        var Lou = new Personne("Lou");
        var Beau = new Beau();
        var Pauvre = new Pauvre();
        assertFalse(LogicUtils.NotLogic(Beau.isTruth(),Pauvre.isTruth()));
    }
    @Test
    void isLouisPauvreDoncGenerous(){
        var Pauvre = new Pauvre();
        //if generous is true
        var GenerousTrue = new Generous(true);
        var GenerousFalse = new Generous(false);
        assertTrue(LogicUtils.NotLogic(Pauvre.isTruth(),GenerousTrue.isTruth()));
        assertFalse(LogicUtils.NotLogic(Pauvre.isTruth(),GenerousFalse.isTruth()));
    }

    @Test
    void  FourthAffirmation (){
        var Beau = new  Beau();
        var Generous = new Generous(true);
        var Pauvre = new Pauvre();
        assertFalse(LogicUtils.NotLogic((LogicUtils.OrLogic(Beau.isTruth(),Generous.isTruth())),Pauvre.isTruth()));
    }
}
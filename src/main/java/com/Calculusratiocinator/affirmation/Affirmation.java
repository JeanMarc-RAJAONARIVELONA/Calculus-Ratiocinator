package com.Calculusratiocinator.affirmation;


public sealed abstract class Affirmation permits Beau,Pauvre ,Generous {
    protected final Boolean value;

    protected Affirmation(Boolean value) {
        this.value = value;
    }
    public abstract boolean isTruth();
}

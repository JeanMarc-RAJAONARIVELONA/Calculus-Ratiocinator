package com.Calculusratiocinator.affirmation;


public sealed abstract class Affirmation permits Truth_1, Lying_1, Affirmation_1 {
    protected final Boolean value;

    protected Affirmation(Boolean value) {
        this.value = value;
    }

    public abstract Boolean isTruth();
}

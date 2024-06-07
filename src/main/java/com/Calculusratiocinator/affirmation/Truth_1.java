package com.Calculusratiocinator.affirmation;

public final class Truth_1 extends Affirmation {
    private Truth_1() {
        super(true);
    }

    @Override
    public Boolean isTruth() {
        return this.value;
    }
}

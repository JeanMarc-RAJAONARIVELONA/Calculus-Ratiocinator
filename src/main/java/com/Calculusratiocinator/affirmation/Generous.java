package com.Calculusratiocinator.affirmation;

public final class Generous extends Affirmation {
    protected Generous(Boolean value) {
        super(value);
    }

    @Override
    public boolean isTruth() {
        return this.value;
    }

}

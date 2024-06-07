package com.Calculusratiocinator.affirmation;

import lombok.Getter;

@Getter
public final class Pauvre extends Affirmation {
    protected Pauvre() {
        super(false);
    }

    @Override
    public boolean isTruth() {
        return false;
    }
}

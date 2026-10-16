package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hx implements com.google.v.eg {
    ALLERGEN_DAIRY(0),
    ALLERGEN_EGG(1),
    ALLERGEN_FISH(2),
    ALLERGEN_PEANUT(3),
    ALLERGEN_SHELLFISH(4),
    ALLERGEN_SOY(5),
    ALLERGEN_TREE_NUT(6),
    ALLERGEN_WHEAT(7);


    /* renamed from: j, reason: collision with root package name */
    private final int f11971j;

    hx(int i2) {
        this.f11971j = i2;
    }

    public static hx a(int i2) {
        switch (i2) {
            case 0:
                return ALLERGEN_DAIRY;
            case 1:
                return ALLERGEN_EGG;
            case 2:
                return ALLERGEN_FISH;
            case 3:
                return ALLERGEN_PEANUT;
            case 4:
                return ALLERGEN_SHELLFISH;
            case 5:
                return ALLERGEN_SOY;
            case 6:
                return ALLERGEN_TREE_NUT;
            case 7:
                return ALLERGEN_WHEAT;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11971j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11971j);
    }
}

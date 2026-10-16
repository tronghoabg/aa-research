package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum al implements com.google.v.eg {
    STRUCTURE_ANY(0),
    STRUCTURE_TOWER(1),
    STRUCTURE_DOME(2),
    STRUCTURE_CASTLE(3),
    STRUCTURE_SHRINE(4),
    STRUCTURE_TEMPLE(5),
    STRUCTURE_TANK(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f11114i;

    al(int i2) {
        this.f11114i = i2;
    }

    public static al a(int i2) {
        switch (i2) {
            case 0:
                return STRUCTURE_ANY;
            case 1:
                return STRUCTURE_TOWER;
            case 2:
                return STRUCTURE_DOME;
            case 3:
                return STRUCTURE_CASTLE;
            case 4:
                return STRUCTURE_SHRINE;
            case 5:
                return STRUCTURE_TEMPLE;
            case 6:
                return STRUCTURE_TANK;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11114i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11114i);
    }
}

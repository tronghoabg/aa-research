package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum fk implements com.google.v.eg {
    UNKNOWN_LOGICAL_COLOR(1),
    WHITE(2),
    YELLOW(3),
    RED(4),
    GREEN(5),
    BLUE(6),
    BLACK(7),
    GREY(8),
    ORANGE(9);


    /* renamed from: k, reason: collision with root package name */
    private final int f11816k;

    fk(int i2) {
        this.f11816k = i2;
    }

    public static fk a(int i2) {
        switch (i2) {
            case 1:
                return UNKNOWN_LOGICAL_COLOR;
            case 2:
                return WHITE;
            case 3:
                return YELLOW;
            case 4:
                return RED;
            case 5:
                return GREEN;
            case 6:
                return BLUE;
            case 7:
                return BLACK;
            case 8:
                return GREY;
            case 9:
                return ORANGE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11816k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11816k);
    }
}

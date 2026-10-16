package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ae implements com.google.v.eg {
    STATUS_NORMAL(1),
    STATUS_DISPUTED(2),
    STATUS_UNSURVEYED(3),
    STATUS_INTERNATIONAL_WATER(4),
    STATUS_NEVER_DISPLAY(5),
    STATUS_TREATY(6),
    STATUS_PROVISIONAL(7),
    STATUS_NO_LABEL(8);


    /* renamed from: j, reason: collision with root package name */
    private final int f11105j;

    ae(int i2) {
        this.f11105j = i2;
    }

    public static ae a(int i2) {
        switch (i2) {
            case 1:
                return STATUS_NORMAL;
            case 2:
                return STATUS_DISPUTED;
            case 3:
                return STATUS_UNSURVEYED;
            case 4:
                return STATUS_INTERNATIONAL_WATER;
            case 5:
                return STATUS_NEVER_DISPLAY;
            case 6:
                return STATUS_TREATY;
            case 7:
                return STATUS_PROVISIONAL;
            case 8:
                return STATUS_NO_LABEL;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11105j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11105j);
    }
}

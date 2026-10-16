package defpackage;

/* loaded from: classes.dex */
public enum yyf implements abnz {
    UNKNOWN_GEAR(-1),
    GEAR_NEUTRAL(0),
    GEAR_1(1),
    GEAR_2(2),
    GEAR_3(3),
    GEAR_4(4),
    GEAR_5(5),
    GEAR_6(6),
    GEAR_DRIVE(10),
    GEAR_PARK(11),
    GEAR_REVERSE(12);

    public final int l;

    yyf(int i) {
        this.l = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}

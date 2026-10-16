package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum yzk implements defpackage.abpb {
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

    yzk(int i) {
        this.l = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}

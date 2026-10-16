package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lir {
    public static final lir a;
    public static final lir b;
    public static final lir c;
    private static final /* synthetic */ lir[] d;

    static {
        lir lirVar = new lir("CAR_MOVING", 0);
        a = lirVar;
        lir lirVar2 = new lir("CAR_PARKED", 1);
        b = lirVar2;
        lir lirVar3 = new lir("UNKNOWN", 2);
        c = lirVar3;
        d = new lir[]{lirVar, lirVar2, lirVar3};
    }

    public static lir valueOf(String str) {
        return (lir) Enum.valueOf(lir.class, str);
    }

    public static lir[] values() {
        return (lir[]) d.clone();
    }
}

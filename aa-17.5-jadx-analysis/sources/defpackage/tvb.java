package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class tvb {
    public static final tvb a;
    public static final tvb b;
    public static final tvb c;
    public static final tvb d;
    private static final /* synthetic */ tvb[] e;

    static {
        tvb tvbVar = new tvb("PAN", 0);
        a = tvbVar;
        tvb tvbVar2 = new tvb("ZOOM", 1);
        b = tvbVar2;
        tvb tvbVar3 = new tvb("ROTATE", 2);
        c = tvbVar3;
        tvb tvbVar4 = new tvb("TILT", 3);
        d = tvbVar4;
        e = new tvb[]{tvbVar, tvbVar2, tvbVar3, tvbVar4};
    }

    public static tvb valueOf(String str) {
        return (tvb) Enum.valueOf(tvb.class, str);
    }

    public static tvb[] values() {
        return (tvb[]) e.clone();
    }
}

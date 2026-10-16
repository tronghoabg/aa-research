package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rkf {
    public static final defpackage.rkf a;
    public static final defpackage.rkf b;
    public static final defpackage.rkf c;
    private static final /* synthetic */ defpackage.rkf[] d;

    static {
        defpackage.rkf rkfVar = new defpackage.rkf("UNKNOWN", 0);
        a = rkfVar;
        defpackage.rkf rkfVar2 = new defpackage.rkf("NAVIGATION", 1);
        b = rkfVar2;
        defpackage.rkf rkfVar3 = new defpackage.rkf("TURN_CARD", 2);
        c = rkfVar3;
        d = new defpackage.rkf[]{rkfVar, rkfVar2, rkfVar3};
    }

    public static defpackage.rkf valueOf(java.lang.String str) {
        return (defpackage.rkf) java.lang.Enum.valueOf(defpackage.rkf.class, str);
    }

    public static defpackage.rkf[] values() {
        return (defpackage.rkf[]) d.clone();
    }
}

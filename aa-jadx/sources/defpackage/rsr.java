package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rsr {
    public static final defpackage.rsr a;
    public static final defpackage.rsr b;
    public static final defpackage.rsr c;
    private static final /* synthetic */ defpackage.rsr[] d;

    static {
        defpackage.rsr rsrVar = new defpackage.rsr("STARTED", 0);
        a = rsrVar;
        defpackage.rsr rsrVar2 = new defpackage.rsr("COMPLETED", 1);
        b = rsrVar2;
        defpackage.rsr rsrVar3 = new defpackage.rsr("FAILED", 2);
        c = rsrVar3;
        d = new defpackage.rsr[]{rsrVar, rsrVar2, rsrVar3};
    }

    public static defpackage.rsr valueOf(java.lang.String str) {
        return (defpackage.rsr) java.lang.Enum.valueOf(defpackage.rsr.class, str);
    }

    public static defpackage.rsr[] values() {
        return (defpackage.rsr[]) d.clone();
    }
}

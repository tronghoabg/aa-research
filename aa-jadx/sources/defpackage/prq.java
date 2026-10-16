package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class prq {
    public static final defpackage.prq a;
    public static final defpackage.prq b;
    public static final defpackage.prq c;
    private static final /* synthetic */ defpackage.prq[] d;

    static {
        defpackage.prq prqVar = new defpackage.prq("UNKNOWN", 0);
        a = prqVar;
        defpackage.prq prqVar2 = new defpackage.prq("GWS", 1);
        b = prqVar2;
        defpackage.prq prqVar3 = new defpackage.prq("PHENOTYPE", 2);
        c = prqVar3;
        d = new defpackage.prq[]{prqVar, prqVar2, prqVar3};
    }

    public static defpackage.prq valueOf(java.lang.String str) {
        return (defpackage.prq) java.lang.Enum.valueOf(defpackage.prq.class, str);
    }

    public static defpackage.prq[] values() {
        return (defpackage.prq[]) d.clone();
    }
}

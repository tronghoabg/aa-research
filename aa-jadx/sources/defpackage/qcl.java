package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qcl {
    public static final defpackage.qcl a;
    public static final defpackage.qcl b;
    public static final defpackage.qcl c;
    public static final defpackage.qcl d;
    public static final defpackage.qcl e;
    public static final defpackage.qcl f;
    private static final /* synthetic */ defpackage.qcl[] g;

    static {
        defpackage.qcl qclVar = new defpackage.qcl("NOT_CACHED", 0);
        a = qclVar;
        defpackage.qcl qclVar2 = new defpackage.qcl("MEMORY", 1);
        b = qclVar2;
        defpackage.qcl qclVar3 = new defpackage.qcl("SQLITE", 2);
        c = qclVar3;
        defpackage.qcl qclVar4 = new defpackage.qcl("OFFROAD", 3);
        d = qclVar4;
        defpackage.qcl qclVar5 = new defpackage.qcl("NETWORK", 4);
        e = qclVar5;
        defpackage.qcl qclVar6 = new defpackage.qcl("NETWORK_UPDATE", 5);
        f = qclVar6;
        g = new defpackage.qcl[]{qclVar, qclVar2, qclVar3, qclVar4, qclVar5, qclVar6};
    }

    public static defpackage.qcl valueOf(java.lang.String str) {
        return (defpackage.qcl) java.lang.Enum.valueOf(defpackage.qcl.class, str);
    }

    public static defpackage.qcl[] values() {
        return (defpackage.qcl[]) g.clone();
    }
}

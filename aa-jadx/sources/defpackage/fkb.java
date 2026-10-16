package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fkb {
    public static final defpackage.fkb a;
    public static final defpackage.fkb b;
    public static final defpackage.fkb c;
    public static final defpackage.fkb d;
    public static final defpackage.fkb e;
    public static final defpackage.fkb f;
    private static final /* synthetic */ defpackage.fkb[] g;

    static {
        defpackage.fkb fkbVar = new defpackage.fkb("ENQUEUED", 0);
        a = fkbVar;
        defpackage.fkb fkbVar2 = new defpackage.fkb("RUNNING", 1);
        b = fkbVar2;
        defpackage.fkb fkbVar3 = new defpackage.fkb("SUCCEEDED", 2);
        c = fkbVar3;
        defpackage.fkb fkbVar4 = new defpackage.fkb("FAILED", 3);
        d = fkbVar4;
        defpackage.fkb fkbVar5 = new defpackage.fkb("BLOCKED", 4);
        e = fkbVar5;
        defpackage.fkb fkbVar6 = new defpackage.fkb("CANCELLED", 5);
        f = fkbVar6;
        defpackage.fkb[] fkbVarArr = {fkbVar, fkbVar2, fkbVar3, fkbVar4, fkbVar5, fkbVar6};
        g = fkbVarArr;
        defpackage.afga.p(fkbVarArr);
    }

    public static defpackage.fkb valueOf(java.lang.String str) {
        return (defpackage.fkb) java.lang.Enum.valueOf(defpackage.fkb.class, str);
    }

    public static defpackage.fkb[] values() {
        return (defpackage.fkb[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}

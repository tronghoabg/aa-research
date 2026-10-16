package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gkn {
    public static final defpackage.gkn a;
    public static final defpackage.gkn b;
    private static final /* synthetic */ defpackage.gkn[] c;

    static {
        defpackage.gkn gknVar = new defpackage.gkn("CENTER", 0);
        a = gknVar;
        defpackage.gkn gknVar2 = new defpackage.gkn("START", 1);
        b = gknVar2;
        defpackage.gkn[] gknVarArr = {gknVar, gknVar2};
        c = gknVarArr;
        defpackage.afga.p(gknVarArr);
    }

    public static defpackage.gkn valueOf(java.lang.String str) {
        return (defpackage.gkn) java.lang.Enum.valueOf(defpackage.gkn.class, str);
    }

    public static defpackage.gkn[] values() {
        return (defpackage.gkn[]) c.clone();
    }
}

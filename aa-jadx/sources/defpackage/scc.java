package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class scc {
    public static final defpackage.scc a;
    public static final defpackage.scc b;
    private static final /* synthetic */ defpackage.scc[] c;

    static {
        defpackage.scc sccVar = new defpackage.scc("STATUS", 0);
        a = sccVar;
        defpackage.scc sccVar2 = new defpackage.scc("ERROR", 1);
        b = sccVar2;
        c = new defpackage.scc[]{sccVar, sccVar2};
    }

    public static defpackage.scc valueOf(java.lang.String str) {
        return (defpackage.scc) java.lang.Enum.valueOf(defpackage.scc.class, str);
    }

    public static defpackage.scc[] values() {
        return (defpackage.scc[]) c.clone();
    }
}

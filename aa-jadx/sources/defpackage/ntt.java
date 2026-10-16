package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class ntt {
    public static final defpackage.ntt a;
    public static final defpackage.ntt b;
    private static final /* synthetic */ defpackage.ntt[] c;

    static {
        defpackage.ntt nttVar = new defpackage.ntt("SHOW_4G_FOR_LTE", 0);
        a = nttVar;
        defpackage.ntt nttVar2 = new defpackage.ntt("HIDE_LTE_PLUS", 1);
        b = nttVar2;
        c = new defpackage.ntt[]{nttVar, nttVar2};
    }

    public static defpackage.ntt valueOf(java.lang.String str) {
        return (defpackage.ntt) java.lang.Enum.valueOf(defpackage.ntt.class, str);
    }

    public static defpackage.ntt[] values() {
        return (defpackage.ntt[]) c.clone();
    }
}

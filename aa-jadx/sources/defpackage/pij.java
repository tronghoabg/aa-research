package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pij {
    public static final defpackage.pij a;
    public static final defpackage.pij b;
    public static final defpackage.pij c;
    private static final /* synthetic */ defpackage.pij[] d;

    static {
        defpackage.pij pijVar = new defpackage.pij("UNINITIALIZED", 0);
        a = pijVar;
        defpackage.pij pijVar2 = new defpackage.pij("STARTED", 1);
        b = pijVar2;
        defpackage.pij pijVar3 = new defpackage.pij("STOPPED", 2);
        c = pijVar3;
        d = new defpackage.pij[]{pijVar, pijVar2, pijVar3};
    }

    public static defpackage.pij valueOf(java.lang.String str) {
        return (defpackage.pij) java.lang.Enum.valueOf(defpackage.pij.class, str);
    }

    public static defpackage.pij[] values() {
        return (defpackage.pij[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class pka {
    public static final defpackage.pka a;
    public static final defpackage.pka b;
    public static final defpackage.pka c;
    public static final defpackage.pka d;
    private static final /* synthetic */ defpackage.pka[] e;

    static {
        defpackage.pka pkaVar = new defpackage.pka("NEW", 0);
        a = pkaVar;
        defpackage.pka pkaVar2 = new defpackage.pka("REGISTERING", 1);
        b = pkaVar2;
        defpackage.pka pkaVar3 = new defpackage.pka("ACTIVE", 2);
        c = pkaVar3;
        defpackage.pka pkaVar4 = new defpackage.pka("DESTROYED", 3);
        d = pkaVar4;
        e = new defpackage.pka[]{pkaVar, pkaVar2, pkaVar3, pkaVar4};
    }

    public static defpackage.pka valueOf(java.lang.String str) {
        return (defpackage.pka) java.lang.Enum.valueOf(defpackage.pka.class, str);
    }

    public static defpackage.pka[] values() {
        return (defpackage.pka[]) e.clone();
    }
}

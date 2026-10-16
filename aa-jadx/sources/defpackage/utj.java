package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class utj {
    public static final defpackage.utj a;
    public static final defpackage.utj b;
    public static final defpackage.utj c;
    public static final defpackage.utj d;
    public static final defpackage.utj e;
    public static final int f;
    private static final /* synthetic */ defpackage.utj[] g;

    static {
        defpackage.utj utjVar = new defpackage.utj("NEXT", 0);
        a = utjVar;
        defpackage.utj utjVar2 = new defpackage.utj("X", 1);
        b = utjVar2;
        defpackage.utj utjVar3 = new defpackage.utj("Y", 2);
        c = utjVar3;
        defpackage.utj utjVar4 = new defpackage.utj("WIDTH", 3);
        d = utjVar4;
        defpackage.utj utjVar5 = new defpackage.utj("HEIGHT", 4);
        e = utjVar5;
        g = new defpackage.utj[]{utjVar, utjVar2, utjVar3, utjVar4, utjVar5};
        f = values().length;
    }

    public static defpackage.utj valueOf(java.lang.String str) {
        return (defpackage.utj) java.lang.Enum.valueOf(defpackage.utj.class, str);
    }

    public static defpackage.utj[] values() {
        return (defpackage.utj[]) g.clone();
    }

    final int a(int[] iArr, int i) {
        return iArr[(i * f) + ordinal()];
    }

    final void b(int[] iArr, int i, int i2) {
        iArr[(i * f) + ordinal()] = i2;
    }
}

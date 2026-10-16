package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class utk {
    public static final defpackage.utk a;
    public static final defpackage.utk b;
    public static final defpackage.utk c;
    public static final defpackage.utk d;
    public static final defpackage.utk e;
    public static final defpackage.utk f;
    public static final int g;
    private static final /* synthetic */ defpackage.utk[] h;

    static {
        defpackage.utk utkVar = new defpackage.utk("NEXT", 0);
        a = utkVar;
        defpackage.utk utkVar2 = new defpackage.utk("PREV", 1);
        b = utkVar2;
        defpackage.utk utkVar3 = new defpackage.utk("Y", 2);
        c = utkVar3;
        defpackage.utk utkVar4 = new defpackage.utk("HEIGHT", 3);
        d = utkVar4;
        defpackage.utk utkVar5 = new defpackage.utk("CELL_COUNT", 4);
        e = utkVar5;
        defpackage.utk utkVar6 = new defpackage.utk("HOLE_LIMIT", 5);
        f = utkVar6;
        h = new defpackage.utk[]{utkVar, utkVar2, utkVar3, utkVar4, utkVar5, utkVar6};
        g = values().length;
    }

    public static defpackage.utk valueOf(java.lang.String str) {
        return (defpackage.utk) java.lang.Enum.valueOf(defpackage.utk.class, str);
    }

    public static defpackage.utk[] values() {
        return (defpackage.utk[]) h.clone();
    }

    final int a(int[] iArr, int i) {
        return iArr[(i * g) + ordinal()];
    }

    final void b(int[] iArr, int i, int i2) {
        iArr[(i * g) + ordinal()] = i2;
    }
}

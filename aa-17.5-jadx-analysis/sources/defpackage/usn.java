package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class usn {
    public static final usn a;
    public static final usn b;
    public static final usn c;
    public static final usn d;
    public static final usn e;
    public static final int f;
    private static final /* synthetic */ usn[] g;

    static {
        usn usnVar = new usn("NEXT", 0);
        a = usnVar;
        usn usnVar2 = new usn("X", 1);
        b = usnVar2;
        usn usnVar3 = new usn("Y", 2);
        c = usnVar3;
        usn usnVar4 = new usn("WIDTH", 3);
        d = usnVar4;
        usn usnVar5 = new usn("HEIGHT", 4);
        e = usnVar5;
        g = new usn[]{usnVar, usnVar2, usnVar3, usnVar4, usnVar5};
        f = values().length;
    }

    public static usn valueOf(String str) {
        return (usn) Enum.valueOf(usn.class, str);
    }

    public static usn[] values() {
        return (usn[]) g.clone();
    }

    final int a(int[] iArr, int i) {
        return iArr[(i * f) + ordinal()];
    }

    final void b(int[] iArr, int i, int i2) {
        iArr[(i * f) + ordinal()] = i2;
    }
}

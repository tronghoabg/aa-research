package defpackage;

/* loaded from: classes3.dex */
public final class aasj extends abnv implements abox {
    public static final aasj a;

    static {
        aasj aasjVar = new aasj();
        a = aasjVar;
        abnv.P(aasj.class, aasjVar);
    }

    private aasj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aasj();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(aasj.class);
    }
}

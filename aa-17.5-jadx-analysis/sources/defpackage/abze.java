package defpackage;

/* loaded from: classes3.dex */
public final class abze extends abnv implements abox {
    public static final abze a;
    public int b;

    static {
        abze abzeVar = new abze();
        a = abzeVar;
        abnv.P(abze.class, abzeVar);
    }

    private abze() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abze();
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
        return abnv.L(abze.class);
    }
}

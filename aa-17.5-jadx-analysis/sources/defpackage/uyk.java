package defpackage;

/* loaded from: classes3.dex */
public final class uyk extends abnv implements abox {
    public static final uyk a;
    public abod b = abnw.a;

    static {
        uyk uykVar = new uyk();
        a = uykVar;
        abnv.P(uyk.class, uykVar);
    }

    private uyk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new uyk();
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
        return abnv.L(uyk.class);
    }
}

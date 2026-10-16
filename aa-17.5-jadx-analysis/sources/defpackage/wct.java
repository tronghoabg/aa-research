package defpackage;

/* loaded from: classes3.dex */
public final class wct extends abnv implements abox {
    public static final wct a;
    public aboh b = abpf.b;

    static {
        wct wctVar = new wct();
        a = wctVar;
        abnv.P(wct.class, wctVar);
    }

    private wct() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new wct();
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
        return abnv.L(wct.class);
    }
}

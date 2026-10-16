package defpackage;

/* loaded from: classes2.dex */
public final class oto extends abnv implements abox {
    public static final oto a;
    public static final abnh c;
    public int b;
    private int d;

    static {
        oto otoVar = new oto();
        a = otoVar;
        abnv.P(oto.class, otoVar);
        c = abnv.W(osn.a, otoVar, otoVar, null, 108, abqd.MESSAGE);
    }

    private oto() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new oto();
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
        return abnv.L(oto.class);
    }
}

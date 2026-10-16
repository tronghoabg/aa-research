package defpackage;

/* loaded from: classes2.dex */
public final class orw extends abnv implements abox {
    public static final orw a;
    public static final abnh c;
    public boolean b;
    private int d;

    static {
        orw orwVar = new orw();
        a = orwVar;
        abnv.P(orw.class, orwVar);
        c = abnv.W(osn.a, orwVar, orwVar, null, 102, abqd.MESSAGE);
    }

    private orw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new orw();
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
        return abnv.L(orw.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class aass extends abnv implements abox {
    public static final aass a;
    public boolean b;
    private int c;

    static {
        aass aassVar = new aass();
        a = aassVar;
        abnv.P(aass.class, aassVar);
    }

    private aass() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new aass();
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
        return abnv.L(aass.class);
    }
}

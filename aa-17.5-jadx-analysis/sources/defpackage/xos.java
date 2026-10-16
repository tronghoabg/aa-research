package defpackage;

/* loaded from: classes3.dex */
public final class xos extends abnv implements abox {
    public static final xos a;
    public int b;
    public int c;

    static {
        xos xosVar = new xos();
        a = xosVar;
        abnv.P(xos.class, xosVar);
    }

    private xos() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xos();
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
        return abnv.L(xos.class);
    }
}

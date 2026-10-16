package defpackage;

/* loaded from: classes2.dex */
public final class osb extends abnv implements abox {
    public static final osb a;
    public int b;
    public abpt c;
    public osi d;
    public osg e;
    public osf f;

    static {
        osb osbVar = new osb();
        a = osbVar;
        abnv.P(osb.class, osbVar);
    }

    private osb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new osb();
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
        return abnv.L(osb.class);
    }
}

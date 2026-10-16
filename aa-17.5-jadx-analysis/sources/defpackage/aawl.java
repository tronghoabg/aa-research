package defpackage;

/* loaded from: classes3.dex */
public final class aawl extends abnv implements abox {
    public static final aawl a;
    public boolean b;
    private int c;

    static {
        aawl aawlVar = new aawl();
        a = aawlVar;
        abnv.P(aawl.class, aawlVar);
    }

    private aawl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0014\u0014\u0001\u0000\u0000\u0000\u0014ဇ\u0013", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new aawl();
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
        return abnv.L(aawl.class);
    }
}

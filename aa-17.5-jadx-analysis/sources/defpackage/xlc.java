package defpackage;

/* loaded from: classes3.dex */
public final class xlc extends abnv implements abox {
    public static final xlc a;
    public int b;
    public xld c;
    public String d = "";
    public long e;

    static {
        xlc xlcVar = new xlc();
        a = xlcVar;
        abnv.P(xlc.class, xlcVar);
    }

    private xlc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xlc();
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
        return abnv.L(xlc.class);
    }
}

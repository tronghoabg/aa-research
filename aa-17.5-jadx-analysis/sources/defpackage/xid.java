package defpackage;

/* loaded from: classes3.dex */
public final class xid extends abnv implements abox {
    public static final xid a;
    public int b;
    public int c;
    public aboh d = abpf.b;

    static {
        xid xidVar = new xid();
        a = xidVar;
        abnv.P(xid.class, xidVar);
    }

    private xid() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", tap.j, "d", xic.class});
        }
        if (i2 == 3) {
            return new xid();
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
        return abnv.L(xid.class);
    }
}

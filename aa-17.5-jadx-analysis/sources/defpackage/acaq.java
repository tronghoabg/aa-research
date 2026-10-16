package defpackage;

/* loaded from: classes3.dex */
public final class acaq extends abnv implements abox {
    public static final acaq a;
    public int b;
    public long c;
    public aboh d = abpf.b;
    public abms e = abms.d;

    static {
        acaq acaqVar = new acaq();
        a = acaqVar;
        abnv.P(acaq.class, acaqVar);
    }

    private acaq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002", new Object[]{"b", "c", "d", acap.class, "e"});
        }
        if (i2 == 3) {
            return new acaq();
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
        return abnv.L(acaq.class);
    }
}

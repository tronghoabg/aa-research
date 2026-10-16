package defpackage;

/* loaded from: classes3.dex */
public final class zbh extends abnv implements abox {
    public static final zbh a;
    public int b;
    public int c;
    public int d;
    public zax e;

    static {
        zbh zbhVar = new zbh();
        a = zbhVar;
        abnv.P(zbh.class, zbhVar);
    }

    private zbh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", ywl.m, "d", ywl.l, "e"});
        }
        if (i2 == 3) {
            return new zbh();
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
        return abnv.L(zbh.class);
    }
}

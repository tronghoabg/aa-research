package defpackage;

/* loaded from: classes2.dex */
public final class rrk extends abnv implements abox {
    public static final rrk a;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        rrk rrkVar = new rrk();
        a = rrkVar;
        abnv.P(rrk.class, rrkVar);
    }

    private rrk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", ywl.d});
        }
        if (i2 == 3) {
            return new rrk();
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
        return abnv.L(rrk.class);
    }
}

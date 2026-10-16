package defpackage;

/* loaded from: classes2.dex */
public final class ose extends abnv implements abox {
    public static final ose a;
    public int b;
    public String c = "";
    public osd d;
    public ory e;

    static {
        ose oseVar = new ose();
        a = oseVar;
        abnv.P(ose.class, oseVar);
    }

    private ose() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ose();
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
        return abnv.L(ose.class);
    }
}

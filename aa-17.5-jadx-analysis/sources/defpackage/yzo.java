package defpackage;

/* loaded from: classes3.dex */
public final class yzo extends abnv implements abox {
    public static final yzo a;
    public int b;
    public aboh c = abpf.b;
    public long d;
    public long e;

    static {
        yzo yzoVar = new yzo();
        a = yzoVar;
        abnv.P(yzo.class, yzoVar);
    }

    private yzo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဂ\u0001", new Object[]{"b", "c", yzp.class, "d", "e"});
        }
        if (i2 == 3) {
            return new yzo();
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
        return abnv.L(yzo.class);
    }
}

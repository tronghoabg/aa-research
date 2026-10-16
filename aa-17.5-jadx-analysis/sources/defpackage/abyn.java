package defpackage;

/* loaded from: classes3.dex */
public final class abyn extends abnv implements abox {
    public static final abyn a;
    public int b;
    public abyj c;
    public abxu d;
    public abxx e;
    public abyo f;
    public aboh g = abpf.b;
    public abod h = abnw.a;
    public abyk i;

    static {
        abyn abynVar = new abyn();
        a = abynVar;
        abnv.P(abyn.class, abynVar);
    }

    private abyn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0007,\tဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", abyt.class, "h", "i"});
        }
        if (i2 == 3) {
            return new abyn();
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
        return abnv.L(abyn.class);
    }
}

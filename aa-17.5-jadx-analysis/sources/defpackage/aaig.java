package defpackage;

/* loaded from: classes3.dex */
public final class aaig extends abnv implements abox {
    public static final aaig a;
    public int b;
    public aaih c;
    public aaij d;
    public aaik e;
    public float f;
    public aaii g;

    static {
        aaig aaigVar = new aaig();
        a = aaigVar;
        abnv.P(aaig.class, aaigVar);
    }

    private aaig() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ခ\u0003\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new aaig();
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
        return abnv.L(aaig.class);
    }
}

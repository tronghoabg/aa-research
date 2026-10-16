package defpackage;

/* loaded from: classes3.dex */
public final class aaij extends abnv implements abox {
    public static final aaij a;
    public int b;
    public float c;
    public float d;
    public float e;

    static {
        aaij aaijVar = new aaij();
        a = aaijVar;
        abnv.P(aaij.class, aaijVar);
    }

    private aaij() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new aaij();
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
        return abnv.L(aaij.class);
    }
}

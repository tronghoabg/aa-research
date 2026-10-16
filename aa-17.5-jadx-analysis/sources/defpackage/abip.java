package defpackage;

/* loaded from: classes3.dex */
public final class abip extends abnv implements abox {
    public static final abip a;
    public abod b = abnw.a;
    public float c;
    private int d;

    static {
        abip abipVar = new abip();
        a = abipVar;
        abnv.P(abip.class, abipVar);
    }

    private abip() {
        abne abneVar = abne.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002ခ\u0000", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abip();
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
        return abnv.L(abip.class);
    }
}

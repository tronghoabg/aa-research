package defpackage;

/* loaded from: classes3.dex */
public final class abyu extends abnv implements abox {
    public static final abyu a;
    public abod b = abnw.a;
    public abxn c;
    private int d;

    static {
        abyu abyuVar = new abyu();
        a = abyuVar;
        abnv.P(abyu.class, abyuVar);
    }

    private abyu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002ဉ\u0000", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abyu();
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
        return abnv.L(abyu.class);
    }
}

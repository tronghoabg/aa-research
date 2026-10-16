package defpackage;

/* loaded from: classes3.dex */
public final class abey extends abnv implements abox {
    public static final abey a;
    public abex b;
    public abex c;
    private int d;

    static {
        abey abeyVar = new abey();
        a = abeyVar;
        abnv.P(abey.class, abeyVar);
    }

    private abey() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abey();
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
        return abnv.L(abey.class);
    }
}

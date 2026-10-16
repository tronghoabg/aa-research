package defpackage;

/* loaded from: classes2.dex */
public final class ajgv extends abnv implements abox {
    public static final ajgv a;
    public int b;
    public long c;
    public int d;

    static {
        ajgv ajgvVar = new ajgv();
        a = ajgvVar;
        abnv.P(ajgv.class, ajgvVar);
    }

    private ajgv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", xln.o});
        }
        if (i2 == 3) {
            return new ajgv();
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
        return abnv.L(ajgv.class);
    }
}

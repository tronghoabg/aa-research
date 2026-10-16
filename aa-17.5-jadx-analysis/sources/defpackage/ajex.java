package defpackage;

/* loaded from: classes2.dex */
public final class ajex extends abnv implements abox {
    public static final ajex a;
    public int b;
    public int c;
    public abnf d;
    public long e;
    public int f;

    static {
        ajex ajexVar = new ajex();
        a = ajexVar;
        abnv.P(ajex.class, ajexVar);
    }

    private ajex() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003စ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", achi.o});
        }
        if (i2 == 3) {
            return new ajex();
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
        return abnv.L(ajex.class);
    }
}

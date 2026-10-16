package defpackage;

/* loaded from: classes3.dex */
public final class absi extends abnv implements abox {
    public static final absi a;
    public int b;
    public int c;
    public int d;
    public long e;
    public absg f;
    public float g;
    public int h;
    public int i;

    static {
        absi absiVar = new absi();
        a = absiVar;
        abnv.P(absi.class, absiVar);
    }

    private absi() {
        abnw abnwVar = abnw.a;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\u0019\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0005ဉ\u0004\u0007ခ\u0007\t᠌\u000f\u0019᠌\u0015", new Object[]{"b", "c", absk.a, "d", abho.u, "e", "f", "g", "h", absk.b, "i", absk.c});
        }
        if (i2 == 3) {
            return new absi();
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
        return abnv.L(absi.class);
    }
}

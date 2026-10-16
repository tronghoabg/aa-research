package defpackage;

/* loaded from: classes2.dex */
public final class ajfz extends abnv implements abox {
    public static final ajfz a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        ajfz ajfzVar = new ajfz();
        a = ajfzVar;
        abnv.P(ajfz.class, ajfzVar);
    }

    private ajfz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002>\u0000\u0003᠌\u0001\u0004<\u0000", new Object[]{"d", "c", "b", "e", xln.p, ajfy.class});
        }
        if (i2 == 3) {
            return new ajfz();
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
        return abnv.L(ajfz.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class abyf extends abnv implements abox {
    public static final abyf a;
    public int b;
    public abyr c;
    public abzb d;

    static {
        abyf abyfVar = new abyf();
        a = abyfVar;
        abnv.P(abyf.class, abyfVar);
    }

    private abyf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abyf();
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
        return abnv.L(abyf.class);
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class orz extends abnv implements abox {
    public static final orz a;
    public int b;
    public String c = "";
    public abpt d;
    public osj e;
    public osl f;
    public int g;

    static {
        orz orzVar = new orz();
        a = orzVar;
        abnv.P(orz.class, orzVar);
    }

    private orz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new orz();
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
        return abnv.L(orz.class);
    }
}

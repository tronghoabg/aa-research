package defpackage;

/* loaded from: classes2.dex */
public final class pbm extends abnv implements abox {
    public static final pbm a;
    public int b;
    public int f;
    public String c = "";
    public String d = "";
    public String e = "";
    public abod g = abnw.a;

    static {
        pbm pbmVar = new pbm();
        a = pbmVar;
        abnv.P(pbm.class, pbmVar);
    }

    private pbm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0007'", new Object[]{"b", "c", "d", "e", "f", xou.k, "g"});
        }
        if (i2 == 3) {
            return new pbm();
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
        return abnv.L(pbm.class);
    }
}

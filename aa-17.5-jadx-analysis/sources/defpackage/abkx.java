package defpackage;

/* loaded from: classes3.dex */
public final class abkx extends abnv implements abox {
    public static final abkx a;
    public int b;
    public ablp c;
    public String d = "";

    static {
        abkx abkxVar = new abkx();
        a = abkxVar;
        abnv.P(abkx.class, abkxVar);
    }

    private abkx() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u000f\u0002\u0000\u0000\u0000\u0001ဈ\u0001\u000fဉ\u0000", new Object[]{"b", "d", "c"});
        }
        if (i2 == 3) {
            return new abkx();
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
        return abnv.L(abkx.class);
    }
}

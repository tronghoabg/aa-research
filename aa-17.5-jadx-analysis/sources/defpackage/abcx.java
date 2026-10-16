package defpackage;

/* loaded from: classes3.dex */
public final class abcx extends abnv implements abox {
    public static final abcx a;
    public String b = "";
    public int c;
    private int d;

    static {
        abcx abcxVar = new abcx();
        a = abcxVar;
        abnv.P(abcx.class, abcxVar);
    }

    private abcx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abcx();
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
        return abnv.L(abcx.class);
    }
}

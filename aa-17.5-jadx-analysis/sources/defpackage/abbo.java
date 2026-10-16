package defpackage;

/* loaded from: classes3.dex */
public final class abbo extends abnv implements abox {
    public static final abbo a;
    public int b;
    public int c;
    public int e;
    public abms d = abms.d;
    public String f = "";

    static {
        abbo abboVar = new abbo();
        a = abboVar;
        abnv.P(abbo.class, abboVar);
    }

    private abbo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0003ည\u0002\u0004ဆ\u0003\u000bဈ\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abbo();
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
        return abnv.L(abbo.class);
    }
}

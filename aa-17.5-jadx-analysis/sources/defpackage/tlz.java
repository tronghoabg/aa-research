package defpackage;

/* loaded from: classes3.dex */
public final class tlz extends abnv implements abox {
    public static final tlz a;
    public int b;
    public String c = "";
    public abms d = abms.d;

    static {
        tlz tlzVar = new tlz();
        a = tlzVar;
        abnv.P(tlz.class, tlzVar);
    }

    private tlz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new tlz();
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
        return abnv.L(tlz.class);
    }
}

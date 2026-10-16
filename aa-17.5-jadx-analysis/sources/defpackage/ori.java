package defpackage;

/* loaded from: classes2.dex */
public final class ori extends abnv implements abox {
    public static final ori a;
    public int b;
    public int c;
    public String d = "";

    static {
        ori oriVar = new ori();
        a = oriVar;
        abnv.P(ori.class, oriVar);
    }

    private ori() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", orj.c, "d"});
        }
        if (i2 == 3) {
            return new ori();
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
        return abnv.L(ori.class);
    }
}

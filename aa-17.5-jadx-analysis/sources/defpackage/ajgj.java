package defpackage;

/* loaded from: classes2.dex */
public final class ajgj extends abnv implements abox {
    public static final ajgj a;
    public int b;
    public long c;
    public long d;

    static {
        ajgj ajgjVar = new ajgj();
        a = ajgjVar;
        abnv.P(ajgj.class, ajgjVar);
    }

    private ajgj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ajgj();
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
        return abnv.L(ajgj.class);
    }
}

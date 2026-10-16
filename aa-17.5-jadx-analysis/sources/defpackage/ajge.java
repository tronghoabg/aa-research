package defpackage;

/* loaded from: classes3.dex */
public final class ajge extends abnv implements abox {
    public static final ajge a;
    public int b;
    public int c;
    public int d;

    static {
        ajge ajgeVar = new ajge();
        a = ajgeVar;
        abnv.P(ajge.class, ajgeVar);
    }

    private ajge() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", ajfp.c, "d"});
        }
        if (i2 == 3) {
            return new ajge();
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
        return abnv.L(ajge.class);
    }
}

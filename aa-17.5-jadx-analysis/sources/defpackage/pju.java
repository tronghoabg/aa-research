package defpackage;

/* loaded from: classes2.dex */
public final class pju extends abnv implements abox {
    public static final pju a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    private int g;

    static {
        pju pjuVar = new pju();
        a = pjuVar;
        abnv.P(pju.class, pjuVar);
    }

    private pju() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new pju();
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
        return abnv.L(pju.class);
    }
}

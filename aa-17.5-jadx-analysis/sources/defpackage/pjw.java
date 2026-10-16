package defpackage;

/* loaded from: classes2.dex */
public final class pjw extends abnv implements abox {
    public static final pjw a;
    public int b;
    public int c = 1;
    public String d = "";

    static {
        pjw pjwVar = new pjw();
        a = pjwVar;
        abnv.P(pjw.class, pjwVar);
    }

    private pjw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", orj.s, "d"});
        }
        if (i2 == 3) {
            return new pjw();
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
        return abnv.L(pjw.class);
    }
}

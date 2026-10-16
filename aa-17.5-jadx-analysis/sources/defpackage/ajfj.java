package defpackage;

/* loaded from: classes3.dex */
public final class ajfj extends abnv implements abox {
    public static final ajfj a;
    public int b;
    public String c = "";
    public abog d = abor.a;

    static {
        ajfj ajfjVar = new ajfj();
        a = ajfjVar;
        abnv.P(ajfj.class, ajfjVar);
    }

    private ajfj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ajfj();
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
        return abnv.L(ajfj.class);
    }
}

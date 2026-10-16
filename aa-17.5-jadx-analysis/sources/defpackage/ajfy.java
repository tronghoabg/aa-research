package defpackage;

/* loaded from: classes2.dex */
public final class ajfy extends abnv implements abox {
    public static final ajfy a;
    public int b;
    public int c;
    public int d;

    static {
        ajfy ajfyVar = new ajfy();
        a = ajfyVar;
        abnv.P(ajfy.class, ajfyVar);
    }

    private ajfy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ajfy();
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
        return abnv.L(ajfy.class);
    }
}

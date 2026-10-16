package defpackage;

/* loaded from: classes3.dex */
public final class uzu extends abnv implements abox {
    public static final uzu a;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        uzu uzuVar = new uzu();
        a = uzuVar;
        abnv.P(uzu.class, uzuVar);
    }

    private uzu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", "d", tap.f, "e"});
        }
        if (i2 == 3) {
            return new uzu();
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
        return abnv.L(uzu.class);
    }
}

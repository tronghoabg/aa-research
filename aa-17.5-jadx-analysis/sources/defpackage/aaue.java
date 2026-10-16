package defpackage;

/* loaded from: classes3.dex */
public final class aaue extends abnv implements abox {
    public static final aaue a;
    private int b;
    private aaug c;
    private aarj d;

    static {
        aaue aaueVar = new aaue();
        a = aaueVar;
        abnv.P(aaue.class, aaueVar);
    }

    private aaue() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\r\u000f\u0002\u0000\u0000\u0000\rဉ\f\u000fဉ\u000e", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaue();
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
        return abnv.L(aaue.class);
    }
}

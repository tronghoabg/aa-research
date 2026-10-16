package defpackage;

/* loaded from: classes3.dex */
public final class ablf extends abnv implements abox {
    public static final ablf a;
    private int b;
    private znw c;

    static {
        ablf ablfVar = new ablf();
        a = ablfVar;
        abnv.P(ablf.class, ablfVar);
    }

    private ablf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ablf();
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
        return abnv.L(ablf.class);
    }
}

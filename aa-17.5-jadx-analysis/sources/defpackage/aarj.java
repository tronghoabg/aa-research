package defpackage;

/* loaded from: classes3.dex */
public final class aarj extends abnv implements abox {
    public static final aarj a;
    private int b;
    private aaug c;

    static {
        aarj aarjVar = new aarj();
        a = aarjVar;
        abnv.P(aarj.class, aarjVar);
    }

    private aarj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aarj();
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
        return abnv.L(aarj.class);
    }
}

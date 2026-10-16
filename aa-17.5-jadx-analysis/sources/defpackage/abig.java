package defpackage;

/* loaded from: classes3.dex */
public final class abig extends abnv implements abox {
    public static final abig a;
    public int b;
    public int c;

    static {
        abig abigVar = new abig();
        a = abigVar;
        abnv.P(abig.class, abigVar);
    }

    private abig() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abig();
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
        return abnv.L(abig.class);
    }
}

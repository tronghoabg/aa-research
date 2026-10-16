package defpackage;

/* loaded from: classes3.dex */
public final class ablk extends abnv implements abox {
    public static final ablk a;
    private int b;
    private abli c;
    private ablj d;

    static {
        ablk ablkVar = new ablk();
        a = ablkVar;
        abnv.P(ablk.class, ablkVar);
    }

    private ablk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\f\r\u0002\u0000\u0000\u0000\fဉ\u0002\rဉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ablk();
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
        return abnv.L(ablk.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class abue extends abnv implements abox {
    public static final abue a;
    public int b;
    public abud c;

    static {
        abue abueVar = new abue();
        a = abueVar;
        abnv.P(abue.class, abueVar);
    }

    private abue() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abue();
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
        return abnv.L(abue.class);
    }
}

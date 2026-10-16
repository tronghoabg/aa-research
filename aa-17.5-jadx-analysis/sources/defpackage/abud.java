package defpackage;

/* loaded from: classes3.dex */
public final class abud extends abnv implements abox {
    public static final abud a;
    public int b;
    public int c;

    static {
        abud abudVar = new abud();
        a = abudVar;
        abnv.P(abud.class, abudVar);
    }

    private abud() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rင\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abud();
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
        return abnv.L(abud.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class abfx extends abnv implements abox {
    public static final abfx a;
    public int b;
    public int c;
    public int d;

    static {
        abfx abfxVar = new abfx();
        a = abfxVar;
        abnv.P(abfx.class, abfxVar);
    }

    private abfx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abfx();
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
        return abnv.L(abfx.class);
    }
}

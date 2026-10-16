package defpackage;

/* loaded from: classes3.dex */
public final class abfw extends abnv implements abox {
    public static final abfw a;
    public int b;
    public float c = 1.0f;

    static {
        abfw abfwVar = new abfw();
        a = abfwVar;
        abnv.P(abfw.class, abfwVar);
    }

    private abfw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ခ\u0007", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abfw();
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
        return abnv.L(abfw.class);
    }
}

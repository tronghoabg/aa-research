package defpackage;

/* loaded from: classes3.dex */
public final class abem extends abnv implements abox {
    public static final abem a;

    static {
        abem abemVar = new abem();
        a = abemVar;
        abnv.P(abem.class, abemVar);
    }

    private abem() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abem();
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
        return abnv.L(abem.class);
    }
}

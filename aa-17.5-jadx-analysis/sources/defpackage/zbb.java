package defpackage;

/* loaded from: classes3.dex */
public final class zbb extends abnv implements abox {
    public static final zbb a;
    private int b;
    private zap c;

    static {
        zbb zbbVar = new zbb();
        a = zbbVar;
        abnv.P(zbb.class, zbbVar);
    }

    private zbb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0000\u000bဉ\n", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zbb();
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
        return abnv.L(zbb.class);
    }
}

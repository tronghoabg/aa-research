package defpackage;

/* loaded from: classes3.dex */
public final class zke extends abnv implements abox {
    public static final zke a;
    public float b;
    public float c;
    private int d;

    static {
        zke zkeVar = new zke();
        a = zkeVar;
        abnv.P(zke.class, zkeVar);
    }

    private zke() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new zke();
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
        return abnv.L(zke.class);
    }
}

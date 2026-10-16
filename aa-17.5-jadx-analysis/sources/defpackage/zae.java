package defpackage;

/* loaded from: classes.dex */
public final class zae extends abnv implements abox {
    public static final zae a;
    public int b;
    public int c;
    public boolean d;
    public zac e;
    public int f;

    static {
        zae zaeVar = new zae();
        a = zaeVar;
        abnv.P(zae.class, zaeVar);
    }

    private zae() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new zae();
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
        return abnv.L(zae.class);
    }
}

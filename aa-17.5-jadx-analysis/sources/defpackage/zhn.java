package defpackage;

/* loaded from: classes3.dex */
public final class zhn extends abnv implements abox {
    public static final zhn a;
    public abod b = abnw.a;

    static {
        zhn zhnVar = new zhn();
        a = zhnVar;
        abnv.P(zhn.class, zhnVar);
    }

    private zhn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u0016", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new zhn();
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
        return abnv.L(zhn.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class zao extends abnv implements abox {
    public static final zao a;
    private int b;
    private zal c;
    private zal d;
    private zal e;
    private zal f;
    private zal g;
    private zal h;

    static {
        zao zaoVar = new zao();
        a = zaoVar;
        abnv.P(zao.class, zaoVar);
    }

    private zao() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\nဉ\t\u000bဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new zao();
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
        return abnv.L(zao.class);
    }
}

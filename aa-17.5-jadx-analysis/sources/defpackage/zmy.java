package defpackage;

/* loaded from: classes3.dex */
public final class zmy extends abnv implements abox {
    public static final zmy a;

    static {
        zmy zmyVar = new zmy();
        a = zmyVar;
        abnv.P(zmy.class, zmyVar);
    }

    private zmy() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zmy();
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
        return abnv.L(zmy.class);
    }
}

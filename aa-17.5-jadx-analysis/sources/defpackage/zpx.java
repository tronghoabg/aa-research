package defpackage;

/* loaded from: classes3.dex */
public final class zpx extends abnv implements abox {
    public static final zpx a;

    static {
        zpx zpxVar = new zpx();
        a = zpxVar;
        abnv.P(zpx.class, zpxVar);
    }

    private zpx() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zpx();
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
        return abnv.L(zpx.class);
    }
}

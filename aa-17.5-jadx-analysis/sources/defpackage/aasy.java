package defpackage;

/* loaded from: classes3.dex */
public final class aasy extends abnv implements abox {
    public static final aasy a;

    static {
        aasy aasyVar = new aasy();
        a = aasyVar;
        abnv.P(aasy.class, aasyVar);
    }

    private aasy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aasy();
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
        return abnv.L(aasy.class);
    }
}

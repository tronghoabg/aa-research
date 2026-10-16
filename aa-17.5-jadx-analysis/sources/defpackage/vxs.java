package defpackage;

/* loaded from: classes3.dex */
public final class vxs extends abnv implements abox {
    public static final vxs a;
    public static final abnh b;

    static {
        vxs vxsVar = new vxs();
        a = vxsVar;
        abnv.P(vxs.class, vxsVar);
        b = abnv.W(ajfl.a, vxsVar, vxsVar, null, 100, abqd.MESSAGE);
    }

    private vxs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new vxs();
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
        return abnv.L(vxs.class);
    }
}

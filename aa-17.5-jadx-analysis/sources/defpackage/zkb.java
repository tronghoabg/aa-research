package defpackage;

/* loaded from: classes3.dex */
public final class zkb extends abnv implements abox {
    public static final zkb a;

    static {
        zkb zkbVar = new zkb();
        a = zkbVar;
        abnv.P(zkb.class, zkbVar);
    }

    private zkb() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zkb();
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
        return abnv.L(zkb.class);
    }
}

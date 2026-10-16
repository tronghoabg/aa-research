package defpackage;

/* loaded from: classes3.dex */
public final class aclb extends abnv implements abox {
    public static final aclb a;

    static {
        aclb aclbVar = new aclb();
        a = aclbVar;
        abnv.P(aclb.class, aclbVar);
    }

    private aclb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new aclb();
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
        return abnv.L(aclb.class);
    }
}

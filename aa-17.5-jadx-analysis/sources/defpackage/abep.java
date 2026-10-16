package defpackage;

/* loaded from: classes3.dex */
public final class abep extends abnv implements abox {
    public static final abep a;

    static {
        abep abepVar = new abep();
        a = abepVar;
        abnv.P(abep.class, abepVar);
    }

    private abep() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new abep();
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
        return abnv.L(abep.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class abkm extends abnv implements abox {
    public static final abkm a;

    static {
        abkm abkmVar = new abkm();
        a = abkmVar;
        abnv.P(abkm.class, abkmVar);
    }

    private abkm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abkm();
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
        return abnv.L(abkm.class);
    }
}

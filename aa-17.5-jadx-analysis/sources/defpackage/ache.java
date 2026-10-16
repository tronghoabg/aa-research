package defpackage;

/* loaded from: classes3.dex */
public final class ache extends abnv implements abox {
    public static final ache a;

    static {
        ache acheVar = new ache();
        a = acheVar;
        abnv.P(ache.class, acheVar);
    }

    private ache() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new ache();
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
        return abnv.L(ache.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class aayi extends abnv implements abox {
    public static final aayi a;

    static {
        aayi aayiVar = new aayi();
        a = aayiVar;
        abnv.P(aayi.class, aayiVar);
    }

    private aayi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aayi();
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
        return abnv.L(aayi.class);
    }
}

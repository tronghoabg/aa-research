package defpackage;

/* loaded from: classes.dex */
public final class acal extends abnv implements abox {
    public static final acal a;
    public int b;
    public int c;
    public acaj d;
    public acak e;

    static {
        acal acalVar = new acal();
        a = acalVar;
        abnv.P(acal.class, acalVar);
    }

    private acal() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new acal();
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
        return abnv.L(acal.class);
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class ajfc extends abnv implements abox {
    public static final ajfc a;
    public int b;
    public boolean c;

    static {
        ajfc ajfcVar = new ajfc();
        a = ajfcVar;
        abnv.P(ajfc.class, ajfcVar);
    }

    private ajfc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ajfc();
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
        return abnv.L(ajfc.class);
    }
}

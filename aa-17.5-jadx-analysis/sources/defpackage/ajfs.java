package defpackage;

/* loaded from: classes3.dex */
public final class ajfs extends abnv implements abox {
    public static final ajfs a;

    static {
        ajfs ajfsVar = new ajfs();
        a = ajfsVar;
        abnv.P(ajfs.class, ajfsVar);
    }

    private ajfs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new ajfs();
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
        return abnv.L(ajfs.class);
    }
}

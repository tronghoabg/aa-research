package defpackage;

/* loaded from: classes3.dex */
public final class acfk extends abnv implements abox {
    public static final acfk a;
    public int b;
    public int c;

    static {
        acfk acfkVar = new acfk();
        a = acfkVar;
        abnv.P(acfk.class, acfkVar);
    }

    private acfk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0003", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acfk();
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
        return abnv.L(acfk.class);
    }
}

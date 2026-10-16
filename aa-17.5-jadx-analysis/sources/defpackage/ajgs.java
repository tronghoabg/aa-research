package defpackage;

/* loaded from: classes2.dex */
public final class ajgs extends abnv implements abox {
    public static final ajgs a;
    public int b = 0;
    public Object c;

    static {
        ajgs ajgsVar = new ajgs();
        a = ajgsVar;
        abnv.P(ajgs.class, ajgsVar);
    }

    private ajgs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new ajgs();
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
        return abnv.L(ajgs.class);
    }
}

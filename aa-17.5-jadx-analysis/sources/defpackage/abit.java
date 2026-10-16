package defpackage;

/* loaded from: classes3.dex */
public final class abit extends abnv implements abox {
    public static final abit a;
    public long b;
    public abju c;
    private int d;

    static {
        abit abitVar = new abit();
        a = abitVar;
        abnv.P(abit.class, abitVar);
    }

    private abit() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abit();
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
        return abnv.L(abit.class);
    }
}

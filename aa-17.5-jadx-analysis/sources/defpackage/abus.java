package defpackage;

/* loaded from: classes3.dex */
public final class abus extends abnv implements abox {
    public static final abus a;
    public int b;
    public abnf c;
    public abnf d;

    static {
        abus abusVar = new abus();
        a = abusVar;
        abnv.P(abus.class, abusVar);
    }

    private abus() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abus();
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
        return abnv.L(abus.class);
    }
}

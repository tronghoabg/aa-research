package defpackage;

/* loaded from: classes3.dex */
public final class abuq extends abnv implements abox {
    public static final abuq a;
    public int b;
    public abpt c;
    public abnf d;
    public abwl e;
    public abup f;

    static {
        abuq abuqVar = new abuq();
        a = abuqVar;
        abnv.P(abuq.class, abuqVar);
    }

    private abuq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0007ဉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abuq();
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
        return abnv.L(abuq.class);
    }
}

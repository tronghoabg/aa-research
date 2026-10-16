package defpackage;

/* loaded from: classes3.dex */
public final class acdw extends abnv implements abox {
    public static final acdw a;
    public String b = "";
    private int c;

    static {
        acdw acdwVar = new acdw();
        a = acdwVar;
        abnv.P(acdw.class, acdwVar);
    }

    private acdw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0003", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new acdw();
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
        return abnv.L(acdw.class);
    }
}

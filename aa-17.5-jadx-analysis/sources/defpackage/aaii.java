package defpackage;

/* loaded from: classes3.dex */
public final class aaii extends abnv implements abox {
    public static final aaii a;
    public int b;
    public float c;
    public float d;

    static {
        aaii aaiiVar = new aaii();
        a = aaiiVar;
        abnv.P(aaii.class, aaiiVar);
    }

    private aaii() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaii();
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
        return abnv.L(aaii.class);
    }
}

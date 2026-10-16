package defpackage;

/* loaded from: classes3.dex */
public final class abyo extends abnv implements abox {
    public static final abyo a;
    public boolean b;
    public boolean c;

    static {
        abyo abyoVar = new abyo();
        a = abyoVar;
        abnv.P(abyo.class, abyoVar);
    }

    private abyo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abyo();
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
        return abnv.L(abyo.class);
    }
}

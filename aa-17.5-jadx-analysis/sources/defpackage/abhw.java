package defpackage;

/* loaded from: classes3.dex */
public final class abhw extends abnv implements abox {
    public static final abhw a;
    public long b;
    public boolean c;
    private int d;

    static {
        abhw abhwVar = new abhw();
        a = abhwVar;
        abnv.P(abhw.class, abhwVar);
    }

    private abhw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဇ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abhw();
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
        return abnv.L(abhw.class);
    }
}

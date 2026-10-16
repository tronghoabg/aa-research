package defpackage;

/* loaded from: classes3.dex */
public final class abys extends abnv implements abox {
    public static final abys a;
    public int b;
    public String c = "";
    public abxn d;

    static {
        abys abysVar = new abys();
        a = abysVar;
        abnv.P(abys.class, abysVar);
    }

    private abys() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abys();
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
        return abnv.L(abys.class);
    }
}

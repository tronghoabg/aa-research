package defpackage;

/* loaded from: classes3.dex */
public final class abuk extends abnv implements abox {
    public static final abuk a;
    public int b;
    public int c;
    public String d = "";
    public boolean e;

    static {
        abuk abukVar = new abuk();
        a = abukVar;
        abnv.P(abuk.class, abukVar);
    }

    private abuk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abuk();
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
        return abnv.L(abuk.class);
    }
}

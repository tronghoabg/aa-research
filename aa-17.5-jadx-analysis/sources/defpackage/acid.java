package defpackage;

/* loaded from: classes3.dex */
public final class acid extends abnv implements abox {
    public static final acid a;
    public int b;
    public abms c;
    public abms d;

    static {
        acid acidVar = new acid();
        a = acidVar;
        abnv.P(acid.class, acidVar);
    }

    private acid() {
        abms abmsVar = abms.d;
        this.c = abmsVar;
        this.d = abmsVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001;<\u0002\u0000\u0000\u0000;ည\u0000<ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acid();
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
        return abnv.L(acid.class);
    }
}

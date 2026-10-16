package defpackage;

/* loaded from: classes3.dex */
public final class abyr extends abnv implements abox {
    public static final abyr a;
    public int b;
    public abyq c;
    public String d = "";

    static {
        abyr abyrVar = new abyr();
        a = abyrVar;
        abnv.P(abyr.class, abyrVar);
    }

    private abyr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abyr();
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
        return abnv.L(abyr.class);
    }
}

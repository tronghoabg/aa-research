package defpackage;

/* loaded from: classes3.dex */
public final class abur extends abnv implements abox {
    public static final abur a;
    public String b = "";
    public String c = "";
    public String d = "";
    public abod e = abnw.a;

    static {
        abur aburVar = new abur();
        a = aburVar;
        abnv.P(abur.class, aburVar);
    }

    private abur() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abur();
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
        return abnv.L(abur.class);
    }
}

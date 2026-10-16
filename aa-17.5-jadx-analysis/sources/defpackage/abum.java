package defpackage;

/* loaded from: classes3.dex */
public final class abum extends abnv implements abox {
    public static final abum a;
    public int c;
    public String b = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        abum abumVar = new abum();
        a = abumVar;
        abnv.P(abum.class, abumVar);
    }

    private abum() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new abum();
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
        return abnv.L(abum.class);
    }
}

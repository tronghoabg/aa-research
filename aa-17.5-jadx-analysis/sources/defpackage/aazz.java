package defpackage;

/* loaded from: classes3.dex */
public final class aazz extends abnv implements abox {
    public static final aazz a;
    public String b = "";
    public String c;
    public String d;
    public int e;

    static {
        aazz aazzVar = new aazz();
        a = aazzVar;
        abnv.P(aazz.class, aazzVar);
    }

    private aazz() {
        Object[] objArr = abpf.a;
        this.c = "";
        this.d = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0004\u0000\u0000\u0001\t\u0004\u0000\u0000\u0000\u0001Ȉ\u0006Ȉ\u0007Ȉ\t\f", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new aazz();
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
        return abnv.L(aazz.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class aaws extends abnv implements abox {
    public static final aaws a;
    public boolean b;
    public aawr c;
    public boolean d;
    private int e;

    static {
        aaws aawsVar = new aaws();
        a = aawsVar;
        abnv.P(aaws.class, aawsVar);
    }

    private aaws() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0088 \u0003\u0000\u0000\u0000\u0088ဇ\u000f\u0089ဉ\u0010 ဇ\u001d", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaws();
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
        return abnv.L(aaws.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class vut extends abnv implements abox {
    public static final vut a;
    public String b = "";
    public aboh c = abpf.b;
    public boolean d;
    private int e;

    static {
        vut vutVar = new vut();
        a = vutVar;
        abnv.P(vut.class, vutVar);
    }

    private vut() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "b", "c", vus.class, "d"});
        }
        if (i2 == 3) {
            return new vut();
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
        return abnv.L(vut.class);
    }
}

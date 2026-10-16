package defpackage;

/* loaded from: classes3.dex */
public final class acar extends abnv implements abox {
    public static final acar a;
    public int b;
    public int c;
    public long e;
    public long f;
    public String d = "";
    public aboh g = abpf.b;

    static {
        acar acarVar = new acar();
        a = acarVar;
        abnv.P(acar.class, acarVar);
    }

    private acar() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new acar();
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
        return abnv.L(acar.class);
    }
}

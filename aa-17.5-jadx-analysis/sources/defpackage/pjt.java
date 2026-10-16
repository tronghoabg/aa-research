package defpackage;

/* loaded from: classes2.dex */
public final class pjt extends abnv implements abox {
    public static final pjt a;
    public int b;
    public aboh c = abpf.b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;

    static {
        pjt pjtVar = new pjt();
        a = pjtVar;
        abnv.P(pjt.class, pjtVar);
    }

    private pjt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\n\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0004င\u0002\u0005င\u0003\bဂ\u0006\tဂ\u0007\nဂ\b", new Object[]{"b", "c", pju.class, "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new pjt();
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
        return abnv.L(pjt.class);
    }
}

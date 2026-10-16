package defpackage;

/* loaded from: classes3.dex */
public final class ajfq extends abnv implements abox {
    public static final ajfq a;
    public int b = 0;
    public Object c;
    public int d;
    private int e;

    static {
        ajfq ajfqVar = new ajfq();
        a = ajfqVar;
        abnv.P(ajfq.class, ajfqVar);
    }

    private ajfq() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u00028\u0000\u0003<\u0000", new Object[]{"c", "b", "e", "d", ajfp.a, ajfo.class});
        }
        if (i2 == 3) {
            return new ajfq();
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
        return abnv.L(ajfq.class);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class aauc extends abnv implements abox {
    public static final aauc a;
    private int b;
    private int c;
    private aaug d;
    private aarj e;

    static {
        aauc aaucVar = new aauc();
        a = aaucVar;
        abnv.P(aauc.class, aaucVar);
    }

    private aauc() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0002\u001b9\u0002\u0000\u0000\u0000\u001bဉ\u001d9ဉ6", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new aauc();
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
        return abnv.L(aauc.class);
    }
}

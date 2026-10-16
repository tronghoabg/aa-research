package defpackage;

/* loaded from: classes3.dex */
public final class xor extends abnv implements abox {
    public static final xor a;
    public aboh b;
    public aboh c;

    static {
        xor xorVar = new xor();
        a = xorVar;
        abnv.P(xor.class, xorVar);
    }

    private xor() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", xot.class, "c", xot.class});
        }
        if (i2 == 3) {
            return new xor();
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
        return abnv.L(xor.class);
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class otq extends abnv implements abox {
    public static final otq a;
    public aboh b;
    public aboh c;

    static {
        otq otqVar = new otq();
        a = otqVar;
        abnv.P(otq.class, otqVar);
    }

    private otq() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", ots.class, "c", oub.class});
        }
        if (i2 == 3) {
            return new otq();
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
        return abnv.L(otq.class);
    }
}

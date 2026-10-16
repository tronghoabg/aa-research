package defpackage;

/* loaded from: classes3.dex */
public final class abyq extends abnv implements abox {
    public static final abyq a;
    public aboh b;
    public aboh c;

    static {
        abyq abyqVar = new abyq();
        a = abyqVar;
        abnv.P(abyq.class, abyqVar);
    }

    private abyq() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"b", abyp.class, "c"});
        }
        if (i2 == 3) {
            return new abyq();
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
        return abnv.L(abyq.class);
    }
}

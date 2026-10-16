package defpackage;

/* loaded from: classes3.dex */
public final class aaic extends abnv implements abox {
    public static final aaic a;
    public int b;
    public aahy c;
    public aahy d;
    public int e;
    public aahw f;
    public aboh g;
    public aboh h;

    static {
        aaic aaicVar = new aaic();
        a = aaicVar;
        abnv.P(aaic.class, aaicVar);
    }

    private aaic() {
        abpf abpfVar = abpf.b;
        this.g = abpfVar;
        this.h = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004ဉ\u0002\u0005\u001b\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", aaib.class, "h", aahx.class});
        }
        if (i2 == 3) {
            return new aaic();
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
        return abnv.L(aaic.class);
    }
}

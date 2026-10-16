package defpackage;

/* loaded from: classes3.dex */
public final class syo extends abnv implements abox {
    public static final syo a;
    public aboh b = abpf.b;

    static {
        syo syoVar = new syo();
        a = syoVar;
        abnv.P(syo.class, syoVar);
    }

    private syo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", sym.class});
        }
        if (i2 == 3) {
            return new syo();
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
        return abnv.L(syo.class);
    }

    public final void b() {
        aboh abohVar = this.b;
        if (abohVar.c()) {
            return;
        }
        this.b = abnv.I(abohVar);
    }
}

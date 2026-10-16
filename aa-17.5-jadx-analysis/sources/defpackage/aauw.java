package defpackage;

/* loaded from: classes3.dex */
public final class aauw extends abnv implements abox {
    public static final aauw a;
    public aboh b = abpf.b;

    static {
        aauw aauwVar = new aauw();
        a = aauwVar;
        abnv.P(aauw.class, aauwVar);
    }

    private aauw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new aauw();
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
        return abnv.L(aauw.class);
    }

    public final void b() {
        aboh abohVar = this.b;
        if (abohVar.c()) {
            return;
        }
        this.b = abnv.I(abohVar);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class zbz extends abnv implements abox {
    public static final zbz a;
    private byte c = 2;
    public aboh b = abpf.b;

    static {
        zbz zbzVar = new zbz();
        a = zbzVar;
        abnv.P(zbz.class, zbzVar);
    }

    private zbz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", zca.class});
        }
        if (i2 == 3) {
            return new zbz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbz.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        aboh abohVar = this.b;
        if (abohVar.c()) {
            return;
        }
        this.b = abnv.I(abohVar);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class vor extends abnv implements abox {
    public static final vor a;
    public int b;
    public long c;
    public abpt d;
    private byte f = 2;
    public aboh e = abpf.b;

    static {
        vor vorVar = new vor();
        a = vorVar;
        abnv.P(vor.class, vorVar);
    }

    private vor() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new Object[]{"b", "c", "d", "e", von.class});
        }
        if (i2 == 3) {
            return new vor();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(vor.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        aboh abohVar = this.e;
        if (abohVar.c()) {
            return;
        }
        this.e = abnv.I(abohVar);
    }
}

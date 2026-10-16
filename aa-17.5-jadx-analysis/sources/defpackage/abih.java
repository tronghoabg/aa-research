package defpackage;

/* loaded from: classes3.dex */
public final class abih extends abnv implements abox {
    public static final abih a;
    public int b;
    public abei c;
    public abhl d;
    public abls e;
    public int f;
    public int g;
    public int h;
    public int k;
    private byte l = 2;
    public int i = 1;
    public aboh j = abpf.b;

    static {
        abih abihVar = new abih();
        a = abihVar;
        abnv.P(abih.class, abihVar);
    }

    private abih() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\t\u0000\u0001\u0002\u000f\t\u0000\u0001\u0003\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0006Л\u0007᠌\u0005\b᠌\u0006\u000bင\n\u000f᠌\u0007", new Object[]{"b", "c", "d", "e", "f", abce.l, "j", abdr.class, "g", abce.k, "h", abce.m, "k", "i", abce.g});
        }
        if (i2 == 3) {
            return new abih();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abih.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        aboh abohVar = this.j;
        if (abohVar.c()) {
            return;
        }
        this.j = abnv.I(abohVar);
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class abha extends abns implements abnt {
    public static final abha a;
    public int b;
    private byte e = 2;
    public int c = 37;
    public aboh d = abpf.b;

    static {
        abha abhaVar = new abha();
        a = abhaVar;
        abnv.P(abha.class, abhaVar);
    }

    private abha() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᴌ\u0000\u0002Л", new Object[]{"b", "c", abce.u, "d", abgz.class});
        }
        if (i2 == 3) {
            return new abha();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abha.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        aboh abohVar = this.d;
        if (abohVar.c()) {
            return;
        }
        this.d = abnv.I(abohVar);
    }
}

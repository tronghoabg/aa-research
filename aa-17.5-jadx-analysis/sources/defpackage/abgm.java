package defpackage;

/* loaded from: classes3.dex */
public final class abgm extends abnv implements abox {
    public static final abgm a;
    public int b;
    private byte f = 2;
    public String c = "";
    public String d = "";
    public aboh e = abpf.b;

    static {
        abgm abgmVar = new abgm();
        a = abgmVar;
        abnv.P(abgm.class, abgmVar);
    }

    private abgm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0002\f\u0003\u0000\u0001\u0001\u0002ဈ\u0000\u0003ဈ\u0001\fЛ", new Object[]{"b", "c", "d", "e", abha.class});
        }
        if (i2 == 3) {
            return new abgm();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgm.class);
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

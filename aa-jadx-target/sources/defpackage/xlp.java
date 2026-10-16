package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xlp extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xlp a;
    public int b;
    public defpackage.abpj e;
    public defpackage.abpj f;
    public int g;
    public int h;
    public int i;
    public int j;
    private byte k = 2;
    public int c = 1;
    public int d = 1;

    static {
        defpackage.xlp xlpVar = new defpackage.xlp();
        a = xlpVar;
        defpackage.abox.P(defpackage.xlp.class, xlpVar);
    }

    private xlp() {
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.e = abqhVar;
        this.f = abqhVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0002\u0001\u0001᠌\u0000\u0002᠌\u0001\u0003Л\u0004\u001b\u0006ဋ\u0003\u0007᠌\u0004\b᠌\u0005\t᠌\u0006", new java.lang.Object[]{"b", "c", defpackage.our.u, "d", defpackage.our.k, "e", defpackage.xig.class, "f", defpackage.xqe.class, "g", "h", defpackage.our.n, "i", defpackage.our.t, "j", defpackage.xmo.e});
        }
        if (i2 == 3) {
            return new defpackage.xlp();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xlp.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

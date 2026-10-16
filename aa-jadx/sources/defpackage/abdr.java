package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abdr extends defpackage.abou implements defpackage.abov {
    public static final defpackage.abdr a;
    public int b;
    private byte g = 2;
    public defpackage.abpj c = defpackage.abqh.b;
    public int d = -1;
    public long e = -1;
    public int f = 1;

    static {
        defpackage.abdr abdrVar = new defpackage.abdr();
        a = abdrVar;
        defpackage.abox.P(defpackage.abdr.class, abdrVar);
    }

    private abdr() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003ဂ\u0001\u0004᠌\u0002", new java.lang.Object[]{"b", "c", defpackage.abdq.class, "d", "e", "f", defpackage.abdh.c});
        }
        if (i2 == 3) {
            return new defpackage.abdr();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.abdr.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

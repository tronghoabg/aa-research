package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xoy extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abpg a = new defpackage.xit(3);
    public static final defpackage.abpg b = new defpackage.xit(4);
    public static final defpackage.xoy c;
    public int e;
    public defpackage.abpf f;
    public defpackage.abpf g;
    private int h;
    private byte i = 2;
    public defpackage.abpj d = defpackage.abqh.b;

    static {
        defpackage.xoy xoyVar = new defpackage.xoy();
        c = xoyVar;
        defpackage.abox.P(defpackage.xoy.class, xoyVar);
    }

    private xoy() {
        defpackage.aboy aboyVar = defpackage.aboy.a;
        this.f = aboyVar;
        this.g = aboyVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new defpackage.abqi(c, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0001\u0001Л\u0002ဋ\u0000\u0003ࠞ\u0004ࠞ", new java.lang.Object[]{"h", "d", defpackage.xox.class, "e", "f", defpackage.our.s, "g", defpackage.our.p});
        }
        if (i2 == 3) {
            return new defpackage.xoy();
        }
        if (i2 == 4) {
            return new defpackage.abor(c);
        }
        if (i2 == 5) {
            return c;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xoy.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

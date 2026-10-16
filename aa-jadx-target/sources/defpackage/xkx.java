package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xkx extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abpg a = new defpackage.xit(2);
    public static final defpackage.xkx b;
    public defpackage.abpf c;
    public defpackage.abpj d;
    public defpackage.abpj e;
    public defpackage.abpf f;
    public int g;
    private int h;
    private byte i = 2;

    static {
        defpackage.xkx xkxVar = new defpackage.xkx();
        b = xkxVar;
        defpackage.abox.P(defpackage.xkx.class, xkxVar);
    }

    private xkx() {
        defpackage.aboy aboyVar = defpackage.aboy.a;
        this.c = aboyVar;
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.d = abqhVar;
        this.e = abqhVar;
        this.f = aboyVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new defpackage.abqi(b, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0002\u0001'\u0002Л\u0003Л\u0004ࠞ\u0005ဋ\u0000", new java.lang.Object[]{"h", "c", "d", defpackage.xkw.class, "e", defpackage.xkv.class, "f", defpackage.our.q, "g"});
        }
        if (i2 == 3) {
            return new defpackage.xkx();
        }
        if (i2 == 4) {
            return new defpackage.abor(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xkx.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

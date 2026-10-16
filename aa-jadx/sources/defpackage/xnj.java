package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xnj extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xnj a;
    public int b;
    public long c;
    private byte e = 2;
    public defpackage.abnv d = defpackage.abnv.d;

    static {
        defpackage.xnj xnjVar = new defpackage.xnj();
        a = xnjVar;
        defpackage.abox.P(defpackage.xnj.class, xnjVar);
    }

    private xnj() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ည\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.xnj();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xnj.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

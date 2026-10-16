package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aciy extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.aciy a;
    public int b;
    public int d;
    public long e;
    private byte h = 2;
    public java.lang.String c = "";
    public defpackage.abnv f = defpackage.abnv.d;
    public java.lang.String g = "";

    static {
        defpackage.aciy aciyVar = new defpackage.aciy();
        a = aciyVar;
        defpackage.abox.P(defpackage.aciy.class, aciyVar);
    }

    private aciy() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0004\u0002ᔈ\u0000\u0003ᔄ\u0001\u0004ᔅ\u0002\u0006ည\u0003\u0007ᔈ\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.aciy();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.aciy.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

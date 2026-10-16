package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xlf extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xlf a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    private byte g = 2;

    static {
        defpackage.xlf xlfVar = new defpackage.xlf();
        a = xlfVar;
        defpackage.abox.P(defpackage.xlf.class, xlfVar);
    }

    private xlf() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔇ\u0001\u0003ᔋ\u0002\u0004ဇ\u0003", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.xlf();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xlf.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

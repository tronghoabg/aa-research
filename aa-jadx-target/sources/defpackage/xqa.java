package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xqa extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xqa a;
    public int b;
    private byte f = 2;
    public java.lang.String c = "";
    public defpackage.abpj d = defpackage.abqh.b;
    public defpackage.abnv e = defpackage.abnv.d;

    static {
        defpackage.xqa xqaVar = new defpackage.xqa();
        a = xqaVar;
        defpackage.abox.P(defpackage.xqa.class, xqaVar);
    }

    private xqa() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᔈ\u0000\u0002\u001a\u0003ည\u0001", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.xqa();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xqa.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

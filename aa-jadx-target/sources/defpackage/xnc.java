package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xnc extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xnc a;
    public int b;
    public int c;
    public int d;
    private byte i = 2;
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";
    public defpackage.abnv h = defpackage.abnv.d;

    static {
        defpackage.xnc xncVar = new defpackage.xnc();
        a = xncVar;
        defpackage.abox.P(defpackage.xnc.class, xncVar);
    }

    private xnc() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᔋ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005", new java.lang.Object[]{"b", "c", defpackage.xlv.k, "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.xnc();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xnc.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

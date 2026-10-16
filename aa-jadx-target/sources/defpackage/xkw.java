package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xkw extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xkw a;
    public int b;
    public int c;
    public int d;
    private byte f = 2;
    public int e = 1;

    static {
        defpackage.xkw xkwVar = new defpackage.xkw();
        a = xkwVar;
        defpackage.abox.P(defpackage.xkw.class, xkwVar);
    }

    private xkw() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003᠌\u0002", new java.lang.Object[]{"b", "c", "d", "e", defpackage.xmo.d});
        }
        if (i2 == 3) {
            return new defpackage.xkw();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xkw.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xni extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xni a;
    public int b;
    public long c;
    public boolean d;
    private byte f = 2;
    public defpackage.abnv e = defpackage.abnv.d;

    static {
        defpackage.xni xniVar = new defpackage.xni();
        a = xniVar;
        defpackage.abox.P(defpackage.xni.class, xniVar);
    }

    private xni() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ဇ\u0001\u0003ည\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.xni();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xni.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

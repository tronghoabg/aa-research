package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wbx extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.wbx a;
    public long e;
    private int g;
    public defpackage.abpv f = defpackage.abpv.a;
    public java.lang.String b = "";
    public defpackage.abnv c = defpackage.abnv.d;
    public java.lang.String d = "";

    static {
        defpackage.wbx wbxVar = new defpackage.wbx();
        a = wbxVar;
        defpackage.abox.P(defpackage.wbx.class, wbxVar);
    }

    private wbx() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new java.lang.Object[]{"g", "b", "c", "d", "e", "f", new defpackage.ldx(defpackage.abrf.STRING, "", defpackage.abrf.MESSAGE, defpackage.wbt.a)});
        }
        if (i2 == 3) {
            return new defpackage.wbx();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.abox.L(defpackage.wbx.class);
    }
}

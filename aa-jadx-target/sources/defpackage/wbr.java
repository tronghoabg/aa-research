package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wbr extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.wbr a;
    public int b;
    public defpackage.wbq d;
    public java.lang.String c = "";
    public java.lang.String e = "";

    static {
        defpackage.wbr wbrVar = new defpackage.wbr();
        a = wbrVar;
        defpackage.abox.P(defpackage.wbr.class, wbrVar);
    }

    private wbr() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.wbr();
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
        return defpackage.abox.L(defpackage.wbr.class);
    }
}

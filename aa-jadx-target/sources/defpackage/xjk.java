package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xjk extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xjk a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";
    public defpackage.abnv f = defpackage.abnv.d;
    public int g;

    static {
        defpackage.xjk xjkVar = new defpackage.xjk();
        a = xjkVar;
        defpackage.abox.P(defpackage.xjk.class, xjkVar);
    }

    private xjk() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဋ\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.xjk();
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
        return defpackage.abox.L(defpackage.xjk.class);
    }
}

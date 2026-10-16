package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xqm extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xqm a;
    public java.lang.String b = "";
    private int c;

    static {
        defpackage.xqm xqmVar = new defpackage.xqm();
        a = xqmVar;
        defpackage.abox.P(defpackage.xqm.class, xqmVar);
    }

    private xqm() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.xqm();
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
        return defpackage.abox.L(defpackage.xqm.class);
    }
}

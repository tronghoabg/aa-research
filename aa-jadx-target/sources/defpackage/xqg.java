package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xqg extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xqg a;
    public int b = 1;
    public boolean c;
    private int d;

    static {
        defpackage.xqg xqgVar = new defpackage.xqg();
        a = xqgVar;
        defpackage.abox.P(defpackage.xqg.class, xqgVar);
    }

    private xqg() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new java.lang.Object[]{"d", "b", defpackage.xmo.g, "c"});
        }
        if (i2 == 3) {
            return new defpackage.xqg();
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
        return defpackage.abox.L(defpackage.xqg.class);
    }
}

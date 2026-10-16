package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yyj extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yyj a;
    public int b;
    public java.lang.String c = "";
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        defpackage.yyj yyjVar = new defpackage.yyj();
        a = yyjVar;
        defpackage.abox.P(defpackage.yyj.class, yyjVar);
    }

    private yyj() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new defpackage.yyj();
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
        return defpackage.abox.L(defpackage.yyj.class);
    }
}

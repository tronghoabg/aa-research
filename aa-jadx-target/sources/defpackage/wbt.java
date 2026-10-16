package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wbt extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.wbt a;
    public int b;
    public java.lang.Object d;
    public int c = 0;
    public java.lang.String e = "";

    static {
        defpackage.wbt wbtVar = new defpackage.wbt();
        a = wbtVar;
        defpackage.abox.P(defpackage.wbt.class, wbtVar);
    }

    private wbt() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new java.lang.Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new defpackage.wbt();
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
        return defpackage.abox.L(defpackage.wbt.class);
    }
}

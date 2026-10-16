package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yyz extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yyz a;
    public int b;
    public long c;
    public int d;
    public int e;

    static {
        defpackage.yyz yyzVar = new defpackage.yyz();
        a = yyzVar;
        defpackage.abox.P(defpackage.yyz.class, yyzVar);
    }

    private yyz() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.yyz();
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
        return defpackage.abox.L(defpackage.yyz.class);
    }
}

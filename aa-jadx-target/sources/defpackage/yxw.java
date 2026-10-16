package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yxw extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yxw a;
    public int b;
    public int c;
    public long d;

    static {
        defpackage.yxw yxwVar = new defpackage.yxw();
        a = yxwVar;
        defpackage.abox.P(defpackage.yxw.class, yxwVar);
    }

    private yxw() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.yxw();
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
        return defpackage.abox.L(defpackage.yxw.class);
    }
}

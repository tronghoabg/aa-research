package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yyk extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yyk a;
    public int b;
    public int d;
    public int f;
    public int g;
    public java.lang.String c = "";
    public java.lang.String e = "";
    public defpackage.abpj h = defpackage.abqh.b;

    static {
        defpackage.yyk yykVar = new defpackage.yyk();
        a = yykVar;
        defpackage.abox.P(defpackage.yyk.class, yykVar);
    }

    private yyk() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005င\u0004\u0006\u001b", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", defpackage.yyl.class});
        }
        if (i2 == 3) {
            return new defpackage.yyk();
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
        return defpackage.abox.L(defpackage.yyk.class);
    }
}

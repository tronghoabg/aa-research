package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yzl extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yzl a;
    public int b;
    public defpackage.abpj c = defpackage.abqh.b;
    public int d;
    public boolean e;

    static {
        defpackage.yzl yzlVar = new defpackage.yzl();
        a = yzlVar;
        defpackage.abox.P(defpackage.yzl.class, yzlVar);
    }

    private yzl() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဇ\u0001", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.yzl();
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
        return defpackage.abox.L(defpackage.yzl.class);
    }
}

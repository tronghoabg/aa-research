package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xjg extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xjg a;
    public defpackage.abpj b;
    public defpackage.abpj c;
    public defpackage.abpj d;

    static {
        defpackage.xjg xjgVar = new defpackage.xjg();
        a = xjgVar;
        defpackage.abox.P(defpackage.xjg.class, xjgVar);
    }

    private xjg() {
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.b = abqhVar;
        this.c = abqhVar;
        this.d = abqhVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new java.lang.Object[]{"b", xhl.class, "c", xjd.class, "d", xhc.class});
        }
        if (i2 == 3) {
            return new defpackage.xjg();
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
        return defpackage.abox.L(defpackage.xjg.class);
    }
}

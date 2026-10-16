package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yzx extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yzx a;
    public defpackage.abpj b;
    public defpackage.abpj c;

    static {
        defpackage.yzx yzxVar = new defpackage.yzx();
        a = yzxVar;
        defpackage.abox.P(defpackage.yzx.class, yzxVar);
    }

    private yzx() {
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.b = abqhVar;
        this.c = abqhVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001a\u0003\u001a", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.yzx();
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
        return defpackage.abox.L(defpackage.yzx.class);
    }
}

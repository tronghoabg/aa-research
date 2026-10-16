package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yxz extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yxz a;
    public int b;
    public defpackage.abpj c = defpackage.abqh.b;
    public int d;

    static {
        defpackage.yxz yxzVar = new defpackage.yxz();
        a = yxzVar;
        defpackage.abox.P(defpackage.yxz.class, yxzVar);
    }

    private yxz() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new java.lang.Object[]{"b", "c", defpackage.yxy.class, "d"});
        }
        if (i2 == 3) {
            return new defpackage.yxz();
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
        return defpackage.abox.L(defpackage.yxz.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class out extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.out a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        defpackage.out outVar = new defpackage.out();
        a = outVar;
        defpackage.abox.P(defpackage.out.class, outVar);
    }

    private out() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0004᠌\u0001\u0005᠌\u0002", new java.lang.Object[]{"b", "c", "d", defpackage.our.a, "e", defpackage.our.e});
        }
        if (i2 == 3) {
            return new defpackage.out();
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
        return defpackage.abox.L(defpackage.out.class);
    }
}

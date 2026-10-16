package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yzj extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yzj a;
    public int b;
    public int c;
    public defpackage.abpf d = defpackage.aboy.a;

    static {
        defpackage.yzj yzjVar = new defpackage.yzj();
        a = yzjVar;
        defpackage.abox.P(defpackage.yzj.class, yzjVar);
    }

    private yzj() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0016", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.yzj();
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
        return defpackage.abox.L(defpackage.yzj.class);
    }
}

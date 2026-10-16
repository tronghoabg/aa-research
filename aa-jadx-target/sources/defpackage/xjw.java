package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xjw extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xjw a;
    public int b;
    public defpackage.xnh c;

    static {
        defpackage.xjw xjwVar = new defpackage.xjw();
        a = xjwVar;
        defpackage.abox.P(defpackage.xjw.class, xjwVar);
    }

    private xjw() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.xjw();
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
        return defpackage.abox.L(defpackage.xjw.class);
    }
}

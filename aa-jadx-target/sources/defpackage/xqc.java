package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xqc extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xqc a;
    public int b;
    public defpackage.xjw c;

    static {
        defpackage.xqc xqcVar = new defpackage.xqc();
        a = xqcVar;
        defpackage.abox.P(defpackage.xqc.class, xqcVar);
    }

    private xqc() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.xqc();
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
        return defpackage.abox.L(defpackage.xqc.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tbd extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.tbd a;
    public defpackage.osi b;
    private int c;

    static {
        defpackage.tbd tbdVar = new defpackage.tbd();
        a = tbdVar;
        defpackage.abox.P(defpackage.tbd.class, tbdVar);
    }

    private tbd() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.tbd();
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
        return defpackage.abox.L(defpackage.tbd.class);
    }
}

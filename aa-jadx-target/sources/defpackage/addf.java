package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class addf extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.addf a;
    public int b = 0;
    public java.lang.Object c;

    static {
        defpackage.addf addfVar = new defpackage.addf();
        a = addfVar;
        defpackage.abox.P(defpackage.addf.class, addfVar);
    }

    private addf() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002:\u0000", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.addf();
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
        return defpackage.abox.L(defpackage.addf.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acar extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.acar a;
    public int b;
    public java.lang.Object d;
    public int c = 0;
    public java.lang.String e = "";

    static {
        defpackage.acar acarVar = new defpackage.acar();
        a = acarVar;
        defpackage.abox.P(defpackage.acar.class, acarVar);
    }

    private acar() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0007\u0001\u0001\u0001 \u0007\u0000\u0000\u0000\u0001ဈ\u0000\u000b3\u0000\u000e5\u0000\u0017:\u0000\u0018;\u0000\u001f;\u0000 =\u0000", new java.lang.Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new defpackage.acar();
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
        return defpackage.abox.L(defpackage.acar.class);
    }
}

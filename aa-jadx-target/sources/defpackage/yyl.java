package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yyl extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yyl a;
    public int b;
    public int c;

    static {
        defpackage.yyl yylVar = new defpackage.yyl();
        a = yylVar;
        defpackage.abox.P(defpackage.yyl.class, yylVar);
    }

    private yyl() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.yyl();
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
        return defpackage.abox.L(defpackage.yyl.class);
    }
}

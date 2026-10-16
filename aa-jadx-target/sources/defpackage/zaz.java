package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zaz extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.zaz a;
    public int b;
    public int c;
    public int d;

    static {
        defpackage.zaz zazVar = new defpackage.zaz();
        a = zazVar;
        defpackage.abox.P(defpackage.zaz.class, zazVar);
    }

    private zaz() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.zaz();
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
        return defpackage.abox.L(defpackage.zaz.class);
    }
}

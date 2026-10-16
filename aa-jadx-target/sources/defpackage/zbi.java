package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zbi extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.zbi a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        defpackage.zbi zbiVar = new defpackage.zbi();
        a = zbiVar;
        defpackage.abox.P(defpackage.zbi.class, zbiVar);
    }

    private zbi() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.zbi();
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
        return defpackage.abox.L(defpackage.zbi.class);
    }
}

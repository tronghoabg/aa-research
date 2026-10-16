package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kxg extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.kxg a;
    public int b;
    public boolean c;

    static {
        defpackage.kxg kxgVar = new defpackage.kxg();
        a = kxgVar;
        defpackage.abox.P(defpackage.kxg.class, kxgVar);
    }

    private kxg() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.kxg();
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
        return defpackage.abox.L(defpackage.kxg.class);
    }
}

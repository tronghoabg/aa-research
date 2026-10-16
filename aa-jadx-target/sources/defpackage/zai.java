package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zai extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.zai a;
    public int b;
    public java.lang.String c = "";
    public int d;

    static {
        defpackage.zai zaiVar = new defpackage.zai();
        a = zaiVar;
        defpackage.abox.P(defpackage.zai.class, zaiVar);
    }

    private zai() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003င\u0002", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.zai();
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
        return defpackage.abox.L(defpackage.zai.class);
    }
}

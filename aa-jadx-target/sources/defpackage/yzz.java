package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yzz extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yzz a;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        defpackage.yzz yzzVar = new defpackage.yzz();
        a = yzzVar;
        defpackage.abox.P(defpackage.yzz.class, yzzVar);
    }

    private yzz() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.yzz();
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
        return defpackage.abox.L(defpackage.yzz.class);
    }
}

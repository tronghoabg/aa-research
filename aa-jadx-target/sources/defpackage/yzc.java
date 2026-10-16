package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yzc extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yzc a;
    public int b;
    public int c;
    public defpackage.zao d;

    static {
        defpackage.yzc yzcVar = new defpackage.yzc();
        a = yzcVar;
        defpackage.abox.P(defpackage.yzc.class, yzcVar);
    }

    private yzc() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.yzc();
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
        return defpackage.abox.L(defpackage.yzc.class);
    }
}

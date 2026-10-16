package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wbq extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.wbq a;
    public int b;
    public int c;
    public int d;

    static {
        defpackage.wbq wbqVar = new defpackage.wbq();
        a = wbqVar;
        defpackage.abox.P(defpackage.wbq.class, wbqVar);
    }

    private wbq() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.wbq();
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
        return defpackage.abox.L(defpackage.wbq.class);
    }
}

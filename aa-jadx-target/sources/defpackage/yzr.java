package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yzr extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yzr a;
    public int b;
    public boolean c;
    public int d;
    public int e;

    static {
        defpackage.yzr yzrVar = new defpackage.yzr();
        a = yzrVar;
        defpackage.abox.P(defpackage.yzr.class, yzrVar);
    }

    private yzr() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.yzr();
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
        return defpackage.abox.L(defpackage.yzr.class);
    }
}

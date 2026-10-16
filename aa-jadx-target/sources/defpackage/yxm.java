package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yxm extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yxm a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public long g;

    static {
        defpackage.yxm yxmVar = new defpackage.yxm();
        a = yxmVar;
        defpackage.abox.P(defpackage.yxm.class, yxmVar);
    }

    private yxm() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.yxm();
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
        return defpackage.abox.L(defpackage.yxm.class);
    }
}

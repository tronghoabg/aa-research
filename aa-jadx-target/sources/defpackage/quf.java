package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class quf extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.quf a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        defpackage.quf qufVar = new defpackage.quf();
        a = qufVar;
        defpackage.abox.P(defpackage.quf.class, qufVar);
    }

    private quf() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new java.lang.Object[]{"b", "c", defpackage.our.h, "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.quf();
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
        return defpackage.abox.L(defpackage.quf.class);
    }
}

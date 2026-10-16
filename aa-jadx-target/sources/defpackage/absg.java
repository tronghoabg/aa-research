package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class absg extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.absg a;
    public int b;
    public float c;
    public long d;
    private int e;

    static {
        defpackage.absg absgVar = new defpackage.absg();
        a = absgVar;
        defpackage.abox.P(defpackage.absg.class, absgVar);
    }

    private absg() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ဃ\u0002", new java.lang.Object[]{"e", "b", defpackage.yxq.i, "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.absg();
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
        return defpackage.abox.L(defpackage.absg.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yzf extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yzf a;
    public int b;
    public long c;
    public yze d;

    static {
        defpackage.yzf yzfVar = new defpackage.yzf();
        a = yzfVar;
        defpackage.abox.P(defpackage.yzf.class, yzfVar);
    }

    private yzf() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဂ\u0002\u0004ဉ\u0003", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.yzf();
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
        return defpackage.abox.L(defpackage.yzf.class);
    }
}

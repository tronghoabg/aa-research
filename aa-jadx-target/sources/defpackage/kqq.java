package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kqq extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.kqq a;
    public int b;
    public defpackage.abqv c;
    public boolean e;
    public java.lang.String d = "";
    public java.lang.String f = "";

    static {
        defpackage.kqq kqqVar = new defpackage.kqq();
        a = kqqVar;
        defpackage.abox.P(defpackage.kqq.class, kqqVar);
    }

    private kqq() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.kqq();
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
        return defpackage.abox.L(defpackage.kqq.class);
    }
}

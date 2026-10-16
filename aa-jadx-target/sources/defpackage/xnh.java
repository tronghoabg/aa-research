package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xnh extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xnh a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        defpackage.xnh xnhVar = new defpackage.xnh();
        a = xnhVar;
        defpackage.abox.P(defpackage.xnh.class, xnhVar);
    }

    private xnh() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.xnh();
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
        return defpackage.abox.L(defpackage.xnh.class);
    }
}

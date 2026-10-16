package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xpx extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xpx a;
    public int b;
    public defpackage.xpq c;

    static {
        defpackage.xpx xpxVar = new defpackage.xpx();
        a = xpxVar;
        defpackage.abox.P(defpackage.xpx.class, xpxVar);
    }

    private xpx() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.xpx();
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
        return defpackage.abox.L(defpackage.xpx.class);
    }
}

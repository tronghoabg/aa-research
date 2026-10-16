package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class olp extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.olp a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        defpackage.olp olpVar = new defpackage.olp();
        a = olpVar;
        defpackage.abox.P(defpackage.olp.class, olpVar);
    }

    private olp() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.olp();
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
        return defpackage.abox.L(defpackage.olp.class);
    }
}

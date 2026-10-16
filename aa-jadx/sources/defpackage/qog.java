package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qog extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.qog a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public int e;
    public int f;
    public int g;

    static {
        defpackage.qog qogVar = new defpackage.qog();
        a = qogVar;
        defpackage.abox.P(defpackage.qog.class, qogVar);
    }

    private qog() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.qog();
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
        return defpackage.abox.L(defpackage.qog.class);
    }
}

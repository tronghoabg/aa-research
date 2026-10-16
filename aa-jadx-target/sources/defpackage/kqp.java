package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kqp extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.kqp a;
    public defpackage.abpv b = defpackage.abpv.a;

    static {
        defpackage.kqp kqpVar = new defpackage.kqp();
        a = kqpVar;
        defpackage.abox.P(defpackage.kqp.class, kqpVar);
    }

    private kqp() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"b", new defpackage.ldx(defpackage.abrf.STRING, "", defpackage.abrf.MESSAGE, defpackage.kqq.a)});
        }
        if (i2 == 3) {
            return new defpackage.kqp();
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
        return defpackage.abox.L(defpackage.kqp.class);
    }
}

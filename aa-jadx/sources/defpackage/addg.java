package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class addg extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.addg a;
    public int b;
    public defpackage.addf c;
    public defpackage.addf d;
    public defpackage.abpv e = defpackage.abpv.a;

    static {
        defpackage.addg addgVar = new defpackage.addg();
        a = addgVar;
        defpackage.abox.P(defpackage.addg.class, addgVar);
    }

    private addg() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00032", new java.lang.Object[]{"b", "c", "d", "e", new defpackage.ldx(defpackage.abrf.STRING, "", defpackage.abrf.MESSAGE, defpackage.addf.a)});
        }
        if (i2 == 3) {
            return new defpackage.addg();
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
        return defpackage.abox.L(defpackage.addg.class);
    }
}

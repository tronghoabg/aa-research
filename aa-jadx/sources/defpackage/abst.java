package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abst extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abst a;
    public defpackage.abpv c = defpackage.abpv.a;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.abst abstVar = new defpackage.abst();
        a = abstVar;
        defpackage.abox.P(defpackage.abst.class, abstVar);
    }

    private abst() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001\u001b\u00022", new java.lang.Object[]{"b", defpackage.abss.class, "c", new defpackage.ldx(defpackage.abrf.STRING, "", defpackage.abrf.MESSAGE, defpackage.absr.a)});
        }
        if (i2 == 3) {
            return new defpackage.abst();
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
        return defpackage.abox.L(defpackage.abst.class);
    }
}

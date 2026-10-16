package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rsf extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.rsf a;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.rsf rsfVar = new defpackage.rsf();
        a = rsfVar;
        defpackage.abox.P(defpackage.rsf.class, rsfVar);
    }

    private rsf() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.rsg.class});
        }
        if (i2 == 3) {
            return new defpackage.rsf();
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
        return defpackage.abox.L(defpackage.rsf.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class olr extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.olr a;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.olr olrVar = new defpackage.olr();
        a = olrVar;
        defpackage.abox.P(defpackage.olr.class, olrVar);
    }

    private olr() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.olq.class});
        }
        if (i2 == 3) {
            return new defpackage.olr();
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
        return defpackage.abox.L(defpackage.olr.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class addi extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.addi a;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.addi addiVar = new defpackage.addi();
        a = addiVar;
        defpackage.abox.P(defpackage.addi.class, addiVar);
    }

    private addi() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.addh.class});
        }
        if (i2 == 3) {
            return new defpackage.addi();
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
        return defpackage.abox.L(defpackage.addi.class);
    }
}

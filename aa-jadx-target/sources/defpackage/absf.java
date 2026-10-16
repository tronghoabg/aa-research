package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class absf extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.absf a;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.absf absfVar = new defpackage.absf();
        a = absfVar;
        defpackage.abox.P(defpackage.absf.class, absfVar);
    }

    private absf() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.absg.class});
        }
        if (i2 == 3) {
            return new defpackage.absf();
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
        return defpackage.abox.L(defpackage.absf.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oun extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.oun a;
    public defpackage.abpj b;
    public defpackage.abpj c;

    static {
        defpackage.oun ounVar = new defpackage.oun();
        a = ounVar;
        defpackage.abox.P(defpackage.oun.class, ounVar);
    }

    private oun() {
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.b = abqhVar;
        this.c = abqhVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new java.lang.Object[]{"b", defpackage.oup.class, "c", ouy.class});
        }
        if (i2 == 3) {
            return new defpackage.oun();
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
        return defpackage.abox.L(defpackage.oun.class);
    }
}

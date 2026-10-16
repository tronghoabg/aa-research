package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xqb extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xqb a;

    static {
        defpackage.xqb xqbVar = new defpackage.xqb();
        a = xqbVar;
        defpackage.abox.P(defpackage.xqb.class, xqbVar);
    }

    private xqb() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.xqb();
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
        return defpackage.abox.L(defpackage.xqb.class);
    }
}

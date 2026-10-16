package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abtc extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abtc a;
    public int b;
    public defpackage.abtb c;

    static {
        defpackage.abtc abtcVar = new defpackage.abtc();
        a = abtcVar;
        defpackage.abox.P(defpackage.abtc.class, abtcVar);
    }

    private abtc() {
        java.lang.Object[] objArr = defpackage.abqh.a;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.abtc();
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
        return defpackage.abox.L(defpackage.abtc.class);
    }
}

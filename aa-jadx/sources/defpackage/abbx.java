package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abbx extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abbx a;
    public defpackage.abpf b = defpackage.aboy.a;

    static {
        defpackage.abbx abbxVar = new defpackage.abbx();
        a = abbxVar;
        defpackage.abox.P(defpackage.abbx.class, abbxVar);
    }

    private abbx() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.abbx();
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
        return defpackage.abox.L(defpackage.abbx.class);
    }
}

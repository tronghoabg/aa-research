package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class absd extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.absd a;
    public defpackage.abpj b = defpackage.abqh.b;
    public int c;
    private int d;

    static {
        defpackage.absd absdVar = new defpackage.absd();
        a = absdVar;
        defpackage.abox.P(defpackage.absd.class, absdVar);
    }

    private absd() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new java.lang.Object[]{"d", "b", defpackage.absb.class, "c", defpackage.abir.s});
        }
        if (i2 == 3) {
            return new defpackage.absd();
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
        return defpackage.abox.L(defpackage.absd.class);
    }
}

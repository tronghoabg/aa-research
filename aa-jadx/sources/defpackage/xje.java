package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xje extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xje a;
    public int b;
    public int c;
    public defpackage.abpj d = defpackage.abqh.b;

    static {
        defpackage.xje xjeVar = new defpackage.xje();
        a = xjeVar;
        defpackage.abox.P(defpackage.xje.class, xjeVar);
    }

    private xje() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new java.lang.Object[]{"b", "c", defpackage.tbn.j, "d", defpackage.xjd.class});
        }
        if (i2 == 3) {
            return new defpackage.xje();
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
        return defpackage.abox.L(defpackage.xje.class);
    }
}

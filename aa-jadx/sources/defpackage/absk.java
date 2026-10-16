package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class absk extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.absk a;
    public int b;
    public int c;
    public defpackage.abpj d = defpackage.abqh.b;
    public java.lang.String e = "";

    static {
        defpackage.absk abskVar = new defpackage.absk();
        a = abskVar;
        defpackage.abox.P(defpackage.absk.class, abskVar);
    }

    private absk() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a\u0003ဈ\u0001", new java.lang.Object[]{"b", "c", defpackage.abir.s, "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.absk();
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
        return defpackage.abox.L(defpackage.absk.class);
    }
}

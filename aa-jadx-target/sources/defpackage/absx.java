package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class absx extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.absx a;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.absx absxVar = new defpackage.absx();
        a = absxVar;
        defpackage.abox.P(defpackage.absx.class, absxVar);
    }

    private absx() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.absx();
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
        return defpackage.abox.L(defpackage.absx.class);
    }
}

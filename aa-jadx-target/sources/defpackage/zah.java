package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zah extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.zah a;
    public int b;
    public defpackage.abpj c = defpackage.abqh.b;
    public int d;
    public defpackage.zag e;
    public defpackage.zbk f;

    static {
        defpackage.zah zahVar = new defpackage.zah();
        a = zahVar;
        defpackage.abox.P(defpackage.zah.class, zahVar);
    }

    private zah() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new java.lang.Object[]{"b", "c", defpackage.yyj.class, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.zah();
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
        return defpackage.abox.L(defpackage.zah.class);
    }
}

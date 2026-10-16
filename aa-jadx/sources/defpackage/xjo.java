package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xjo extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xjo a;
    public int b;
    public defpackage.xhj c;
    public defpackage.xhr d;
    public int e;

    static {
        defpackage.xjo xjoVar = new defpackage.xjo();
        a = xjoVar;
        defpackage.abox.P(defpackage.xjo.class, xjoVar);
    }

    private xjo() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.xjo();
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
        return defpackage.abox.L(defpackage.xjo.class);
    }
}

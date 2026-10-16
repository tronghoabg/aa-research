package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajgy extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.ajgy a;
    public int b;
    public int c = 0;
    public java.lang.Object d;
    public int e;

    static {
        defpackage.ajgy ajgyVar = new defpackage.ajgy();
        a = ajgyVar;
        defpackage.abox.P(defpackage.ajgy.class, ajgyVar);
    }

    private ajgy() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002>\u0000\u0003᠌\u0001\u0004<\u0000", new java.lang.Object[]{"d", "c", "b", "e", defpackage.xmo.p, defpackage.ajgx.class});
        }
        if (i2 == 3) {
            return new defpackage.ajgy();
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
        return defpackage.abox.L(defpackage.ajgy.class);
    }
}

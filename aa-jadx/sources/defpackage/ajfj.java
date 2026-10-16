package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajfj extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.ajfj a;
    public defpackage.abpf b = defpackage.aboy.a;

    static {
        defpackage.ajfj ajfjVar = new defpackage.ajfj();
        a = ajfjVar;
        defpackage.abox.P(defpackage.ajfj.class, ajfjVar);
    }

    private ajfj() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new java.lang.Object[]{"b", defpackage.xmo.m});
        }
        if (i2 == 3) {
            return new defpackage.ajfj();
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
        return defpackage.abox.L(defpackage.ajfj.class);
    }
}

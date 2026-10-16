package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acap extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.acap a;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.acap acapVar = new defpackage.acap();
        a = acapVar;
        defpackage.abox.P(defpackage.acap.class, acapVar);
    }

    private acap() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.acaq.class});
        }
        if (i2 == 3) {
            return new defpackage.acap();
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
        return defpackage.abox.L(defpackage.acap.class);
    }
}

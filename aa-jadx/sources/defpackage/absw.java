package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class absw extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.absw a;
    public defpackage.abpi b = defpackage.abpt.a;

    static {
        defpackage.absw abswVar = new defpackage.absw();
        a = abswVar;
        defpackage.abox.P(defpackage.absw.class, abswVar);
    }

    private absw() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.absw();
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
        return defpackage.abox.L(defpackage.absw.class);
    }
}

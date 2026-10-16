package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class absn extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.absn a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int f;

    static {
        defpackage.absn absnVar = new defpackage.absn();
        a = absnVar;
        defpackage.abox.P(defpackage.absn.class, absnVar);
    }

    private absn() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new java.lang.Object[]{"f", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.absn();
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
        return defpackage.abox.L(defpackage.absn.class);
    }
}

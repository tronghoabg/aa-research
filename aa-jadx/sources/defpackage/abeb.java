package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abeb extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abeb a;
    public int b;
    public int c;

    static {
        defpackage.abeb abebVar = new defpackage.abeb();
        a = abebVar;
        defpackage.abox.P(defpackage.abeb.class, abebVar);
    }

    private abeb() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.abeb();
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
        return defpackage.abox.L(defpackage.abeb.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acbn extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.acbn a;
    public int b;
    public int c;
    public defpackage.acbl d;
    public defpackage.acbm e;

    static {
        defpackage.acbn acbnVar = new defpackage.acbn();
        a = acbnVar;
        defpackage.abox.P(defpackage.acbn.class, acbnVar);
    }

    private acbn() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.acbn();
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
        return defpackage.abox.L(defpackage.acbn.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tbc extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.tbc a;

    static {
        defpackage.tbc tbcVar = new defpackage.tbc();
        a = tbcVar;
        defpackage.abox.P(defpackage.tbc.class, tbcVar);
    }

    private tbc() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.tbc();
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
        return defpackage.abox.L(defpackage.tbc.class);
    }
}

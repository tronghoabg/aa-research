package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ovk extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.ovk a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        defpackage.ovk ovkVar = new defpackage.ovk();
        a = ovkVar;
        defpackage.abox.P(defpackage.ovk.class, ovkVar);
    }

    private ovk() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.ovk();
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
        return defpackage.abox.L(defpackage.ovk.class);
    }
}

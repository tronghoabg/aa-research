package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abqv extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abqv a;
    public long b;
    public int c;

    static {
        defpackage.abqv abqvVar = new defpackage.abqv();
        a = abqvVar;
        defpackage.abox.P(defpackage.abqv.class, abqvVar);
    }

    private abqv() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.abqv();
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
        return defpackage.abox.L(defpackage.abqv.class);
    }
}

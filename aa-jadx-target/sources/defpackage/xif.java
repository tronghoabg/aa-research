package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xif extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xif a;
    public long b;
    public long c;
    public long d;
    public long e;
    private int f;

    static {
        defpackage.xif xifVar = new defpackage.xif();
        a = xifVar;
        defpackage.abox.P(defpackage.xif.class, xifVar);
    }

    private xif() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new java.lang.Object[]{"f", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.xif();
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
        return defpackage.abox.L(defpackage.xif.class);
    }
}

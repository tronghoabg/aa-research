package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class absh extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abpg a = new defpackage.xit(6);
    public static final defpackage.absh b;
    public defpackage.absb c;
    public defpackage.abpf d = defpackage.aboy.a;
    private int e;

    static {
        defpackage.absh abshVar = new defpackage.absh();
        b = abshVar;
        defpackage.abox.P(defpackage.absh.class, abshVar);
    }

    private absh() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(b, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002,", new java.lang.Object[]{"e", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.absh();
        }
        if (i2 == 4) {
            return new defpackage.abor(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.abox.L(defpackage.absh.class);
    }
}

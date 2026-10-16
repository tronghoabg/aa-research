package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qug extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.qug a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public defpackage.quf g;
    public boolean h;
    public int i;

    static {
        defpackage.qug qugVar = new defpackage.qug();
        a = qugVar;
        defpackage.abox.P(defpackage.qug.class, qugVar);
    }

    private qug() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007င\u0006", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new defpackage.qug();
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
        return defpackage.abox.L(defpackage.qug.class);
    }
}

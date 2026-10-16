package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jcb extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.jcb a;
    public int b;
    public boolean c;
    public boolean d;
    public long e = 5000;
    public long f = 5000;
    public long g = 250;
    public long h = 250;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;

    static {
        defpackage.jcb jcbVar = new defpackage.jcb();
        a = jcbVar;
        defpackage.abox.P(defpackage.jcb.class, jcbVar);
    }

    private jcb() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u000f\u0000\u0001\u0002&\u000f\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0004\bဂ\u0005\rဂ\u0006\u000eဂ\u0007 ဇ\b!ဇ\t\"င\n#င\u000b$ဇ\f%ဇ\r&ဇ\u000e", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (i2 == 3) {
            return new defpackage.jcb();
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
        return defpackage.abox.L(defpackage.jcb.class);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pku extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.pku a;
    public int b;
    public defpackage.pks c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public int j;
    public int k;
    public long m;
    public boolean o;
    public long p;
    private byte q = 2;
    public java.lang.String l = "";
    public defpackage.abnv n = defpackage.abnv.d;

    static {
        defpackage.pku pkuVar = new defpackage.pku();
        a = pkuVar;
        defpackage.abox.P(defpackage.pku.class, pkuVar);
    }

    private pku() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bင\u0007\tင\b\nဈ\t\u000bဂ\n\fည\u000b\rဇ\f\u000eဂ\r", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new defpackage.pku();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.pku.class);
        }
        this.q = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

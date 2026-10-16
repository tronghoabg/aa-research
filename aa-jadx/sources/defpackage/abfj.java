package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abfj extends defpackage.abou implements defpackage.abov {
    public static final defpackage.abfj a;
    public int b;
    public defpackage.abfm c;
    public defpackage.abdk d;
    public defpackage.abfk e;
    public long f;
    public int g;
    public defpackage.ablv h;
    public defpackage.ablv i;
    public defpackage.ablv j;
    public int k;
    public int l;
    public boolean m;
    private byte n = 2;

    static {
        defpackage.abfj abfjVar = new defpackage.abfj();
        a = abfjVar;
        defpackage.abox.P(defpackage.abfj.class, abfjVar);
    }

    private abfj() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004စ\u0003\u0005ဉ\u0005\u0007ဉ\u0006\bင\b\tင\t\nဇ\n\u000bဉ\u0007\fင\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "h", "i", "k", "l", "m", "j", "g"});
        }
        if (i2 == 3) {
            return new defpackage.abfj();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.abfj.class);
        }
        this.n = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

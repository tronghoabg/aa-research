package defpackage;

/* loaded from: classes3.dex */
public final class ajel extends abnv implements abox {
    public static final ajel a;
    public int b;
    public int c;
    public long d;
    public ajey g;
    public int h;
    public long i;
    public ajeu j;
    public long k;
    public long l;
    private byte m = 2;
    public String e = "";
    public String f = "";

    static {
        ajel ajelVar = new ajel();
        a = ajelVar;
        abnv.P(ajel.class, ajelVar);
    }

    private ajel() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            abob abobVar = achi.n;
            return new abpg(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", abobVar, "h", abobVar, "i", "j", "k", "d", "e", "f", "g", "l"});
        }
        if (i2 == 3) {
            return new ajel();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajel.class);
        }
        this.m = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

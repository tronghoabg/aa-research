package defpackage;

/* loaded from: classes2.dex */
public final class ajfk extends abnv implements abox {
    public static final ajfk a;
    public int b;
    public int c;
    public ajfn e;
    public long f;
    private byte g = 2;
    public aboh d = abpf.b;

    static {
        ajfk ajfkVar = new ajfk();
        a = ajfkVar;
        abnv.P(ajfk.class, ajfkVar);
    }

    private ajfk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0001\u0001\u0002Л\u0003᠌\u0001\u0006ဉ\u0004\u0007စ\u0005", new Object[]{"b", "d", ajfl.class, "c", ajfp.b, "e", "f"});
        }
        if (i2 == 3) {
            return new ajfk();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajfk.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

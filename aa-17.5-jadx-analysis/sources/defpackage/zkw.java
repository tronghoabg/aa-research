package defpackage;

/* loaded from: classes3.dex */
public final class zkw extends abns implements abnt {
    public static final zkw a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        zkw zkwVar = new zkw();
        a = zkwVar;
        abnv.P(zkw.class, zkwVar);
    }

    private zkw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001;\u0000\u0003<\u0000", new Object[]{"c", "b", zkb.class});
        }
        if (i2 == 3) {
            return new zkw();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zkw.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

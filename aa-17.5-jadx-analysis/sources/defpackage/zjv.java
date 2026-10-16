package defpackage;

/* loaded from: classes3.dex */
public final class zjv extends abns implements abnt {
    public static final zjv a;
    private int b;
    private zjs c;
    private zka d;
    private byte e = 2;

    static {
        zjv zjvVar = new zjv();
        a = zjvVar;
        abnv.P(zjv.class, zjvVar);
    }

    private zjv() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u001e%\u0002\u0000\u0000\u0002\u001eᐉ\r%ᐉ\u0017", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zjv();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zjv.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

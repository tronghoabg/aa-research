package defpackage;

/* loaded from: classes3.dex */
public final class zjk extends abnv implements abox {
    public static final zjk a;
    private int b;
    private zkk c;
    private zkl d;
    private zkm e;
    private zai f;
    private byte g = 2;

    static {
        zjk zjkVar = new zjk();
        a = zjkVar;
        abnv.P(zjk.class, zjkVar);
    }

    private zjk() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0013\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0004ᐉ\u0002\fᐉ\r\u0013ᐉ\u0012", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new zjk();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zjk.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

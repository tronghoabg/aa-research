package defpackage;

/* loaded from: classes3.dex */
public final class zlk extends abnv implements abox {
    public static final zlk a;
    private int b;
    private zlj c;
    private zlj d;
    private byte e = 2;

    static {
        zlk zlkVar = new zlk();
        a = zlkVar;
        abnv.P(zlk.class, zlkVar);
    }

    private zlk() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zlk();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zlk.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

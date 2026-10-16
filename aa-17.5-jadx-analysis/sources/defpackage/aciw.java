package defpackage;

/* loaded from: classes3.dex */
public final class aciw extends abnv implements abox {
    public static final aciw a;
    public int b;
    public int c;
    public int d;
    private byte g = 2;
    public int e = 1;
    public abms f = abms.d;

    static {
        aciw aciwVar = new aciw();
        a = aciwVar;
        abnv.P(aciw.class, aciwVar);
    }

    private aciw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0017\u001a\u0004\u0000\u0000\u0003\u0017ᔄ\u0000\u0018ᔄ\u0001\u0019ᔊ\u0003\u001a᠌\u0002", new Object[]{"b", "c", "d", "f", "e", achi.l});
        }
        if (i2 == 3) {
            return new aciw();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aciw.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class abzk extends abns implements abnt {
    public static final abzk a;
    private int b;
    private abzj c;
    private byte d = 2;

    static {
        abzk abzkVar = new abzk();
        a = abzkVar;
        abnv.P(abzk.class, abzkVar);
    }

    private abzk() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abzk();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abzk.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class abbu extends abns implements abnt {
    public static final abbu a;
    private int b;
    private abdl c;
    private byte d = 2;

    static {
        abbu abbuVar = new abbu();
        a = abbuVar;
        abnv.P(abbu.class, abbuVar);
    }

    private abbu() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001\u000bᐉ\u0005", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abbu();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abbu.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

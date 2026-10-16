package defpackage;

/* loaded from: classes3.dex */
public final class abdr extends abns implements abnt {
    public static final abdr a;
    public long b;
    public aboh c;
    public aboh d;
    public abeu e;
    private int f;
    private byte g = 2;

    static {
        abdr abdrVar = new abdr();
        a = abdrVar;
        abnv.P(abdr.class, abdrVar);
    }

    private abdr() {
        abpf abpfVar = abpf.b;
        this.c = abpfVar;
        this.d = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0002\u0001စ\u0000\u0002Л\u0005Л\u0006ဉ\u0003", new Object[]{"f", "b", "c", abcf.class, "d", abdq.class, "e"});
        }
        if (i2 == 3) {
            return new abdr();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abdr.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

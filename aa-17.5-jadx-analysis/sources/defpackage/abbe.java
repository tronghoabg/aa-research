package defpackage;

/* loaded from: classes3.dex */
public final class abbe extends abns implements abnt {
    public static final abbe a;
    public int b;
    public abez c;
    public aboh d;
    public int e;
    public abdv f;
    public abde g;
    public abay h;
    public abfg i;
    public abct j;
    public abee k;
    public abei l;
    public abec m;
    public int n;
    public aboh o;
    public aboh p;
    private abls q;
    private abbv r;
    private byte s = 2;

    static {
        abbe abbeVar = new abbe();
        a = abbeVar;
        abnv.P(abbe.class, abbeVar);
    }

    private abbe() {
        abpf abpfVar = abpf.b;
        this.d = abpfVar;
        abms abmsVar = abms.d;
        this.o = abpfVar;
        this.p = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.s);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0003\n\u0001ᐉ\u0000\u0002ဉ\u0001\u0003Л\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\u000b\rဉ\u0012\u000eင\u0013\u000f\u001b\u0010ဋ\u0002\u0011ᐉ\r\u0013\u001b\u0014ᐉ\u000e", new Object[]{"b", "q", "c", "d", abdr.class, "f", "g", "h", "i", "j", "k", "m", "n", "o", abcx.class, "e", "l", "p", abbm.class, "r"});
        }
        if (i2 == 3) {
            return new abbe();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abbe.class);
        }
        this.s = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

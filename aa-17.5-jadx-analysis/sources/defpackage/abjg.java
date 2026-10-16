package defpackage;

/* loaded from: classes3.dex */
public final class abjg extends abns implements abnt {
    public static final abjg a;
    public aboh b;
    public aboh c;
    public abog d;
    public abog e;
    public aboh f;
    public aboh g;
    public abim h;
    public abod i;
    public int j;
    private int k;
    private byte l = 2;

    static {
        abjg abjgVar = new abjg();
        a = abjgVar;
        abnv.P(abjg.class, abjgVar);
    }

    private abjg() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
        abor aborVar = abor.a;
        this.d = aborVar;
        this.e = aborVar;
        this.f = abpfVar;
        this.g = abpfVar;
        this.i = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0007\u0002\u0001Л\u0002%\u0003\u001b\u0004\u001b\u0005ဉ\u0000\bЛ\t%\n'\u000b᠌\u0002", new Object[]{"k", "b", abje.class, "d", "f", abal.class, "g", abfc.class, "h", "c", abje.class, "e", "i", "j", abho.c});
        }
        if (i2 == 3) {
            return new abjg();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abjg.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

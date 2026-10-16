package defpackage;

/* loaded from: classes3.dex */
public final class abkz extends abnv implements abox {
    public static final abkz a;
    public int b;
    public int e;
    public zbi f;
    private zbo g;
    private byte h = 2;
    public String c = "";
    public String d = "";

    static {
        abkz abkzVar = new abkz();
        a = abkzVar;
        abnv.P(abkz.class, abkzVar);
    }

    private abkz() {
        abnw abnwVar = abnw.a;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0004\u001b\u0005\u0000\u0000\u0001\u0004ᐉ\u0004\tဈ\u0001\u000fင\u0006\u0011ဈ\u0000\u001bဉ\u0016", new Object[]{"b", "g", "d", "e", "c", "f"});
        }
        if (i2 == 3) {
            return new abkz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abkz.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

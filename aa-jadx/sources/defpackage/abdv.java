package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abdv extends defpackage.abou implements defpackage.abdx {
    public static final defpackage.abdv a;
    public int b;
    public defpackage.abdr c;
    public defpackage.abdr d;
    public defpackage.abbj e;
    public defpackage.abfb f;
    public int h;
    public int i;
    public int j;
    public int k;
    public int n;
    public int o;
    public defpackage.abpj q;
    public defpackage.abpj r;
    public defpackage.abpj s;
    public defpackage.abpj t;
    public defpackage.abeo u;
    public int v;
    private defpackage.abfq x;
    private byte y = 2;
    public int g = 9;
    public int l = -1;
    public long m = -1;
    public defpackage.abpf p = defpackage.aboy.a;

    static {
        defpackage.abdv abdvVar = new defpackage.abdv();
        a = abdvVar;
        defpackage.abox.P(defpackage.abdv.class, abdvVar);
    }

    private abdv() {
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.q = abqhVar;
        this.r = abqhVar;
        this.s = abqhVar;
        this.t = abqhVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.y);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0015\u0000\u0001\u0001Ϩ\u0015\u0000\u0005\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဂ\r\u0007᠌\u0005\bင\f\tင\u000e\nဆ\u000f\u000bင\u0007\fင\b\rင\t\u000eင\u0006\u0010'\u0011\u001b\u0012Л\u0013\u001b\u0014\u001b\u0016ᐉ\u0010\u001eဉ\u0014Ϩင\u0015", new java.lang.Object[]{"b", "c", "d", "e", "f", "m", "g", defpackage.abdh.d, "l", "n", "o", "i", "j", "k", "h", "p", "q", defpackage.abbr.class, "r", defpackage.abdt.class, "s", defpackage.abdu.class, "t", defpackage.abcr.class, "u", "x", "v"});
        }
        if (i2 == 3) {
            return new defpackage.abdv();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.abdv.class);
        }
        this.y = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    @Override // defpackage.abdx
    public final defpackage.abdr b() {
        defpackage.abdr abdrVar = this.c;
        return abdrVar == null ? defpackage.abdr.a : abdrVar;
    }

    @Override // defpackage.abdx
    public final defpackage.abdr c() {
        defpackage.abdr abdrVar = this.d;
        return abdrVar == null ? defpackage.abdr.a : abdrVar;
    }

    @Override // defpackage.abdx
    public final boolean d() {
        return (this.b & 2) != 0;
    }
}

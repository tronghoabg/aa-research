package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yyv extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yyv a;
    public int b;
    public int j;
    public int k;
    public int m;
    public defpackage.abpf n;
    public defpackage.abpf o;
    public defpackage.abpf p;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";
    public java.lang.String h = "";
    public java.lang.String i = "";
    public java.lang.String l = "";

    static {
        defpackage.yyv yyvVar = new defpackage.yyv();
        a = yyvVar;
        defpackage.abox.P(defpackage.yyv.class, yyvVar);
    }

    private yyv() {
        defpackage.aboy aboyVar = defpackage.aboy.a;
        this.n = aboyVar;
        this.o = aboyVar;
        this.p = aboyVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\nင\t\u000bင\n\fဈ\u000b\rင\f\u000e\u0016\u000f\u0016\u0010\u0016", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new defpackage.yyv();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.abox.L(defpackage.yyv.class);
    }
}

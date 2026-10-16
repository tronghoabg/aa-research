package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abts extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abts a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public defpackage.abpj g;
    public defpackage.abpj h;
    public java.lang.String i;
    public abtp j;
    public defpackage.abpj k;

    static {
        defpackage.abts abtsVar = new defpackage.abts();
        a = abtsVar;
        defpackage.abox.P(defpackage.abts.class, abtsVar);
    }

    private abts() {
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.g = abqhVar;
        this.h = abqhVar;
        this.i = "";
        this.k = abqhVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003ဃ\u0002\u0004᠌\u0003\u0005\u001b\u0006\u001b\nဈ\u0006\u000bဉ\u0007\f\u001b", new java.lang.Object[]{"b", "c", "d", "e", "f", abtn.d, "g", abtr.class, "h", abtq.class, "i", "j", "k", abto.class});
        }
        if (i2 == 3) {
            return new defpackage.abts();
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
        return defpackage.abox.L(defpackage.abts.class);
    }
}

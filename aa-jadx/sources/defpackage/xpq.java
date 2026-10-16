package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xpq extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abpg a = new defpackage.xit(5);
    public static final defpackage.xpq b;
    public int c;
    public defpackage.xky d;
    public defpackage.xky e;
    public defpackage.xky f;
    public int g;
    public defpackage.abpf h = defpackage.aboy.a;
    public defpackage.abpj i;
    public defpackage.abpj j;
    public defpackage.xin k;

    static {
        defpackage.xpq xpqVar = new defpackage.xpq();
        b = xpqVar;
        defpackage.abox.P(defpackage.xpq.class, xpqVar);
    }

    private xpq() {
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.i = abqhVar;
        this.j = abqhVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(b, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ࠞ\u0006\u001b\u0007\u001b\bဉ\u0004", new java.lang.Object[]{"c", "d", "e", "f", "g", defpackage.xpv.a, "h", defpackage.xlv.u, "i", defpackage.xib.class, "j", defpackage.xka.class, "k"});
        }
        if (i2 == 3) {
            return new defpackage.xpq();
        }
        if (i2 == 4) {
            return new defpackage.abor(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.abox.L(defpackage.xpq.class);
    }
}

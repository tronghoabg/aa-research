package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abrz extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abrz a;
    public int b;
    public defpackage.abpj c = defpackage.abqh.b;
    public defpackage.abqv d;
    public defpackage.abqv e;

    static {
        defpackage.abrz abrzVar = new defpackage.abrz();
        a = abrzVar;
        defpackage.abox.P(defpackage.abrz.class, abrzVar);
    }

    private abrz() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"b", "c", absa.class, "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.abrz();
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
        return defpackage.abox.L(defpackage.abrz.class);
    }

    public final void b() {
        defpackage.abpj abpjVar = this.c;
        if (abpjVar.c()) {
            return;
        }
        this.c = defpackage.abox.I(abpjVar);
    }
}

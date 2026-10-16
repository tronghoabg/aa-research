package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acaq extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.acaq a;
    public int b;
    public long c;
    public defpackage.abpj d = defpackage.abqh.b;

    static {
        defpackage.acaq acaqVar = new defpackage.acaq();
        a = acaqVar;
        defpackage.abox.P(defpackage.acaq.class, acaqVar);
    }

    private acaq() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဃ\u0000\u0004\u001b", new java.lang.Object[]{"b", "c", "d", defpackage.acar.class});
        }
        if (i2 == 3) {
            return new defpackage.acaq();
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
        return defpackage.abox.L(defpackage.acaq.class);
    }

    public final void b() {
        defpackage.abpj abpjVar = this.d;
        if (abpjVar.c()) {
            return;
        }
        int size = abpjVar.size();
        this.d = abpjVar.d(size + size);
    }
}

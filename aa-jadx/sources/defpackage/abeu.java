package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abeu extends defpackage.abou implements defpackage.abov {
    public static final defpackage.abeu a;
    public long b;
    public defpackage.abpj c;
    public defpackage.abpj d;
    public defpackage.abfx e;
    private int f;
    private byte g = 2;

    static {
        defpackage.abeu abeuVar = new defpackage.abeu();
        a = abeuVar;
        defpackage.abox.P(defpackage.abeu.class, abeuVar);
    }

    private abeu() {
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.c = abqhVar;
        this.d = abqhVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0002\u0001စ\u0000\u0002Л\u0005Л\u0006ဉ\u0003", new java.lang.Object[]{"f", "b", "c", defpackage.abdi.class, "d", defpackage.abet.class, "e"});
        }
        if (i2 == 3) {
            return new defpackage.abeu();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.abeu.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abeh extends defpackage.abou implements defpackage.abov {
    public static final defpackage.abeh a;
    private byte c = 2;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.abeh abehVar = new defpackage.abeh();
        a = abehVar;
        defpackage.abox.P(defpackage.abeh.class, abehVar);
    }

    private abeh() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new java.lang.Object[]{"b", defpackage.abeg.class});
        }
        if (i2 == 3) {
            return new defpackage.abeh();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.abeh.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

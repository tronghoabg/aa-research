package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abeo extends defpackage.abou implements defpackage.abov {
    public static final defpackage.abeo a;
    private byte b = 2;

    static {
        defpackage.abeo abeoVar = new defpackage.abeo();
        a = abeoVar;
        defpackage.abox.P(defpackage.abeo.class, abeoVar);
    }

    private abeo() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.abeo();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.abeo.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

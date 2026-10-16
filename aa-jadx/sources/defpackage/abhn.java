package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abhn extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abhn a;
    public int b;
    public int c;
    public defpackage.abhm d;
    public int e;
    public defpackage.abhd j;
    private byte l = 2;
    public defpackage.abpf f = defpackage.aboy.a;
    public defpackage.abpj g = defpackage.abqh.b;
    public int h = -1;
    public int i = -1;
    public java.lang.String k = "";

    static {
        defpackage.abhn abhnVar = new defpackage.abhn();
        a = abhnVar;
        defpackage.abox.P(defpackage.abhn.class, abhnVar);
    }

    private abhn() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004'\u0005Л\u0006င\u0003\u0007င\u0004\bဉ\u0005\tဈ\u0006", new java.lang.Object[]{"b", "c", defpackage.abdh.r, "d", "e", "f", "g", defpackage.abif.class, "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new defpackage.abhn();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.abhn.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class ajha extends abnv implements abox {
    public static final ajha a;
    public int b;
    public int d;
    public abnf e;
    public abnf f;
    public long g;
    private byte h = 2;
    public String c = "";

    static {
        ajha ajhaVar = new ajha();
        a = ajhaVar;
        abnv.P(ajha.class, ajhaVar);
    }

    private ajha() {
        abor aborVar = abor.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0002\u0004ဉ\u0003\u0005ဉ\u0004\fဂ\u000b", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ajha();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajha.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

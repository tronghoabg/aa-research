package defpackage;

@Deprecated
/* loaded from: classes3.dex */
public final class abuf extends abns implements abnt {
    public static final abuf a;
    private byte b = 2;

    static {
        abuf abufVar = new abuf();
        a = abufVar;
        abnv.P(abuf.class, abufVar);
    }

    private abuf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0003\u0000", null);
        }
        if (i2 == 3) {
            return new abuf();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abuf.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

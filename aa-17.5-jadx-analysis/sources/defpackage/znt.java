package defpackage;

/* loaded from: classes3.dex */
public final class znt extends abns implements abnt {
    public static final znt a;
    private int b;
    private zns c;
    private byte d = 2;

    static {
        znt zntVar = new znt();
        a = zntVar;
        abnv.P(znt.class, zntVar);
    }

    private znt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new znt();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(znt.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

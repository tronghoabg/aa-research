package defpackage;

/* loaded from: classes3.dex */
public final class abju extends abnv implements abox {
    public static final abju a;
    public String b = "";
    public float c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    private int h;

    static {
        abju abjuVar = new abju();
        a = abjuVar;
        abnv.P(abju.class, abjuVar);
    }

    private abju() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ခ\u0001\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005", new Object[]{"h", "b", "c", "d", abho.l, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new abju();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(abju.class);
    }
}

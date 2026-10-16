package defpackage;

/* loaded from: classes3.dex */
public final class abby extends abnv implements abox {
    public static final abby a;
    public int b;
    public int c;
    public float d;
    public float e;
    public abam f;
    public abam g;
    public abam h;
    public abam i;
    public abam j;
    public abam k;

    static {
        abby abbyVar = new abby();
        a = abbyVar;
        abnv.P(abby.class, abbyVar);
    }

    private abby() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new abby();
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
        return abnv.L(abby.class);
    }
}

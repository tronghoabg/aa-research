package defpackage;

/* loaded from: classes3.dex */
public final class achh extends abnv implements abox {
    public static final achh a;
    public boolean b;
    public boolean c;
    public int d = 3;
    public float e = 0.7f;
    private int f;

    static {
        achh achhVar = new achh();
        a = achhVar;
        abnv.P(achh.class, achhVar);
    }

    private achh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ခ\u0003", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new achh();
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
        return abnv.L(achh.class);
    }
}

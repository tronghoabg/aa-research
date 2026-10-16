package defpackage;

/* loaded from: classes3.dex */
public final class acie extends abnv implements abox {
    public static final acie a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = 3;
    public int h = 80000000;
    public int i = -90000000;
    public int j = 90000000;

    static {
        acie acieVar = new acie();
        a = acieVar;
        abnv.P(acie.class, acieVar);
    }

    private acie() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\b\u0000\u0001\")\b\u0000\u0000\u0000\"င\u0000#င\u0001$င\u0002%င\u0003&᠌\u0004'င\u0005(င\u0006)င\u0007", new Object[]{"b", "c", "d", "e", "f", "g", achi.f, "h", "i", "j"});
        }
        if (i2 == 3) {
            return new acie();
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
        return abnv.L(acie.class);
    }
}

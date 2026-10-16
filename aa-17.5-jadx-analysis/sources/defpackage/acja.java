package defpackage;

/* loaded from: classes3.dex */
public final class acja extends abnv implements abox {
    public static final acja a;
    public int b;
    public aboh c;
    public aboh d;
    public int e;

    static {
        acja acjaVar = new acja();
        a = acjaVar;
        abnv.P(acja.class, acjaVar);
    }

    private acja() {
        abpf abpfVar = abpf.b;
        this.c = abpfVar;
        this.d = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001a\u0002\u001a\u0003င\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new acja();
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
        return abnv.L(acja.class);
    }
}

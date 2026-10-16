package defpackage;

/* loaded from: classes3.dex */
public final class abbw extends abnv implements abox {
    public static final abbw a;
    public int b;
    public aboh c;
    public aboh d;
    public aboh e;
    public abbx f;
    public abbx g;
    public abbx h;

    static {
        abbw abbwVar = new abbw();
        a = abbwVar;
        abnv.P(abbw.class, abbwVar);
    }

    private abbw() {
        abpf abpfVar = abpf.b;
        this.c = abpfVar;
        this.d = abpfVar;
        this.e = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"b", "c", abby.class, "d", abby.class, "e", abby.class, "f", "g", "h"});
        }
        if (i2 == 3) {
            return new abbw();
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
        return abnv.L(abbw.class);
    }
}

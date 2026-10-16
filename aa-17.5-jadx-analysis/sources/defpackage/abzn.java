package defpackage;

/* loaded from: classes.dex */
public final class abzn extends abnv implements abox {
    public static final abzn a;
    public int b;
    public long c;
    public aboh d = abpf.b;

    static {
        abzn abznVar = new abzn();
        a = abznVar;
        abnv.P(abzn.class, abznVar);
    }

    private abzn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဃ\u0000\u0004\u001b", new Object[]{"b", "c", "d", abzo.class});
        }
        if (i2 == 3) {
            return new abzn();
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
        return abnv.L(abzn.class);
    }

    public final void b() {
        aboh abohVar = this.d;
        if (abohVar.c()) {
            return;
        }
        int size = abohVar.size();
        this.d = abohVar.d(size + size);
    }
}

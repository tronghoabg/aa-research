package defpackage;

/* loaded from: classes3.dex */
public final class absl extends abnv implements abox {
    public static final absl a;
    public int b;
    public absm c;
    public aboh d = abpf.b;

    static {
        absl abslVar = new absl();
        a = abslVar;
        abnv.P(absl.class, abslVar);
    }

    private absl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", abso.class});
        }
        if (i2 == 3) {
            return new absl();
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
        return abnv.L(absl.class);
    }
}

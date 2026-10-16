package defpackage;

/* loaded from: classes3.dex */
public final class zkq extends abnv implements abox {
    public static final zkq a;
    public int b;
    public int c;

    static {
        zkq zkqVar = new zkq();
        a = zkqVar;
        abnv.P(zkq.class, zkqVar);
    }

    private zkq() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", zkp.a});
        }
        if (i2 == 3) {
            return new zkq();
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
        return abnv.L(zkq.class);
    }
}

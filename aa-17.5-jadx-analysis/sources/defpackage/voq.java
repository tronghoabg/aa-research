package defpackage;

/* loaded from: classes3.dex */
public final class voq extends abnv implements abox {
    public static final voq a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        voq voqVar = new voq();
        a = voqVar;
        abnv.P(voq.class, voqVar);
    }

    private voq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new voq();
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
        return abnv.L(voq.class);
    }
}

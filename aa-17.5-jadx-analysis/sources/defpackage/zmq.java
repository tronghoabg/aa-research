package defpackage;

/* loaded from: classes3.dex */
public final class zmq extends abnv implements abox {
    public static final zmq a;

    static {
        zmq zmqVar = new zmq();
        a = zmqVar;
        abnv.P(zmq.class, zmqVar);
    }

    private zmq() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zmq();
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
        return abnv.L(zmq.class);
    }
}

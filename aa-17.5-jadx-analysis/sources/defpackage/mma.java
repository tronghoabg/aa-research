package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
public enum mma {
    DRIVER_ALIGNED(yzy.dP),
    PASSENGER_ALIGNED(yzy.dQ);

    public static final mma c = PASSENGER_ALIGNED;
    public static final yfq d;
    public final yzy e;

    static {
        Stream map = DesugarArrays.stream(values()).map(new kqm(2));
        int i = yfq.d;
        d = (yfq) map.collect(ycm.a);
    }

    mma(yzy yzyVar) {
        this.e = yzyVar;
    }

    public static mma a(String str) {
        mma mmaVar = DRIVER_ALIGNED;
        return mmaVar.name().equals(str) ? mmaVar : c;
    }
}

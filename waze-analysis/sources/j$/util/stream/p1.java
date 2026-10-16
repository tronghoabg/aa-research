package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p1 extends q1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, LongConsumer longConsumer) {
        super(q1Var, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        int i3 = this.m;
        Object obj = this.n;
        switch (i3) {
            case 0:
                return new o1(t5Var, (g0) obj);
            case 1:
                return new m1(t5Var, (LongConsumer) obj, 1);
            case 2:
                return new g5(t5Var, (g0) obj, 0);
            default:
                return new k(t5Var, (ToLongFunction) obj, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(a aVar, int i2, Object obj, int i3) {
        super(aVar, i2, 1);
        this.m = i3;
        this.n = obj;
    }
}

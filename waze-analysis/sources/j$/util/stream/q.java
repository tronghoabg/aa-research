package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ToDoubleFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q extends w {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, DoubleConsumer doubleConsumer) {
        super(wVar, 0, 1);
        this.m = 2;
        this.n = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        int i3 = this.m;
        Object obj = this.n;
        switch (i3) {
            case 0:
                return new m(t5Var, (DoubleUnaryOperator) obj, 1);
            case 1:
                return new u(t5Var, (g0) obj);
            case 2:
                return new m(t5Var, (DoubleConsumer) obj, 2);
            case 3:
                return new k(t5Var, (ToDoubleFunction) obj, 6);
            default:
                return new g5(t5Var, (g0) obj, 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, int i2, Object obj, int i3) {
        super(aVar, i2, 1);
        this.m = i3;
        this.n = obj;
    }
}

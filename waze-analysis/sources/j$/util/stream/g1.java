package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g1 extends k1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var, IntConsumer intConsumer) {
        super(l1Var, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        int i3 = this.m;
        Object obj = this.n;
        switch (i3) {
            case 0:
                return new f1(t5Var, (IntConsumer) obj, 1);
            case 1:
                return new j1(t5Var, (g0) obj);
            case 2:
                return new k(t5Var, (ToIntFunction) obj, 4);
            default:
                return new i5(t5Var, (g0) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(a aVar, int i2, Object obj, int i3) {
        super(aVar, i2, 1);
        this.m = i3;
        this.n = obj;
    }
}

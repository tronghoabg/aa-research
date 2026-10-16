package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p extends k5 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l5 l5Var, Consumer consumer) {
        super(l5Var, 0, 1);
        this.m = 3;
        this.n = consumer;
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        int i3 = this.m;
        Object obj = this.n;
        switch (i3) {
            case 0:
                return new m(t5Var, (DoubleFunction) obj, 0);
            case 1:
                return new f1(t5Var, (IntFunction) obj, 0);
            case 2:
                return new m1(t5Var, (LongFunction) obj, 0);
            case 3:
                return new k(t5Var, (Consumer) obj, 1);
            case 4:
                return new k(t5Var, (Predicate) obj, 2);
            case 5:
                return new k(t5Var, (Function) obj, 3);
            default:
                return new j(t5Var, (g0) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, int i2, Object obj, int i3) {
        super(aVar, i2, 1);
        this.m = i3;
        this.n = obj;
    }
}

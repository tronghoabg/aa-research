package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u8 extends k5 implements e9 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Predicate n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(l5 l5Var, int i2, Predicate predicate, int i3) {
        super(l5Var, i2, 0);
        this.m = i3;
        this.n = predicate;
    }

    @Override // j$.util.stream.a
    public final m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.m) {
            case 0:
                return (m2) new h9(this, aVar, spliterator, intFunction).invoke();
            default:
                return (m2) new g9(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        int i2 = this.m;
        Predicate predicate = this.n;
        switch (i2) {
            case 0:
                return j7.ORDERED.k(aVar.f50316f) ? J(aVar, spliterator, new h1(17)).spliterator() : new n9(aVar.S(spliterator), predicate, 1);
            default:
                return j7.ORDERED.k(aVar.f50316f) ? J(aVar, spliterator, new h1(17)).spliterator() : new n9(aVar.S(spliterator), predicate, 0);
        }
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        switch (this.m) {
            case 0:
                return new j(t5Var, this.n);
            default:
                return e(t5Var, false);
        }
    }

    @Override // j$.util.stream.e9
    public f9 e(t5 t5Var, boolean z) {
        return new v8(t5Var, this.n, z);
    }
}

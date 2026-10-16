package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class z8 extends k1 implements e9 {
    @Override // j$.util.stream.a
    public final m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        return (m2) new g9(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return j7.ORDERED.k(aVar.f50316f) ? J(aVar, spliterator, new d8(2)).spliterator() : new j9((Spliterator.OfInt) aVar.S(spliterator));
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        return new y8(t5Var);
    }

    @Override // j$.util.stream.e9
    public final f9 e(t5 t5Var, boolean z) {
        return new y8(t5Var);
    }
}

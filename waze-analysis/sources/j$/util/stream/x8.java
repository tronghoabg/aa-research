package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class x8 extends k1 {
    @Override // j$.util.stream.a
    public final m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        return (m2) new h9(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return j7.ORDERED.k(aVar.f50316f) ? J(aVar, spliterator, new d8(1)).spliterator() : new k9((Spliterator.OfInt) aVar.S(spliterator));
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        w8 w8Var = new w8(t5Var);
        w8Var.f50665b = true;
        return w8Var;
    }
}

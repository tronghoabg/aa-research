package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class z0 implements Spliterator.OfPrimitive {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f50739a;

    public /* synthetic */ z0(a1 a1Var) {
        this.f50739a = a1Var;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(a1 a1Var) {
        if (a1Var == null) {
            return null;
        }
        return a1Var instanceof y0 ? ((y0) a1Var).f50735a : a1Var instanceof s0 ? r0.a((s0) a1Var) : a1Var instanceof Spliterator.OfInt ? u0.a((Spliterator.OfInt) a1Var) : a1Var instanceof x0 ? w0.a((x0) a1Var) : new z0(a1Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f50739a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        a1 a1Var = this.f50739a;
        if (obj instanceof z0) {
            obj = ((z0) obj).f50739a;
        }
        return a1Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f50739a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f50739a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f50739a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f50739a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return this.f50739a.hasCharacteristics(i2);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50739a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f50739a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f50739a.trySplit());
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f50739a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f50739a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return c1.a(this.f50739a.trySplit());
    }
}

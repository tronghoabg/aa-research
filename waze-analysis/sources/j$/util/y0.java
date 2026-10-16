package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class y0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfPrimitive f50735a;

    public /* synthetic */ y0(Spliterator.OfPrimitive ofPrimitive) {
        this.f50735a = ofPrimitive;
    }

    public static /* synthetic */ a1 a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof z0 ? ((z0) ofPrimitive).f50739a : ofPrimitive instanceof Spliterator.OfDouble ? q0.a((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? t0.a((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? v0.a((Spliterator.OfLong) ofPrimitive) : new y0(ofPrimitive);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f50735a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.f50735a;
        if (obj instanceof y0) {
            obj = ((y0) obj).f50735a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f50735a.estimateSize();
    }

    @Override // j$.util.a1
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f50735a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f50735a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f50735a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return this.f50735a.hasCharacteristics(i2);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50735a.hashCode();
    }

    @Override // j$.util.a1
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f50735a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.a1, j$.util.Spliterator
    public final /* synthetic */ a1 trySplit() {
        return a(this.f50735a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f50735a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f50735a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return b1.a(this.f50735a.trySplit());
    }
}

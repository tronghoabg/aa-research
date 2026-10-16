package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class q0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfDouble f50293a;

    public /* synthetic */ q0(Spliterator.OfDouble ofDouble) {
        this.f50293a = ofDouble;
    }

    public static /* synthetic */ s0 a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof r0 ? ((r0) ofDouble).f50304a : new q0(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f50293a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.f50293a;
        if (obj instanceof q0) {
            obj = ((q0) obj).f50293a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f50293a.estimateSize();
    }

    @Override // j$.util.a1
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f50293a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f50293a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f50293a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return this.f50293a.hasCharacteristics(i2);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50293a.hashCode();
    }

    @Override // j$.util.a1
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f50293a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.s0, j$.util.a1, j$.util.Spliterator
    public final /* synthetic */ s0 trySplit() {
        return a(this.f50293a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f50293a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.s0
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f50293a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f50293a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.s0
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f50293a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.a1, j$.util.Spliterator
    public final /* synthetic */ a1 trySplit() {
        return y0.a(this.f50293a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return b1.a(this.f50293a.trySplit());
    }
}

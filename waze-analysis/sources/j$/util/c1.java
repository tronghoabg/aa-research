package j$.util;

import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class c1 implements java.util.Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator f50143a;

    public /* synthetic */ c1(Spliterator spliterator) {
        this.f50143a = spliterator;
    }

    public static /* synthetic */ java.util.Spliterator a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof b1 ? ((b1) spliterator).f50137a : spliterator instanceof a1 ? z0.a((a1) spliterator) : new c1(spliterator);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f50143a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator spliterator = this.f50143a;
        if (obj instanceof c1) {
            obj = ((c1) obj).f50143a;
        }
        return spliterator.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f50143a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f50143a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f50143a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f50143a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return this.f50143a.hasCharacteristics(i2);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50143a.hashCode();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f50143a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return a(this.f50143a.trySplit());
    }
}

package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class v0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfLong f50733a;

    public /* synthetic */ v0(Spliterator.OfLong ofLong) {
        this.f50733a = ofLong;
    }

    public static /* synthetic */ x0 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof w0 ? ((w0) ofLong).f50734a : new v0(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f50733a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f50733a;
        if (obj instanceof v0) {
            obj = ((v0) obj).f50733a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f50733a.estimateSize();
    }

    @Override // j$.util.a1
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f50733a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f50733a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f50733a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return this.f50733a.hasCharacteristics(i2);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50733a.hashCode();
    }

    @Override // j$.util.a1
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f50733a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.x0, j$.util.a1, j$.util.Spliterator
    public final /* synthetic */ x0 trySplit() {
        return a(this.f50733a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f50733a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.x0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f50733a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f50733a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.x0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f50733a.tryAdvance(longConsumer);
    }

    @Override // j$.util.a1, j$.util.Spliterator
    public final /* synthetic */ a1 trySplit() {
        return y0.a(this.f50733a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return b1.a(this.f50733a.trySplit());
    }
}

package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class Y implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfLong f37774a;

    private /* synthetic */ Y(Spliterator.OfLong ofLong) {
        this.f37774a = ofLong;
    }

    public static /* synthetic */ a0 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof Z ? ((Z) ofLong).f37775a : new Y(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f37774a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f37774a;
        if (obj instanceof Y) {
            obj = ((Y) obj).f37774a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f37774a.estimateSize();
    }

    @Override // j$.util.d0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37774a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37774a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.a0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f37774a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f37774a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f37774a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return this.f37774a.hasCharacteristics(i5);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37774a.hashCode();
    }

    @Override // j$.util.d0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f37774a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f37774a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.a0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f37774a.tryAdvance(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return e0.a(this.f37774a.trySplit());
    }

    @Override // j$.util.a0, j$.util.d0, j$.util.Spliterator
    public final /* synthetic */ a0 trySplit() {
        return a(this.f37774a.trySplit());
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final /* synthetic */ d0 trySplit() {
        return b0.a(this.f37774a.trySplit());
    }
}

package j$.util.concurrent;

import j$.util.S;
import j$.util.V;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class y implements V {

    /* renamed from: a, reason: collision with root package name */
    long f37862a;

    /* renamed from: b, reason: collision with root package name */
    final long f37863b;

    /* renamed from: c, reason: collision with root package name */
    final double f37864c;

    /* renamed from: d, reason: collision with root package name */
    final double f37865d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        S.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return S.e(this, i5);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return S.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    y(long j8, long j10, double d3, double d5) {
        this.f37862a = j8;
        this.f37863b = j10;
        this.f37864c = d3;
        this.f37865d = d5;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j8 = this.f37862a;
        long j10 = (this.f37863b + j8) >>> 1;
        if (j10 <= j8) {
            return null;
        }
        this.f37862a = j10;
        return new y(j8, j10, this.f37864c, this.f37865d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37863b - this.f37862a;
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j8 = this.f37862a;
        if (j8 >= this.f37863b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().c(this.f37864c, this.f37865d));
        this.f37862a = j8 + 1;
        return true;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j8 = this.f37862a;
        long j10 = this.f37863b;
        if (j8 < j10) {
            this.f37862a = j10;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.c(this.f37864c, this.f37865d));
                j8++;
            } while (j8 < j10);
        }
    }
}

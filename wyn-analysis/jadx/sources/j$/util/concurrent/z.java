package j$.util.concurrent;

import j$.util.S;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class z implements Spliterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    long f37866a;

    /* renamed from: b, reason: collision with root package name */
    final long f37867b;

    /* renamed from: c, reason: collision with root package name */
    final int f37868c;

    /* renamed from: d, reason: collision with root package name */
    final int f37869d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        S.b(this, consumer);
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
        return S.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    z(long j8, long j10, int i5, int i10) {
        this.f37866a = j8;
        this.f37867b = j10;
        this.f37868c = i5;
        this.f37869d = i10;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z trySplit() {
        long j8 = this.f37866a;
        long j10 = (this.f37867b + j8) >>> 1;
        if (j10 <= j8) {
            return null;
        }
        this.f37866a = j10;
        return new z(j8, j10, this.f37868c, this.f37869d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37867b - this.f37866a;
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j8 = this.f37866a;
        if (j8 >= this.f37867b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().d(this.f37868c, this.f37869d));
        this.f37866a = j8 + 1;
        return true;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j8 = this.f37866a;
        long j10 = this.f37867b;
        if (j8 < j10) {
            this.f37866a = j10;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.d(this.f37868c, this.f37869d));
                j8++;
            } while (j8 < j10);
        }
    }
}

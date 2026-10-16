package j$.util.concurrent;

import j$.util.S;
import j$.util.a0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class A implements a0 {

    /* renamed from: a, reason: collision with root package name */
    long f37786a;

    /* renamed from: b, reason: collision with root package name */
    final long f37787b;

    /* renamed from: c, reason: collision with root package name */
    final long f37788c;

    /* renamed from: d, reason: collision with root package name */
    final long f37789d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        S.c(this, consumer);
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
        return S.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    A(long j8, long j10, long j11, long j12) {
        this.f37786a = j8;
        this.f37787b = j10;
        this.f37788c = j11;
        this.f37789d = j12;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A trySplit() {
        long j8 = this.f37786a;
        long j10 = (this.f37787b + j8) >>> 1;
        if (j10 <= j8) {
            return null;
        }
        this.f37786a = j10;
        return new A(j8, j10, this.f37788c, this.f37789d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37787b - this.f37786a;
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j8 = this.f37786a;
        if (j8 >= this.f37787b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().e(this.f37788c, this.f37789d));
        this.f37786a = j8 + 1;
        return true;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j8 = this.f37786a;
        long j10 = this.f37787b;
        if (j8 < j10) {
            this.f37786a = j10;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                longConsumer.accept(threadLocalRandomCurrent.e(this.f37788c, this.f37789d));
                j8++;
            } while (j8 < j10);
        }
    }
}

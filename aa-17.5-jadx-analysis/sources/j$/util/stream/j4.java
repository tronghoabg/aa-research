package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class j4 implements Spliterator, Consumer {
    public final Spliterator a;
    public final boolean b;
    public final long c;
    public final AtomicLong d;
    public Object e;

    public j4(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.c = j2 >= 0 ? j2 : 0L;
        this.d = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public final long a(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long jMin;
        do {
            atomicLong = this.d;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.c;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.e = obj;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        x3 x3Var = null;
        while (true) {
            k4 k4Var = this.d.get() > 0 ? k4.MAYBE_MORE : this.b ? k4.UNLIMITED : k4.NO_MORE;
            if (k4Var == k4.NO_MORE) {
                return;
            }
            k4 k4Var2 = k4.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (k4Var != k4Var2) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (x3Var == null) {
                x3Var = new x3();
            } else {
                x3Var.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(x3Var)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jA = a(j);
            for (int i = 0; i < jA; i++) {
                consumer.accept(x3Var.b[i]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        do {
            if ((this.d.get() > 0 ? k4.MAYBE_MORE : this.b ? k4.UNLIMITED : k4.NO_MORE) == k4.NO_MORE || !this.a.tryAdvance(this)) {
                return false;
            }
        } while (a(1L) != 1);
        consumer.accept(this.e);
        this.e = null;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.d.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return new j4(spliteratorTrySplit, this);
    }

    public j4(Spliterator spliterator, j4 j4Var) {
        this.a = spliterator;
        this.b = j4Var.b;
        this.d = j4Var.d;
        this.c = j4Var.c;
    }
}

package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class j4 implements j$.util.Spliterator, java.util.function.Consumer {
    public final j$.util.Spliterator a;
    public final boolean b;
    public final long c;
    public final java.util.concurrent.atomic.AtomicLong d;
    public java.lang.Object e;

    public j4(j$.util.Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.c = j2 >= 0 ? j2 : 0L;
        this.d = new java.util.concurrent.atomic.AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public final long a(long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j2;
        boolean z;
        long jMin;
        do {
            atomicLong = this.d;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                jMin = java.lang.Math.min(j2, j);
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
            return java.lang.Math.max(j - jMin, 0L);
        }
        long j3 = this.c;
        return j2 > j3 ? java.lang.Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.e = obj;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
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
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        consumer.getClass();
        j$.util.stream.x3 x3Var = null;
        while (true) {
            j$.util.stream.k4 k4Var = this.d.get() > 0 ? j$.util.stream.k4.MAYBE_MORE : this.b ? j$.util.stream.k4.UNLIMITED : j$.util.stream.k4.NO_MORE;
            if (k4Var == j$.util.stream.k4.NO_MORE) {
                return;
            }
            j$.util.stream.k4 k4Var2 = j$.util.stream.k4.MAYBE_MORE;
            j$.util.Spliterator spliterator = this.a;
            if (k4Var != k4Var2) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (x3Var == null) {
                x3Var = new j$.util.stream.x3();
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
    public final /* synthetic */ java.util.Comparator getComparator() {
        return j$.util.Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        j$.util.stream.k4 k4Var;
        consumer.getClass();
        do {
            if (this.d.get() > 0) {
                k4Var = j$.util.stream.k4.MAYBE_MORE;
            } else {
                k4Var = this.b ? j$.util.stream.k4.UNLIMITED : j$.util.stream.k4.NO_MORE;
            }
            if (k4Var == j$.util.stream.k4.NO_MORE || !this.a.tryAdvance(this)) {
                return false;
            }
        } while (a(1L) != 1);
        consumer.accept(this.e);
        this.e = null;
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        j$.util.Spliterator spliteratorTrySplit;
        if (this.d.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return new j$.util.stream.j4(spliteratorTrySplit, this);
    }

    public j4(j$.util.Spliterator spliterator, j$.util.stream.j4 j4Var) {
        this.a = spliterator;
        this.b = j4Var.b;
        this.d = j4Var.d;
        this.c = j4Var.c;
    }
}

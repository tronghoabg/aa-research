package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class q4 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final Spliterator f38294a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f38295b;

    /* renamed from: c, reason: collision with root package name */
    boolean f38296c;

    /* renamed from: d, reason: collision with root package name */
    int f38297d;

    abstract Spliterator c(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.util.S.e(this, i5);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    q4(Spliterator spliterator) {
        this.f38296c = true;
        this.f38294a = spliterator;
        this.f38295b = new AtomicBoolean();
    }

    q4(Spliterator spliterator, q4 q4Var) {
        this.f38296c = true;
        this.f38294a = spliterator;
        q4Var.getClass();
        this.f38295b = q4Var.f38295b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f38294a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f38294a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f38294a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f38294a.trySplit();
        if (spliteratorTrySplit != null) {
            return c(spliteratorTrySplit);
        }
        return null;
    }

    final boolean b() {
        return (this.f38297d == 0 && this.f38295b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a0 trySplit() {
        return (j$.util.a0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.V trySplit() {
        return (j$.util.V) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d0 trySplit() {
        return (j$.util.d0) trySplit();
    }
}

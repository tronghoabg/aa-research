package j$.util.concurrent;

import j$.util.S;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class f extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f37815i;

    /* renamed from: j, reason: collision with root package name */
    long f37816j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    f(l[] lVarArr, int i5, int i10, int i11, long j8, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i5, i10, i11);
        this.f37815i = concurrentHashMap;
        this.f37816j = j8;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i5 = this.f37846f;
        int i10 = this.f37847g;
        int i11 = (i5 + i10) >>> 1;
        if (i11 <= i5) {
            return null;
        }
        l[] lVarArr = this.f37841a;
        this.f37847g = i11;
        long j8 = this.f37816j >>> 1;
        this.f37816j = j8;
        return new f(lVarArr, this.f37848h, i11, i10, j8, this.f37815i);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l lVarA = a();
            if (lVarA == null) {
                return;
            } else {
                consumer.accept(new k(lVarA.f37834b, lVarA.f37835c, this.f37815i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l lVarA = a();
        if (lVarA == null) {
            return false;
        }
        consumer.accept(new k(lVarA.f37834b, lVarA.f37835c, this.f37815i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37816j;
    }
}

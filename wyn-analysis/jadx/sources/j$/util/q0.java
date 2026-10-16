package j$.util;

import com.applovin.shadow.okio.Segment;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
class q0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Collection f37933a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f37934b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37935c;

    /* renamed from: d, reason: collision with root package name */
    private long f37936d;

    /* renamed from: e, reason: collision with root package name */
    private int f37937e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return S.e(this, i5);
    }

    public q0(java.util.Collection collection, int i5) {
        this.f37933a = collection;
        this.f37934b = null;
        this.f37935c = (i5 & 4096) == 0 ? i5 | 16448 : i5;
    }

    public q0(Iterator it) {
        this.f37933a = null;
        this.f37934b = it;
        this.f37936d = Long.MAX_VALUE;
        this.f37935c = 272;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f37934b;
        if (it == null) {
            java.util.Collection collection = this.f37933a;
            Iterator it2 = collection.iterator();
            this.f37934b = it2;
            size = collection.size();
            this.f37936d = size;
            it = it2;
        } else {
            size = this.f37936d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i5 = this.f37937e + Segment.SHARE_MINIMUM;
        if (i5 > size) {
            i5 = (int) size;
        }
        if (i5 > 33554432) {
            i5 = 33554432;
        }
        Object[] objArr = new Object[i5];
        int i10 = 0;
        do {
            objArr[i10] = it.next();
            i10++;
            if (i10 >= i5) {
                break;
            }
        } while (it.hasNext());
        this.f37937e = i10;
        long j8 = this.f37936d;
        if (j8 != Long.MAX_VALUE) {
            this.f37936d = j8 - i10;
        }
        return new j0(objArr, 0, i10, this.f37935c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f37934b;
        if (it == null) {
            Iterator it2 = this.f37933a.iterator();
            this.f37934b = it2;
            this.f37936d = r0.size();
            it = it2;
        }
        S.q(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f37934b == null) {
            this.f37934b = this.f37933a.iterator();
            this.f37936d = r0.size();
        }
        if (!this.f37934b.hasNext()) {
            return false;
        }
        consumer.accept(this.f37934b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f37934b == null) {
            java.util.Collection collection = this.f37933a;
            this.f37934b = collection.iterator();
            long size = collection.size();
            this.f37936d = size;
            return size;
        }
        return this.f37936d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37935c;
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (S.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}

package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class o1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f50282a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f50283b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50284c;

    /* renamed from: d, reason: collision with root package name */
    public long f50285d;

    /* renamed from: e, reason: collision with root package name */
    public int f50286e;

    public o1(Iterator it) {
        this.f50282a = null;
        this.f50283b = it;
        this.f50285d = Long.MAX_VALUE;
        this.f50284c = 0;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f50284c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f50283b != null) {
            return this.f50285d;
        }
        java.util.Collection collection = this.f50282a;
        this.f50283b = collection.iterator();
        long size = collection.size();
        this.f50285d = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f50283b;
        if (it == null) {
            Iterator it2 = this.f50282a.iterator();
            this.f50283b = it2;
            this.f50285d = r0.size();
            it = it2;
        }
        j$.com.android.tools.r8.a.B(it, consumer);
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (j$.com.android.tools.r8.a.n(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.l(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return j$.com.android.tools.r8.a.n(this, i2);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f50283b == null) {
            this.f50283b = this.f50282a.iterator();
            this.f50285d = r0.size();
        }
        if (!this.f50283b.hasNext()) {
            return false;
        }
        consumer.accept(this.f50283b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f50283b;
        if (it == null) {
            java.util.Collection collection = this.f50282a;
            Iterator it2 = collection.iterator();
            this.f50283b = it2;
            size = collection.size();
            this.f50285d = size;
            it = it2;
        } else {
            size = this.f50285d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i2 = this.f50286e + 1024;
        if (i2 > size) {
            i2 = (int) size;
        }
        if (i2 > 33554432) {
            i2 = 33554432;
        }
        Object[] objArr = new Object[i2];
        int i3 = 0;
        do {
            objArr[i3] = it.next();
            i3++;
            if (i3 >= i2) {
                break;
            }
        } while (it.hasNext());
        this.f50286e = i3;
        long j2 = this.f50285d;
        if (j2 != Long.MAX_VALUE) {
            this.f50285d = j2 - i3;
        }
        return new h1(objArr, 0, i3, this.f50284c);
    }

    public o1(java.util.Collection collection, int i2) {
        this.f50282a = collection;
        this.f50283b = null;
        this.f50284c = (i2 & 4096) == 0 ? i2 | 16448 : i2;
    }
}

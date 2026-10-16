package j$.util;

import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f50126a;

    /* renamed from: b, reason: collision with root package name */
    public int f50127b;

    /* renamed from: c, reason: collision with root package name */
    public int f50128c;

    public a(java.util.List list) {
        this.f50126a = list;
        this.f50127b = 0;
        this.f50128c = -1;
    }

    public final int a() {
        int i2 = this.f50128c;
        if (i2 >= 0) {
            return i2;
        }
        int size = this.f50126a.size();
        this.f50128c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f50127b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.List list = this.f50126a;
        int iA = a();
        this.f50127b = iA;
        for (int i2 = this.f50127b; i2 < iA; i2++) {
            try {
                consumer.accept(list.get(i2));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
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
        int iA = a();
        int i2 = this.f50127b;
        if (i2 >= iA) {
            return false;
        }
        this.f50127b = i2 + 1;
        try {
            consumer.accept(this.f50126a.get(i2));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int iA = a();
        int i2 = this.f50127b;
        int i3 = (iA + i2) >>> 1;
        if (i2 >= i3) {
            return null;
        }
        this.f50127b = i3;
        return new a(this, i2, i3);
    }

    public a(a aVar, int i2, int i3) {
        this.f50126a = aVar.f50126a;
        this.f50127b = i2;
        this.f50128c = i3;
    }
}

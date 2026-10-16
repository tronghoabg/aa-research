package j$.util;

import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2905a implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List f37776a;

    /* renamed from: b, reason: collision with root package name */
    private int f37777b;

    /* renamed from: c, reason: collision with root package name */
    private int f37778c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    C2905a(java.util.List list) {
        this.f37776a = list;
        this.f37777b = 0;
        this.f37778c = -1;
    }

    private C2905a(C2905a c2905a, int i5, int i10) {
        this.f37776a = c2905a.f37776a;
        this.f37777b = i5;
        this.f37778c = i10;
    }

    private int a() {
        int i5 = this.f37778c;
        if (i5 >= 0) {
            return i5;
        }
        int size = this.f37776a.size();
        this.f37778c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int iA = a();
        int i5 = this.f37777b;
        int i10 = (iA + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f37777b = i10;
        return new C2905a(this, i5, i10);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iA = a();
        int i5 = this.f37777b;
        if (i5 >= iA) {
            return false;
        }
        this.f37777b = i5 + 1;
        try {
            consumer.accept(this.f37776a.get(i5));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int iA = a();
        this.f37777b = iA;
        for (int i5 = this.f37777b; i5 < iA; i5++) {
            try {
                consumer.accept(this.f37776a.get(i5));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f37777b;
    }
}

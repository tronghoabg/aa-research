package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2996o1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    K0 f38267a;

    /* renamed from: b, reason: collision with root package name */
    int f38268b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f38269c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f38270d;

    /* renamed from: e, reason: collision with root package name */
    ArrayDeque f38271e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.util.S.e(this, i5);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    AbstractC2996o1(K0 k02) {
        this.f38267a = k02;
    }

    protected final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iQ = this.f38267a.q();
        while (true) {
            iQ--;
            if (iQ < this.f38268b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f38267a.b(iQ));
        }
    }

    protected static K0 a(ArrayDeque arrayDeque) {
        while (true) {
            K0 k02 = (K0) arrayDeque.pollFirst();
            if (k02 == null) {
                return null;
            }
            if (k02.q() != 0) {
                for (int iQ = k02.q() - 1; iQ >= 0; iQ--) {
                    arrayDeque.addFirst(k02.b(iQ));
                }
            } else if (k02.count() > 0) {
                return k02;
            }
        }
    }

    protected final boolean c() {
        if (this.f38267a == null) {
            return false;
        }
        if (this.f38270d != null) {
            return true;
        }
        Spliterator spliterator = this.f38269c;
        if (spliterator == null) {
            ArrayDeque arrayDequeB = b();
            this.f38271e = arrayDequeB;
            K0 k0A = a(arrayDequeB);
            if (k0A != null) {
                this.f38270d = k0A.spliterator();
                return true;
            }
            this.f38267a = null;
            return false;
        }
        this.f38270d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        K0 k02 = this.f38267a;
        if (k02 == null || this.f38270d != null) {
            return null;
        }
        Spliterator spliterator = this.f38269c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f38268b < k02.q() - 1) {
            K0 k03 = this.f38267a;
            int i5 = this.f38268b;
            this.f38268b = i5 + 1;
            return k03.b(i5).spliterator();
        }
        K0 k0B = this.f38267a.b(this.f38268b);
        this.f38267a = k0B;
        if (k0B.q() == 0) {
            Spliterator spliterator2 = this.f38267a.spliterator();
            this.f38269c = spliterator2;
            return spliterator2.trySplit();
        }
        K0 k04 = this.f38267a;
        this.f38268b = 1;
        return k04.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f38267a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f38269c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i5 = this.f38268b; i5 < this.f38267a.q(); i5++) {
            jCount += this.f38267a.b(i5).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d0 trySplit() {
        return (j$.util.d0) trySplit();
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
}

package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class p3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public m2 f50567a;

    /* renamed from: b, reason: collision with root package name */
    public int f50568b;

    /* renamed from: c, reason: collision with root package name */
    public Spliterator f50569c;

    /* renamed from: d, reason: collision with root package name */
    public Spliterator f50570d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayDeque f50571e;

    public p3(o2 o2Var) {
        this.f50567a = o2Var;
    }

    public static m2 a(ArrayDeque arrayDeque) {
        while (true) {
            m2 m2Var = (m2) arrayDeque.pollFirst();
            if (m2Var == null) {
                return null;
            }
            if (m2Var.s() != 0) {
                for (int iS = m2Var.s() - 1; iS >= 0; iS--) {
                    arrayDeque.addFirst(m2Var.a(iS));
                }
            } else if (m2Var.count() > 0) {
                return m2Var;
            }
        }
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iS = this.f50567a.s();
        while (true) {
            iS--;
            if (iS < this.f50568b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f50567a.a(iS));
        }
    }

    public final boolean c() {
        if (this.f50567a == null) {
            return false;
        }
        if (this.f50570d != null) {
            return true;
        }
        Spliterator spliterator = this.f50569c;
        if (spliterator != null) {
            this.f50570d = spliterator;
            return true;
        }
        ArrayDeque arrayDequeB = b();
        this.f50571e = arrayDequeB;
        m2 m2VarA = a(arrayDequeB);
        if (m2VarA != null) {
            this.f50570d = m2VarA.spliterator();
            return true;
        }
        this.f50567a = null;
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f50567a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f50569c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i2 = this.f50568b; i2 < this.f50567a.s(); i2++) {
            jCount += this.f50567a.a(i2).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
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
    public final Spliterator trySplit() {
        m2 m2Var = this.f50567a;
        if (m2Var == null || this.f50570d != null) {
            return null;
        }
        Spliterator spliterator = this.f50569c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        int i2 = this.f50568b;
        int iS = m2Var.s() - 1;
        m2 m2Var2 = this.f50567a;
        int i3 = this.f50568b;
        if (i2 < iS) {
            this.f50568b = i3 + 1;
            return m2Var2.a(i3).spliterator();
        }
        m2 m2VarA = m2Var2.a(i3);
        this.f50567a = m2VarA;
        int iS2 = m2VarA.s();
        m2 m2Var3 = this.f50567a;
        if (iS2 != 0) {
            this.f50568b = 1;
            return m2Var3.a(0).spliterator();
        }
        Spliterator spliterator2 = m2Var3.spliterator();
        this.f50569c = spliterator2;
        return spliterator2.trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.s0 trySplit() {
        return (j$.util.s0) trySplit();
    }
}

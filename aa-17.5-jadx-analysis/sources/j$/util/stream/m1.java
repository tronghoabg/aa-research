package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class m1 implements Spliterator {
    public j0 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public ArrayDeque e;

    public m1(l0 l0Var) {
        this.a = l0Var;
    }

    public static j0 a(ArrayDeque arrayDeque) {
        while (true) {
            j0 j0Var = (j0) arrayDeque.pollFirst();
            if (j0Var == null) {
                return null;
            }
            if (j0Var.l() != 0) {
                for (int iL = j0Var.l() - 1; iL >= 0; iL--) {
                    arrayDeque.addFirst(j0Var.a(iL));
                }
            } else if (j0Var.count() > 0) {
                return j0Var;
            }
        }
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iL = this.a.l();
        while (true) {
            iL--;
            if (iL < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iL));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        ArrayDeque arrayDequeB = b();
        this.e = arrayDequeB;
        j0 j0VarA = a(arrayDequeB);
        if (j0VarA != null) {
            this.d = j0VarA.spliterator();
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.l(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
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
    public final Spliterator trySplit() {
        j0 j0Var = this.a;
        if (j0Var == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        int i = this.b;
        int iL = j0Var.l() - 1;
        j0 j0Var2 = this.a;
        int i2 = this.b;
        if (i < iL) {
            this.b = i2 + 1;
            return j0Var2.a(i2).spliterator();
        }
        j0 j0VarA = j0Var2.a(i2);
        this.a = j0VarA;
        int iL2 = j0VarA.l();
        j0 j0Var3 = this.a;
        if (iL2 != 0) {
            this.b = 1;
            return j0Var3.a(0).spliterator();
        }
        Spliterator spliterator2 = j0Var3.spliterator();
        this.c = spliterator2;
        return spliterator2.trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return (Spliterator.OfPrimitive) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.e0 trySplit() {
        return (j$.util.e0) trySplit();
    }
}

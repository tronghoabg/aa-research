package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m1 implements j$.util.Spliterator {
    public j$.util.stream.j0 a;
    public int b;
    public j$.util.Spliterator c;
    public j$.util.Spliterator d;
    public java.util.ArrayDeque e;

    public m1(j$.util.stream.l0 l0Var) {
        this.a = l0Var;
    }

    public static j$.util.stream.j0 a(java.util.ArrayDeque arrayDeque) {
        while (true) {
            j$.util.stream.j0 j0Var = (j$.util.stream.j0) arrayDeque.pollFirst();
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

    public final java.util.ArrayDeque b() {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(8);
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
        j$.util.Spliterator spliterator = this.c;
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        java.util.ArrayDeque arrayDequeB = b();
        this.e = arrayDequeB;
        j$.util.stream.j0 j0VarA = a(arrayDequeB);
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
        j$.util.Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.l(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
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
    public final j$.util.Spliterator trySplit() {
        j$.util.stream.j0 j0Var = this.a;
        if (j0Var == null || this.d != null) {
            return null;
        }
        j$.util.Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        int i = this.b;
        int iL = j0Var.l() - 1;
        j$.util.stream.j0 j0Var2 = this.a;
        int i2 = this.b;
        if (i < iL) {
            this.b = i2 + 1;
            return j0Var2.a(i2).spliterator();
        }
        j$.util.stream.j0 j0VarA = j0Var2.a(i2);
        this.a = j0VarA;
        int iL2 = j0VarA.l();
        j$.util.stream.j0 j0Var3 = this.a;
        if (iL2 != 0) {
            this.b = 1;
            return j0Var3.a(0).spliterator();
        }
        j$.util.Spliterator spliterator2 = j0Var3.spliterator();
        this.c = spliterator2;
        return spliterator2.trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Spliterator.OfPrimitive trySplit() {
        return (j$.util.Spliterator.OfPrimitive) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return (j$.util.Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return (j$.util.Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.e0 trySplit() {
        return (j$.util.e0) trySplit();
    }
}

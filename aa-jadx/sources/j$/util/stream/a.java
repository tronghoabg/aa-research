package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements j$.util.stream.BaseStream {
    public final j$.util.stream.a a;
    public final j$.util.stream.a b;
    public final int c;
    public final j$.util.stream.a d;
    public int e;
    public int f;
    public j$.util.Spliterator g;
    public boolean h;
    public final boolean i;
    public java.lang.Runnable j;
    public boolean k;

    public a(j$.util.stream.a aVar, int i) {
        if (aVar.h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.h = true;
        aVar.d = this;
        this.b = aVar;
        this.c = j$.util.stream.u3.h & i;
        this.f = j$.util.stream.u3.h(i, aVar.f);
        j$.util.stream.a aVar2 = aVar.a;
        this.a = aVar2;
        if (n()) {
            aVar2.i = true;
        }
        this.e = aVar.e + 1;
    }

    public final void a(j$.util.Spliterator spliterator, j$.util.stream.z2 z2Var) {
        z2Var.getClass();
        if (j$.util.stream.u3.SHORT_CIRCUIT.p(this.f)) {
            b(spliterator, z2Var);
            return;
        }
        z2Var.p(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(z2Var);
        z2Var.end();
    }

    public final void b(j$.util.Spliterator spliterator, j$.util.stream.z2 z2Var) {
        while (this.e > 0) {
            this = this.b;
        }
        z2Var.p(spliterator.getExactSizeIfKnown());
        this.h(spliterator, z2Var);
        z2Var.end();
    }

    public final j$.util.stream.j0 c(j$.util.Spliterator spliterator, boolean z, java.util.function.IntFunction intFunction) {
        if (this.a.k) {
            return f(this, spliterator, z, intFunction);
        }
        j$.util.stream.b0 b0VarJ = j(g(spliterator), intFunction);
        s(spliterator, b0VarJ);
        return b0VarJ.build();
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        j$.util.stream.a aVar = this.a;
        java.lang.Runnable runnable = aVar.j;
        if (runnable != null) {
            aVar.j = null;
            runnable.run();
        }
    }

    public final java.lang.Object d(j$.util.stream.t4 t4Var) {
        if (this.h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? t4Var.b(this, p(t4Var.c())) : t4Var.a(this, p(t4Var.c()));
    }

    public final j$.util.stream.j0 e(java.util.function.IntFunction intFunction) {
        j$.util.stream.a aVar;
        if (this.h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || (aVar = this.b) == null || !n()) {
            return c(p(0), true, intFunction);
        }
        this.e = 0;
        return l(aVar, aVar.p(0), intFunction);
    }

    public j$.util.stream.j0 f(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z, java.util.function.IntFunction intFunction) {
        long jG = aVar.g(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(16384)) {
            j$.util.stream.f0 f0Var = (j$.util.stream.f0) new j$.util.stream.o0(aVar, spliterator, new j$.util.stream.i((byte) 10), new j$.util.stream.i((byte) 11)).invoke();
            return z ? j$.util.stream.a2.D(f0Var) : f0Var;
        }
        if (jG >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jG];
        new j$.util.stream.q1(spliterator, aVar, iArr).invoke();
        return new j$.util.stream.e1(iArr);
    }

    public final long g(j$.util.Spliterator spliterator) {
        if (j$.util.stream.u3.SIZED.p(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public boolean h(j$.util.Spliterator spliterator, j$.util.stream.z2 z2Var) {
        boolean zS;
        do {
            zS = z2Var.s();
            if (zS) {
                break;
            }
        } while (spliterator.tryAdvance(z2Var));
        return zS;
    }

    public j$.util.stream.v3 i() {
        return j$.util.stream.v3.INT_VALUE;
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    public j$.util.stream.b0 j(long j, java.util.function.IntFunction intFunction) {
        return j$.util.stream.a2.E(j);
    }

    public final j$.util.stream.a k(java.lang.Runnable runnable) {
        if (this.h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        j$.util.stream.a aVar = this.a;
        java.lang.Runnable runnable2 = aVar.j;
        if (runnable2 != null) {
            runnable = new j$.util.stream.n4(runnable2, runnable, (byte) 0);
        }
        aVar.j = runnable;
        return this;
    }

    public j$.util.stream.j0 l(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        throw new java.lang.UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public j$.util.Spliterator m(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        return l(aVar, spliterator, new j$.desugar.sun.nio.fs.n((byte) 15)).spliterator();
    }

    public boolean n() {
        throw new java.lang.UnsupportedOperationException();
    }

    public j$.util.stream.z2 o(int i, j$.util.stream.z2 z2Var) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final j$.util.Spliterator p(int i) {
        int i2;
        int i3;
        j$.util.stream.a aVar = this.a;
        j$.util.Spliterator spliteratorM = aVar.g;
        if (spliteratorM == null) {
            throw new java.lang.IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        if (aVar.k && aVar.i) {
            j$.util.stream.a aVar2 = aVar.d;
            int i4 = 1;
            while (aVar != this) {
                int i5 = aVar2.c;
                if (aVar2.n()) {
                    if (j$.util.stream.u3.SHORT_CIRCUIT.p(i5)) {
                        i5 &= ~j$.util.stream.u3.t;
                    }
                    spliteratorM = aVar2.m(aVar, spliteratorM);
                    if (spliteratorM.hasCharacteristics(64)) {
                        i2 = (~j$.util.stream.u3.s) & i5;
                        i3 = j$.util.stream.u3.r;
                    } else {
                        i2 = (~j$.util.stream.u3.r) & i5;
                        i3 = j$.util.stream.u3.s;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                aVar2.e = i4;
                aVar2.f = j$.util.stream.u3.h(i5, aVar.f);
                j$.util.stream.a aVar3 = aVar2;
                aVar2 = aVar2.d;
                aVar = aVar3;
                i4 = i6;
            }
        }
        if (i != 0) {
            this.f = j$.util.stream.u3.h(i, this.f);
        }
        return spliteratorM;
    }

    public final j$.util.Spliterator q() {
        j$.util.stream.a aVar = this.a;
        if (this != aVar) {
            throw new java.lang.IllegalStateException();
        }
        if (this.h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        j$.util.Spliterator spliterator = aVar.g;
        if (spliterator == null) {
            throw new java.lang.IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        return spliterator;
    }

    public j$.util.Spliterator r(j$.util.stream.a aVar, java.util.function.Supplier supplier, boolean z) {
        return new j$.util.stream.a4(aVar, supplier, z);
    }

    public final void s(j$.util.Spliterator spliterator, j$.util.stream.z2 z2Var) {
        z2Var.getClass();
        a(spliterator, t(z2Var));
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.stream.a sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.Spliterator spliterator() {
        if (this.h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        j$.util.stream.a aVar = this.a;
        if (this != aVar) {
            return r(this, new j$.desugar.sun.nio.fs.h((byte) 8, this), aVar.k);
        }
        j$.util.Spliterator spliterator = aVar.g;
        if (spliterator == null) {
            throw new java.lang.IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        return spliterator;
    }

    public final j$.util.stream.z2 t(j$.util.stream.z2 z2Var) {
        z2Var.getClass();
        while (true) {
            int i = this.e;
            j$.util.stream.a aVar = this.b;
            if (i <= 0) {
                return z2Var;
            }
            z2Var = this.o(aVar.f, z2Var);
            this = aVar;
        }
    }

    public final j$.util.Spliterator u(j$.util.Spliterator spliterator) {
        return this.e == 0 ? spliterator : r(this, new j$.desugar.sun.nio.fs.h((byte) 9, spliterator), this.a.k);
    }

    public a(j$.util.Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = j$.util.stream.u3.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & j$.util.stream.u3.l;
        this.e = 0;
        this.k = z;
    }
}

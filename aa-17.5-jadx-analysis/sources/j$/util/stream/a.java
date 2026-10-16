package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class a implements BaseStream {
    public final a a;
    public final a b;
    public final int c;
    public final a d;
    public int e;
    public int f;
    public Spliterator g;
    public boolean h;
    public final boolean i;
    public Runnable j;
    public boolean k;

    public a(a aVar, int i) {
        if (aVar.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.h = true;
        aVar.d = this;
        this.b = aVar;
        this.c = u3.h & i;
        this.f = u3.h(i, aVar.f);
        a aVar2 = aVar.a;
        this.a = aVar2;
        if (n()) {
            aVar2.i = true;
        }
        this.e = aVar.e + 1;
    }

    public final void a(Spliterator spliterator, z2 z2Var) {
        z2Var.getClass();
        if (u3.SHORT_CIRCUIT.p(this.f)) {
            b(spliterator, z2Var);
            return;
        }
        z2Var.p(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(z2Var);
        z2Var.end();
    }

    public final void b(Spliterator spliterator, z2 z2Var) {
        while (this.e > 0) {
            this = this.b;
        }
        z2Var.p(spliterator.getExactSizeIfKnown());
        this.h(spliterator, z2Var);
        z2Var.end();
    }

    public final j0 c(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return f(this, spliterator, z, intFunction);
        }
        b0 b0VarJ = j(g(spliterator), intFunction);
        s(spliterator, b0VarJ);
        return b0VarJ.build();
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        a aVar = this.a;
        Runnable runnable = aVar.j;
        if (runnable != null) {
            aVar.j = null;
            runnable.run();
        }
    }

    public final Object d(t4 t4Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? t4Var.b(this, p(t4Var.c())) : t4Var.a(this, p(t4Var.c()));
    }

    public final j0 e(IntFunction intFunction) {
        a aVar;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || (aVar = this.b) == null || !n()) {
            return c(p(0), true, intFunction);
        }
        this.e = 0;
        return l(aVar, aVar.p(0), intFunction);
    }

    public j0 f(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jG = aVar.g(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(16384)) {
            f0 f0Var = (f0) new o0(aVar, spliterator, new i((byte) 10), new i((byte) 11)).invoke();
            return z ? a2.D(f0Var) : f0Var;
        }
        if (jG >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jG];
        new q1(spliterator, aVar, iArr).invoke();
        return new e1(iArr);
    }

    public final long g(Spliterator spliterator) {
        if (u3.SIZED.p(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public boolean h(Spliterator spliterator, z2 z2Var) {
        boolean zS;
        do {
            zS = z2Var.s();
            if (zS) {
                break;
            }
        } while (spliterator.tryAdvance(z2Var));
        return zS;
    }

    public v3 i() {
        return v3.INT_VALUE;
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    public b0 j(long j, IntFunction intFunction) {
        return a2.E(j);
    }

    public final a k(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        a aVar = this.a;
        Runnable runnable2 = aVar.j;
        if (runnable2 != null) {
            runnable = new n4(runnable2, runnable, (byte) 0);
        }
        aVar.j = runnable;
        return this;
    }

    public j0 l(a aVar, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator m(a aVar, Spliterator spliterator) {
        return l(aVar, spliterator, new j$.desugar.sun.nio.fs.n((byte) 15)).spliterator();
    }

    public boolean n() {
        throw new UnsupportedOperationException();
    }

    public z2 o(int i, z2 z2Var) {
        throw new UnsupportedOperationException();
    }

    public final Spliterator p(int i) {
        int i2;
        int i3;
        a aVar = this.a;
        Spliterator spliteratorM = aVar.g;
        if (spliteratorM == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        if (aVar.k && aVar.i) {
            a aVar2 = aVar.d;
            int i4 = 1;
            while (aVar != this) {
                int i5 = aVar2.c;
                if (aVar2.n()) {
                    if (u3.SHORT_CIRCUIT.p(i5)) {
                        i5 &= ~u3.t;
                    }
                    spliteratorM = aVar2.m(aVar, spliteratorM);
                    if (spliteratorM.hasCharacteristics(64)) {
                        i2 = (~u3.s) & i5;
                        i3 = u3.r;
                    } else {
                        i2 = (~u3.r) & i5;
                        i3 = u3.s;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                aVar2.e = i4;
                aVar2.f = u3.h(i5, aVar.f);
                a aVar3 = aVar2;
                aVar2 = aVar2.d;
                aVar = aVar3;
                i4 = i6;
            }
        }
        if (i != 0) {
            this.f = u3.h(i, this.f);
        }
        return spliteratorM;
    }

    public final Spliterator q() {
        a aVar = this.a;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = aVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        return spliterator;
    }

    public Spliterator r(a aVar, Supplier supplier, boolean z) {
        return new a4(aVar, supplier, z);
    }

    public final void s(Spliterator spliterator, z2 z2Var) {
        z2Var.getClass();
        a(spliterator, t(z2Var));
    }

    @Override // j$.util.stream.BaseStream
    public final a sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        a aVar = this.a;
        if (this != aVar) {
            return r(this, new j$.desugar.sun.nio.fs.h((byte) 8, this), aVar.k);
        }
        Spliterator spliterator = aVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        return spliterator;
    }

    public final z2 t(z2 z2Var) {
        z2Var.getClass();
        while (true) {
            int i = this.e;
            a aVar = this.b;
            if (i <= 0) {
                return z2Var;
            }
            z2Var = this.o(aVar.f, z2Var);
            this = aVar;
        }
    }

    public final Spliterator u(Spliterator spliterator) {
        return this.e == 0 ? spliterator : r(this, new j$.desugar.sun.nio.fs.h((byte) 9, spliterator), this.a.k);
    }

    public a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = u3.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & u3.l;
        this.e = 0;
        this.k = z;
    }
}

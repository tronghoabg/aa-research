package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class a implements BaseStream {

    /* renamed from: a, reason: collision with root package name */
    public final a f50311a;

    /* renamed from: b, reason: collision with root package name */
    public final a f50312b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50313c;

    /* renamed from: d, reason: collision with root package name */
    public final a f50314d;

    /* renamed from: e, reason: collision with root package name */
    public int f50315e;

    /* renamed from: f, reason: collision with root package name */
    public int f50316f;

    /* renamed from: g, reason: collision with root package name */
    public Spliterator f50317g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f50318h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f50319i;

    /* renamed from: j, reason: collision with root package name */
    public Runnable f50320j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f50321k;

    public a(a aVar, a aVar2, int i2) {
        if (aVar2.f50318h || !aVar.f50318h || aVar.f50314d != aVar2 || aVar2.f50312b != aVar) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar2.f50318h = true;
        aVar.f50314d = this;
        this.f50312b = aVar;
        this.f50313c = j7.f50473h & i2;
        this.f50316f = j7.f(i2, aVar.f50316f);
        this.f50311a = aVar.f50311a;
        this.f50315e = aVar.f50315e + 1;
    }

    public abstract k7 H();

    public abstract e2 I(long j2, IntFunction intFunction);

    public m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator K(a aVar, Spliterator spliterator) {
        return J(aVar, spliterator, new j$.desugar.sun.nio.fs.n(12)).spliterator();
    }

    public abstract boolean L();

    public abstract t5 M(int i2, t5 t5Var);

    public final Spliterator N(int i2) {
        int i3;
        int i4;
        a aVar = this.f50311a;
        Spliterator spliteratorK = aVar.f50317g;
        if (spliteratorK == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.f50317g = null;
        if (aVar.f50321k && aVar.f50319i) {
            a aVar2 = aVar.f50314d;
            int i5 = 1;
            while (aVar != this) {
                int i6 = aVar2.f50313c;
                if (aVar2.L()) {
                    if (j7.SHORT_CIRCUIT.k(i6)) {
                        i6 &= ~j7.u;
                    }
                    spliteratorK = aVar2.K(aVar, spliteratorK);
                    if (spliteratorK.hasCharacteristics(64)) {
                        i3 = (~j7.t) & i6;
                        i4 = j7.s;
                    } else {
                        i3 = (~j7.s) & i6;
                        i4 = j7.t;
                    }
                    i6 = i3 | i4;
                    i5 = 0;
                }
                int i7 = i5 + 1;
                aVar2.f50315e = i5;
                aVar2.f50316f = j7.f(i6, aVar.f50316f);
                a aVar3 = aVar2;
                aVar2 = aVar2.f50314d;
                aVar = aVar3;
                i5 = i7;
            }
        }
        if (i2 != 0) {
            this.f50316f = j7.f(i2, this.f50316f);
        }
        return spliteratorK;
    }

    public final Spliterator O() {
        a aVar = this.f50311a;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.f50318h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f50318h = true;
        Spliterator spliterator = aVar.f50317g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.f50317g = null;
        return spliterator;
    }

    public abstract Spliterator P(a aVar, Supplier supplier, boolean z);

    public final t5 Q(Spliterator spliterator, t5 t5Var) {
        g(spliterator, R((t5) Objects.requireNonNull(t5Var)));
        return t5Var;
    }

    public final t5 R(t5 t5Var) {
        Objects.requireNonNull(t5Var);
        while (true) {
            int i2 = this.f50315e;
            a aVar = this.f50312b;
            if (i2 <= 0) {
                return t5Var;
            }
            t5Var = this.M(aVar.f50316f, t5Var);
            this = aVar;
        }
    }

    public final Spliterator S(Spliterator spliterator) {
        return this.f50315e == 0 ? spliterator : P(this, new j$.desugar.sun.nio.fs.g(5, spliterator), this.f50311a.f50321k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f50318h = true;
        this.f50317g = null;
        a aVar = this.f50311a;
        Runnable runnable = aVar.f50320j;
        if (runnable != null) {
            aVar.f50320j = null;
            runnable.run();
        }
    }

    public final void g(Spliterator spliterator, t5 t5Var) {
        Objects.requireNonNull(t5Var);
        if (j7.SHORT_CIRCUIT.k(this.f50316f)) {
            i(spliterator, t5Var);
            return;
        }
        t5Var.l(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(t5Var);
        t5Var.end();
    }

    public final boolean i(Spliterator spliterator, t5 t5Var) {
        while (this.f50315e > 0) {
            this = this.f50312b;
        }
        t5Var.l(spliterator.getExactSizeIfKnown());
        boolean zV = this.v(spliterator, t5Var);
        t5Var.end();
        return zV;
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.f50311a.f50321k;
    }

    public final m2 j(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.f50311a.f50321k) {
            return q(this, spliterator, z, intFunction);
        }
        e2 e2VarI = I(r(spliterator), intFunction);
        Q(spliterator, e2VarI);
        return e2VarI.build();
    }

    public final Object n(r8 r8Var) {
        if (this.f50318h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f50318h = true;
        return this.f50311a.f50321k ? r8Var.b(this, N(r8Var.c())) : r8Var.a(this, N(r8Var.c()));
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.f50318h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        a aVar = this.f50311a;
        Runnable runnable2 = aVar.f50320j;
        if (runnable2 != null) {
            runnable = new q8(runnable2, runnable);
        }
        aVar.f50320j = runnable;
        return this;
    }

    public final m2 p(IntFunction intFunction) {
        a aVar;
        if (this.f50318h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f50318h = true;
        if (!this.f50311a.f50321k || (aVar = this.f50312b) == null || !L()) {
            return j(N(0), true, intFunction);
        }
        this.f50315e = 0;
        return J(aVar, aVar.N(0), intFunction);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        this.f50311a.f50321k = true;
        return this;
    }

    public abstract m2 q(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction);

    public final long r(Spliterator spliterator) {
        if (j7.SIZED.k(this.f50316f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.f50311a.f50321k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.f50318h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f50318h = true;
        a aVar = this.f50311a;
        if (this != aVar) {
            return P(this, new j$.desugar.sun.nio.fs.g(4, this), aVar.f50321k);
        }
        Spliterator spliterator = aVar.f50317g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.f50317g = null;
        return spliterator;
    }

    public abstract boolean v(Spliterator spliterator, t5 t5Var);

    public a(a aVar, int i2) {
        if (!aVar.f50318h) {
            aVar.f50318h = true;
            aVar.f50314d = this;
            this.f50312b = aVar;
            this.f50313c = j7.f50473h & i2;
            this.f50316f = j7.f(i2, aVar.f50316f);
            a aVar2 = aVar.f50311a;
            this.f50311a = aVar2;
            if (L()) {
                aVar2.f50319i = true;
            }
            this.f50315e = aVar.f50315e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    public a(Spliterator spliterator, int i2, boolean z) {
        this.f50312b = null;
        this.f50317g = spliterator;
        this.f50311a = this;
        int i3 = j7.f50472g & i2;
        this.f50313c = i3;
        this.f50316f = (~(i3 << 1)) & j7.f50477l;
        this.f50315e = 0;
        this.f50321k = z;
    }
}

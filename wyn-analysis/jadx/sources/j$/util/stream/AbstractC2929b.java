package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2929b implements InterfaceC2959h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2929b f38145a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2929b f38146b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f38147c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC2929b f38148d;

    /* renamed from: e, reason: collision with root package name */
    private int f38149e;

    /* renamed from: f, reason: collision with root package name */
    private int f38150f;

    /* renamed from: g, reason: collision with root package name */
    private Spliterator f38151g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f38152h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f38153i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f38154j;
    private boolean k;

    abstract K0 C(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2, IntFunction intFunction);

    abstract boolean E(Spliterator spliterator, InterfaceC3011r2 interfaceC3011r2);

    abstract EnumC2963h3 F();

    abstract C0 K(long j8, IntFunction intFunction);

    abstract boolean N();

    abstract InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2);

    abstract Spliterator R(AbstractC2929b abstractC2929b, Supplier supplier, boolean z2);

    AbstractC2929b(Spliterator spliterator, int i5, boolean z2) {
        this.f38146b = null;
        this.f38151g = spliterator;
        this.f38145a = this;
        int i10 = EnumC2958g3.f38198g & i5;
        this.f38147c = i10;
        this.f38150f = (~(i10 << 1)) & EnumC2958g3.f38202l;
        this.f38149e = 0;
        this.k = z2;
    }

    AbstractC2929b(AbstractC2929b abstractC2929b, int i5) {
        if (abstractC2929b.f38152h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC2929b.f38152h = true;
        abstractC2929b.f38148d = this;
        this.f38146b = abstractC2929b;
        this.f38147c = EnumC2958g3.f38199h & i5;
        this.f38150f = EnumC2958g3.o(i5, abstractC2929b.f38150f);
        AbstractC2929b abstractC2929b2 = abstractC2929b.f38145a;
        this.f38145a = abstractC2929b2;
        if (N()) {
            abstractC2929b2.f38153i = true;
        }
        this.f38149e = abstractC2929b.f38149e + 1;
    }

    final Object A(N3 n32) {
        if (this.f38152h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f38152h = true;
        if (this.f38145a.k) {
            return n32.c(this, P(n32.d()));
        }
        return n32.b(this, P(n32.d()));
    }

    final K0 B(IntFunction intFunction) {
        AbstractC2929b abstractC2929b;
        if (this.f38152h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f38152h = true;
        if (this.f38145a.k && (abstractC2929b = this.f38146b) != null && N()) {
            this.f38149e = 0;
            return L(abstractC2929b, abstractC2929b.P(0), intFunction);
        }
        return z(P(0), true, intFunction);
    }

    final Spliterator Q() {
        AbstractC2929b abstractC2929b = this.f38145a;
        if (this != abstractC2929b) {
            throw new IllegalStateException();
        }
        if (this.f38152h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f38152h = true;
        Spliterator spliterator = abstractC2929b.f38151g;
        if (spliterator != null) {
            abstractC2929b.f38151g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final InterfaceC2959h sequential() {
        this.f38145a.k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final InterfaceC2959h parallel() {
        this.f38145a.k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f38152h = true;
        this.f38151g = null;
        AbstractC2929b abstractC2929b = this.f38145a;
        Runnable runnable = abstractC2929b.f38154j;
        if (runnable != null) {
            abstractC2929b.f38154j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final InterfaceC2959h onClose(Runnable runnable) {
        if (this.f38152h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC2929b abstractC2929b = this.f38145a;
        Runnable runnable2 = abstractC2929b.f38154j;
        if (runnable2 != null) {
            runnable = new M3(runnable2, runnable);
        }
        abstractC2929b.f38154j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC2959h
    public Spliterator spliterator() {
        if (this.f38152h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f38152h = true;
        AbstractC2929b abstractC2929b = this.f38145a;
        if (this == abstractC2929b) {
            Spliterator spliterator = abstractC2929b.f38151g;
            if (spliterator != null) {
                abstractC2929b.f38151g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return R(this, new C2924a(0, this), abstractC2929b.k);
    }

    final /* synthetic */ Spliterator J() {
        return P(0);
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final boolean isParallel() {
        return this.f38145a.k;
    }

    final K0 z(Spliterator spliterator, boolean z2, IntFunction intFunction) {
        if (this.f38145a.k) {
            return C(this, spliterator, z2, intFunction);
        }
        C0 c0K = K(D(spliterator), intFunction);
        S(spliterator, c0K);
        return c0K.a();
    }

    private Spliterator P(int i5) {
        int i10;
        int i11;
        AbstractC2929b abstractC2929b = this.f38145a;
        Spliterator spliteratorM = abstractC2929b.f38151g;
        if (spliteratorM != null) {
            abstractC2929b.f38151g = null;
            if (abstractC2929b.k && abstractC2929b.f38153i) {
                AbstractC2929b abstractC2929b2 = abstractC2929b.f38148d;
                int i12 = 1;
                while (abstractC2929b != this) {
                    int i13 = abstractC2929b2.f38147c;
                    if (abstractC2929b2.N()) {
                        if (EnumC2958g3.SHORT_CIRCUIT.t(i13)) {
                            i13 &= ~EnumC2958g3.f38211u;
                        }
                        spliteratorM = abstractC2929b2.M(abstractC2929b, spliteratorM);
                        if (spliteratorM.hasCharacteristics(64)) {
                            i10 = (~EnumC2958g3.f38210t) & i13;
                            i11 = EnumC2958g3.f38209s;
                        } else {
                            i10 = (~EnumC2958g3.f38209s) & i13;
                            i11 = EnumC2958g3.f38210t;
                        }
                        i13 = i10 | i11;
                        i12 = 0;
                    }
                    int i14 = i12 + 1;
                    abstractC2929b2.f38149e = i12;
                    abstractC2929b2.f38150f = EnumC2958g3.o(i13, abstractC2929b.f38150f);
                    AbstractC2929b abstractC2929b3 = abstractC2929b2;
                    abstractC2929b2 = abstractC2929b2.f38148d;
                    abstractC2929b = abstractC2929b3;
                    i12 = i14;
                }
            }
            if (i5 != 0) {
                this.f38150f = EnumC2958g3.o(i5, this.f38150f);
            }
            return spliteratorM;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    final EnumC2963h3 G() {
        AbstractC2929b abstractC2929b = this;
        while (abstractC2929b.f38149e > 0) {
            abstractC2929b = abstractC2929b.f38146b;
        }
        return abstractC2929b.F();
    }

    final long D(Spliterator spliterator) {
        if (EnumC2958g3.SIZED.t(this.f38150f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    final InterfaceC3011r2 S(Spliterator spliterator, InterfaceC3011r2 interfaceC3011r2) {
        x(spliterator, T((InterfaceC3011r2) Objects.requireNonNull(interfaceC3011r2)));
        return interfaceC3011r2;
    }

    final void x(Spliterator spliterator, InterfaceC3011r2 interfaceC3011r2) {
        Objects.requireNonNull(interfaceC3011r2);
        if (!EnumC2958g3.SHORT_CIRCUIT.t(this.f38150f)) {
            interfaceC3011r2.l(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC3011r2);
            interfaceC3011r2.k();
            return;
        }
        y(spliterator, interfaceC3011r2);
    }

    final boolean y(Spliterator spliterator, InterfaceC3011r2 interfaceC3011r2) {
        AbstractC2929b abstractC2929b = this;
        while (abstractC2929b.f38149e > 0) {
            abstractC2929b = abstractC2929b.f38146b;
        }
        interfaceC3011r2.l(spliterator.getExactSizeIfKnown());
        boolean zE = abstractC2929b.E(spliterator, interfaceC3011r2);
        interfaceC3011r2.k();
        return zE;
    }

    final int H() {
        return this.f38150f;
    }

    final boolean I() {
        return EnumC2958g3.ORDERED.t(this.f38150f);
    }

    final InterfaceC3011r2 T(InterfaceC3011r2 interfaceC3011r2) {
        Objects.requireNonNull(interfaceC3011r2);
        AbstractC2929b abstractC2929b = this;
        while (abstractC2929b.f38149e > 0) {
            AbstractC2929b abstractC2929b2 = abstractC2929b.f38146b;
            interfaceC3011r2 = abstractC2929b.O(abstractC2929b2.f38150f, interfaceC3011r2);
            abstractC2929b = abstractC2929b2;
        }
        return interfaceC3011r2;
    }

    final Spliterator U(Spliterator spliterator) {
        return this.f38149e == 0 ? spliterator : R(this, new C2924a(6, spliterator), this.f38145a.k);
    }

    K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator M(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        return L(abstractC2929b, spliterator, new C2999p(15)).spliterator();
    }
}

package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2968i3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final boolean f38223a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC2929b f38224b;

    /* renamed from: c, reason: collision with root package name */
    private Supplier f38225c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f38226d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC3011r2 f38227e;

    /* renamed from: f, reason: collision with root package name */
    BooleanSupplier f38228f;

    /* renamed from: g, reason: collision with root package name */
    long f38229g;

    /* renamed from: h, reason: collision with root package name */
    AbstractC2939d f38230h;

    /* renamed from: i, reason: collision with root package name */
    boolean f38231i;

    abstract void d();

    abstract AbstractC2968i3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.util.S.e(this, i5);
    }

    AbstractC2968i3(AbstractC2929b abstractC2929b, Supplier supplier, boolean z2) {
        this.f38224b = abstractC2929b;
        this.f38225c = supplier;
        this.f38226d = null;
        this.f38223a = z2;
    }

    AbstractC2968i3(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2) {
        this.f38224b = abstractC2929b;
        this.f38225c = null;
        this.f38226d = spliterator;
        this.f38223a = z2;
    }

    final void c() {
        if (this.f38226d == null) {
            this.f38226d = (Spliterator) this.f38225c.get();
            this.f38225c = null;
        }
    }

    final boolean a() {
        AbstractC2939d abstractC2939d = this.f38230h;
        if (abstractC2939d == null) {
            if (this.f38231i) {
                return false;
            }
            c();
            d();
            this.f38229g = 0L;
            this.f38227e.l(this.f38226d.getExactSizeIfKnown());
            return b();
        }
        long j8 = this.f38229g + 1;
        this.f38229g = j8;
        boolean z2 = j8 < abstractC2939d.count();
        if (z2) {
            return z2;
        }
        this.f38229g = 0L;
        this.f38230h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f38223a || this.f38230h != null || this.f38231i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.f38226d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    private boolean b() {
        while (this.f38230h.count() == 0) {
            if (this.f38227e.n() || !this.f38228f.getAsBoolean()) {
                if (this.f38231i) {
                    return false;
                }
                this.f38227e.k();
                this.f38231i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f38226d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC2958g3.SIZED.t(this.f38224b.H())) {
            return this.f38226d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int iD = EnumC2958g3.D(this.f38224b.H()) & EnumC2958g3.f38197f;
        return (iD & 64) != 0 ? (iD & (-16449)) | (this.f38226d.characteristics() & 16448) : iD;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.util.S.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f38226d);
    }
}

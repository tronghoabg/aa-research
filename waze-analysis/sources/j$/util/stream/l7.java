package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class l7 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f50497a;

    /* renamed from: b, reason: collision with root package name */
    public final a f50498b;

    /* renamed from: c, reason: collision with root package name */
    public Supplier f50499c;

    /* renamed from: d, reason: collision with root package name */
    public Spliterator f50500d;

    /* renamed from: e, reason: collision with root package name */
    public t5 f50501e;

    /* renamed from: f, reason: collision with root package name */
    public BooleanSupplier f50502f;

    /* renamed from: g, reason: collision with root package name */
    public long f50503g;

    /* renamed from: h, reason: collision with root package name */
    public c f50504h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f50505i;

    public l7(a aVar, Supplier supplier, boolean z) {
        this.f50498b = aVar;
        this.f50499c = supplier;
        this.f50500d = null;
        this.f50497a = z;
    }

    public final boolean a() {
        c cVar = this.f50504h;
        if (cVar == null) {
            if (this.f50505i) {
                return false;
            }
            c();
            d();
            this.f50503g = 0L;
            this.f50501e.l(this.f50500d.getExactSizeIfKnown());
            return b();
        }
        long j2 = this.f50503g + 1;
        this.f50503g = j2;
        boolean z = j2 < cVar.count();
        if (z) {
            return z;
        }
        this.f50503g = 0L;
        this.f50504h.clear();
        return b();
    }

    public final boolean b() {
        while (this.f50504h.count() == 0) {
            if (this.f50501e.o() || !this.f50502f.getAsBoolean()) {
                if (this.f50505i) {
                    return false;
                }
                this.f50501e.end();
                this.f50505i = true;
            }
        }
        return true;
    }

    public final void c() {
        if (this.f50500d == null) {
            this.f50500d = (Spliterator) this.f50499c.get();
            this.f50499c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i2 = this.f50498b.f50316f;
        int i3 = i2 & ((~i2) >> 1) & j7.f50475j & j7.f50471f;
        if ((i3 & 64) == 0) {
            return i3;
        }
        return (this.f50500d.characteristics() & 16448) | (i3 & (-16449));
    }

    public abstract void d();

    public abstract l7 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f50500d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.com.android.tools.r8.a.n(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (j7.SIZED.k(this.f50498b.f50316f)) {
            return this.f50500d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return j$.com.android.tools.r8.a.n(this, i2);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f50500d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f50497a || this.f50504h != null || this.f50505i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.f50500d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    public l7(a aVar, Spliterator spliterator, boolean z) {
        this.f50498b = aVar;
        this.f50499c = null;
        this.f50500d = spliterator;
        this.f50497a = z;
    }
}

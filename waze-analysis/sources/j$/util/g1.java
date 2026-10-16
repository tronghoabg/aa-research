package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g1 implements f0, DoubleConsumer, w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f50250a = false;

    /* renamed from: b, reason: collision with root package name */
    public double f50251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f50252c;

    public g1(s0 s0Var) {
        this.f50252c = s0Var;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d2) {
        this.f50250a = true;
        this.f50251b = d2;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.f0, java.util.Iterator, j$.util.w
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (r1.f50305a) {
            r1.a(g1.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new c0(consumer, 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f50250a) {
            this.f50252c.tryAdvance((DoubleConsumer) this);
        }
        return this.f50250a;
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (!r1.f50305a) {
            return Double.valueOf(nextDouble());
        }
        r1.a(g1.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.f0
    public final double nextDouble() {
        if (!this.f50250a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f50250a = false;
        return this.f50251b;
    }

    @Override // j$.util.o0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }
}

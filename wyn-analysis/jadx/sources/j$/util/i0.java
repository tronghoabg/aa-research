package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class i0 implements G, DoubleConsumer, InterfaceC3058y {

    /* renamed from: a, reason: collision with root package name */
    boolean f37910a = false;

    /* renamed from: b, reason: collision with root package name */
    double f37911b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V f37912c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.P
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (t0.f38365a) {
            t0.a(i0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.G, java.util.Iterator, j$.util.InterfaceC3058y
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (t0.f38365a) {
            t0.a(i0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new D(consumer));
    }

    i0(V v2) {
        this.f37912c = v2;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d3) {
        this.f37910a = true;
        this.f37911b = d3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f37910a) {
            this.f37912c.tryAdvance((DoubleConsumer) this);
        }
        return this.f37910a;
    }

    @Override // j$.util.G
    public final double nextDouble() {
        if (!this.f37910a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37910a = false;
        return this.f37911b;
    }
}

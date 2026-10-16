package j$.util;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class g0 implements K, IntConsumer, InterfaceC3058y {

    /* renamed from: a, reason: collision with root package name */
    boolean f37899a = false;

    /* renamed from: b, reason: collision with root package name */
    int f37900b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Spliterator.OfInt f37901c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.P
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (t0.f38365a) {
            t0.a(g0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.K, java.util.Iterator, j$.util.InterfaceC3058y
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (t0.f38365a) {
            t0.a(g0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new H(consumer));
    }

    g0(Spliterator.OfInt ofInt) {
        this.f37901c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        this.f37899a = true;
        this.f37900b = i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f37899a) {
            this.f37901c.tryAdvance((IntConsumer) this);
        }
        return this.f37899a;
    }

    @Override // j$.util.K
    public final int nextInt() {
        if (!this.f37899a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37899a = false;
        return this.f37900b;
    }
}

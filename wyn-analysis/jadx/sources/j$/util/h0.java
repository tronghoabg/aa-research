package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class h0 implements O, LongConsumer, InterfaceC3058y {

    /* renamed from: a, reason: collision with root package name */
    boolean f37907a = false;

    /* renamed from: b, reason: collision with root package name */
    long f37908b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a0 f37909c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.P
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (t0.f38365a) {
            t0.a(h0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.O, java.util.Iterator, j$.util.InterfaceC3058y
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (t0.f38365a) {
            t0.a(h0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new L(consumer));
    }

    h0(a0 a0Var) {
        this.f37909c = a0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37907a = true;
        this.f37908b = j8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f37907a) {
            this.f37909c.tryAdvance((LongConsumer) this);
        }
        return this.f37907a;
    }

    @Override // j$.util.O
    public final long nextLong() {
        if (!this.f37907a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37907a = false;
        return this.f37908b;
    }
}

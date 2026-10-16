package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class f1 implements n0, LongConsumer, w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f50227a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f50228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f50229c;

    public f1(x0 x0Var) {
        this.f50229c = x0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j2) {
        this.f50227a = true;
        this.f50228b = j2;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.n0, java.util.Iterator, j$.util.w
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (r1.f50305a) {
            r1.a(f1.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new k0(consumer, 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f50227a) {
            this.f50229c.tryAdvance((LongConsumer) this);
        }
        return this.f50227a;
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (!r1.f50305a) {
            return Long.valueOf(nextLong());
        }
        r1.a(f1.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.n0
    public final long nextLong() {
        if (!this.f50227a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f50227a = false;
        return this.f50228b;
    }

    @Override // j$.util.o0
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }
}

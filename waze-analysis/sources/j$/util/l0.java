package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class l0 implements n0, w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f50273a;

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f50273a;
        if (obj instanceof l0) {
            obj = ((l0) obj).f50273a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.o0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f50273a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f50273a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f50273a.hashCode();
    }

    @Override // j$.util.n0, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f50273a.next();
    }

    @Override // j$.util.n0
    public final /* synthetic */ long nextLong() {
        return this.f50273a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f50273a.remove();
    }

    @Override // j$.util.n0, java.util.Iterator, j$.util.w
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f50273a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.n0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f50273a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f50273a.next();
    }
}

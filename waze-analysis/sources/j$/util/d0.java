package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class d0 implements f0, w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f50217a;

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f50217a;
        if (obj instanceof d0) {
            obj = ((d0) obj).f50217a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.o0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f50217a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f50217a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f50217a.hashCode();
    }

    @Override // j$.util.f0, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f50217a.next();
    }

    @Override // j$.util.f0
    public final /* synthetic */ double nextDouble() {
        return this.f50217a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f50217a.remove();
    }

    @Override // j$.util.f0, java.util.Iterator, j$.util.w
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f50217a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f50217a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f50217a.next();
    }
}

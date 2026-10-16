package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class h0 implements j0, w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f50258a;

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f50258a;
        if (obj instanceof h0) {
            obj = ((h0) obj).f50258a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.o0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f50258a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f50258a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f50258a.hashCode();
    }

    @Override // j$.util.j0, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f50258a.next();
    }

    @Override // j$.util.j0
    public final /* synthetic */ int nextInt() {
        return this.f50258a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f50258a.remove();
    }

    @Override // j$.util.j0, java.util.Iterator, j$.util.w
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f50258a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.j0
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f50258a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f50258a.next();
    }
}

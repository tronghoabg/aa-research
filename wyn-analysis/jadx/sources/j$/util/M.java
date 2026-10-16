package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements O, InterfaceC3058y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f37760a;

    private /* synthetic */ M(PrimitiveIterator.OfLong ofLong) {
        this.f37760a = ofLong;
    }

    public static /* synthetic */ O a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof N ? ((N) ofLong).f37761a : new M(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f37760a;
        if (obj instanceof M) {
            obj = ((M) obj).f37760a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.P
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37760a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // j$.util.O, java.util.Iterator, j$.util.InterfaceC3058y
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37760a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f37760a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f37760a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37760a.hashCode();
    }

    @Override // j$.util.O, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f37760a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f37760a.next();
    }

    @Override // j$.util.O
    public final /* synthetic */ long nextLong() {
        return this.f37760a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f37760a.remove();
    }
}

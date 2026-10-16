package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class I implements K, InterfaceC3058y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f37757a;

    private /* synthetic */ I(PrimitiveIterator.OfInt ofInt) {
        this.f37757a = ofInt;
    }

    public static /* synthetic */ K a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof J ? ((J) ofInt).f37758a : new I(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f37757a;
        if (obj instanceof I) {
            obj = ((I) obj).f37757a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.P
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37757a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // j$.util.K, java.util.Iterator, j$.util.InterfaceC3058y
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37757a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.K
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f37757a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f37757a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37757a.hashCode();
    }

    @Override // j$.util.K, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f37757a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f37757a.next();
    }

    @Override // j$.util.K
    public final /* synthetic */ int nextInt() {
        return this.f37757a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f37757a.remove();
    }
}

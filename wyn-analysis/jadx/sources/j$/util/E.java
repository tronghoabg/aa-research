package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements G, InterfaceC3058y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f37754a;

    private /* synthetic */ E(PrimitiveIterator.OfDouble ofDouble) {
        this.f37754a = ofDouble;
    }

    public static /* synthetic */ G a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof F ? ((F) ofDouble).f37755a : new E(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f37754a;
        if (obj instanceof E) {
            obj = ((E) obj).f37754a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.P
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f37754a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // j$.util.G, java.util.Iterator, j$.util.InterfaceC3058y
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f37754a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.G
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f37754a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f37754a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f37754a.hashCode();
    }

    @Override // j$.util.G, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f37754a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f37754a.next();
    }

    @Override // j$.util.G
    public final /* synthetic */ double nextDouble() {
        return this.f37754a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f37754a.remove();
    }
}

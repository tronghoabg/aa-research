package j$.util;

import j$.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class m implements java.util.Iterator, Iterator {
    public final /* synthetic */ byte a = 0;
    public final java.util.Iterator b;

    public m(n nVar) {
        this.b = nVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                Iterator.EL.forEachRemaining(this.b, consumer);
                break;
            default:
                Iterator.EL.forEachRemaining(this.b, new j$.nio.file.z(consumer, (byte) 2));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new q((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public m(s sVar) {
        this.b = sVar.a.iterator();
    }
}

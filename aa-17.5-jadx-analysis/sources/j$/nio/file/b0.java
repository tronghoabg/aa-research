package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class b0 implements Iterable, j$.lang.a {
    public final Iterable a;

    public b0(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, new z(consumer, (byte) 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c0(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return new j$.util.y0(iterator(), 0);
    }
}

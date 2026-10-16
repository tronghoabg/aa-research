package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.o1;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class t implements Iterable, j$.lang.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f49779a;

    public t(Iterable iterable) {
        this.f49779a = iterable;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.f49779a, new r(consumer, 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u(this.f49779a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return new o1((Iterator) Objects.requireNonNull(iterator()));
    }
}

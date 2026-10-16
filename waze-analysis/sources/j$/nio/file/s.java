package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.o1;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class s implements DirectoryStream, j$.lang.a {

    /* renamed from: a, reason: collision with root package name */
    public final DirectoryStream f49770a;

    public s(DirectoryStream directoryStream) {
        this.f49770a = directoryStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f49770a.close();
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.f49770a, new r(consumer, 0));
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this.f49770a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return new o1((Iterator) Objects.requireNonNull(iterator()));
    }
}

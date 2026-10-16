package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements java.lang.Iterable, j$.lang.a {
    public final java.lang.Iterable a;

    public b0(java.lang.Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$EL.forEach(this.a, new j$.nio.file.z(consumer, (byte) 1));
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.nio.file.c0(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.Spliterator spliterator() {
        return new j$.util.y0(iterator(), 0);
    }
}

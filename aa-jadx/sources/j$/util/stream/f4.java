package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class f4 extends j$.util.stream.g4 implements j$.util.Spliterator.OfLong {
    @Override // j$.util.stream.i4
    public final j$.util.Spliterator a(j$.util.Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new j$.util.stream.f4((j$.util.Spliterator.OfLong) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.g4
    public final java.lang.Object b() {
        return new j$.util.stream.g0((byte) 1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Spliterator.OfLong.CC.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Spliterator.OfLong.CC.b(this, consumer);
    }
}

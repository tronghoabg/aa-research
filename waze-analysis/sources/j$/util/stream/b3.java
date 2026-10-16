package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class b3 extends f3 implements g2 {
    @Override // j$.util.stream.f3, j$.util.stream.m2
    public final l2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.l2
    public final Object b() {
        return d4.f50376g;
    }

    @Override // j$.util.stream.f3, j$.util.stream.m2
    public final /* synthetic */ m2 f(long j2, long j3, IntFunction intFunction) {
        return d4.t(this, j2, j3);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void forEach(Consumer consumer) {
        d4.q(this, consumer);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void h(Object[] objArr, int i2) {
        d4.n(this, (Double[]) objArr, i2);
    }

    @Override // j$.util.stream.m2
    public final j$.util.a1 spliterator() {
        return Spliterators.f50125d;
    }

    @Override // j$.util.stream.m2
    public final Spliterator spliterator() {
        return Spliterators.f50125d;
    }

    @Override // j$.util.stream.f3, j$.util.stream.m2
    public final m2 a(int i2) {
        throw new IndexOutOfBoundsException();
    }
}

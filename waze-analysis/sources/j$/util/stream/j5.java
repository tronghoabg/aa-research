package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j5 extends l5 {
    @Override // j$.util.stream.a
    public final boolean L() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.l5, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (this.f50311a.f50321k) {
            super.forEach(consumer);
        } else {
            O().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.l5, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (this.f50311a.f50321k) {
            super.forEachOrdered(consumer);
        } else {
            O().forEachRemaining(consumer);
        }
    }
}

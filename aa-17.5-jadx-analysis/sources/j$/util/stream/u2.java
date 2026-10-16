package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class u2 extends w2 {
    @Override // j$.util.stream.w2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (this.a.k) {
            super.forEach(consumer);
        } else {
            q().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.a
    public final boolean n() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final z2 o(int i, z2 z2Var) {
        throw new UnsupportedOperationException();
    }
}

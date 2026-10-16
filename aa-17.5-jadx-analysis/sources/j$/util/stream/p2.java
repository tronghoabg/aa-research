package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class p2 extends o2 implements n2 {
    public long b;

    @Override // j$.util.stream.n2
    public final void A(n2 n2Var) {
        this.b += ((p2) n2Var).b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }

    @Override // j$.util.stream.o2, java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.o2, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void p(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void end() {
    }
}

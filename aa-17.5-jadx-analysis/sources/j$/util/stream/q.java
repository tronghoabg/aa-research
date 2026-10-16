package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class q implements x2 {
    public final z2 a;
    public final /* synthetic */ IntFunction b;

    public q(z2 z2Var, IntFunction intFunction) {
        this.b = intFunction;
        z2Var.getClass();
        this.a = z2Var;
    }

    @Override // j$.util.stream.x2, j$.util.stream.z2
    public final void accept(int i) {
        this.a.accept((z2) this.b.apply(i));
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.z2
    public final void end() {
        this.a.end();
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
        this.a.p(j);
    }

    @Override // j$.util.stream.x2
    public final /* synthetic */ void r(Integer num) {
        a2.e(this, num);
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        return this.a.s();
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        r((Integer) obj);
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }
}

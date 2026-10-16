package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class m2 implements n2, y2 {
    public long a;
    public final /* synthetic */ i b;

    public m2(i iVar) {
        this.b = iVar;
    }

    @Override // j$.util.stream.n2
    public final void A(n2 n2Var) {
        accept(((m2) n2Var).a);
    }

    @Override // j$.util.stream.y2
    public final /* synthetic */ void B(Long l) {
        a2.g(this, l);
    }

    @Override // j$.util.stream.z2
    public final void accept(long j) {
        this.a = this.b.applyAsLong(this.a, j);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.a);
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
        this.a = 0L;
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        return false;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        B((Long) obj);
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // j$.util.stream.z2
    public final void end() {
    }
}

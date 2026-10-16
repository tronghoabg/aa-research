package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class j2 implements n2, x2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ IntBinaryOperator c;

    public j2(int i, IntBinaryOperator intBinaryOperator) {
        this.b = i;
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.n2
    public final void A(n2 n2Var) {
        accept(((j2) n2Var).a);
    }

    @Override // j$.util.stream.z2
    public final void accept(int i) {
        this.a = this.c.applyAsInt(this.a, i);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.a);
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.x2
    public final /* synthetic */ void r(Integer num) {
        a2.e(this, num);
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        return false;
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

    @Override // j$.util.stream.z2
    public final void end() {
    }
}

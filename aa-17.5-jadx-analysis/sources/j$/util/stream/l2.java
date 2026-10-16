package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class l2 implements n2, x2 {
    public boolean a;
    public int b;
    public final /* synthetic */ i c;

    public l2(i iVar) {
        this.c = iVar;
    }

    @Override // j$.util.stream.n2
    public final void A(n2 n2Var) {
        l2 l2Var = (l2) n2Var;
        if (l2Var.a) {
            return;
        }
        accept(l2Var.b);
    }

    @Override // j$.util.stream.z2
    public final void accept(int i) {
        if (!this.a) {
            this.b = this.c.applyAsInt(this.b, i);
        } else {
            this.a = false;
            this.b = i;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? OptionalInt.empty() : OptionalInt.of(this.b);
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
        this.a = true;
        this.b = 0;
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

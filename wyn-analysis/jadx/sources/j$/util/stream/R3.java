package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class R3 extends AbstractC2967i2 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Predicate f38077m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R3(AbstractC2972j2 abstractC2972j2, int i5, Predicate predicate) {
        super(abstractC2972j2, i5, 0);
        this.f38077m = predicate;
    }

    @Override // j$.util.stream.AbstractC2929b
    final Spliterator M(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        return EnumC2958g3.ORDERED.t(abstractC2929b.H()) ? L(abstractC2929b, spliterator, new r(29)).spliterator() : new p4(abstractC2929b.U(spliterator), this.f38077m, 1);
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new j4(this, abstractC2929b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        return new C2979l(this, interfaceC3011r2);
    }
}

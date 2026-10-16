package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
final class V3 extends AbstractC2925a0 {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ IntPredicate f38118l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V3(AbstractC2935c0 abstractC2935c0, int i5, IntPredicate intPredicate) {
        super(abstractC2935c0, i5);
        this.f38118l = intPredicate;
    }

    @Override // j$.util.stream.AbstractC2929b
    final Spliterator M(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        return EnumC2958g3.ORDERED.t(abstractC2929b.H()) ? L(abstractC2929b, spliterator, new C2942d2(6)).spliterator() : new m4((Spliterator.OfInt) abstractC2929b.U(spliterator), this.f38118l);
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new j4(this, abstractC2929b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        return new U3(this, interfaceC3011r2);
    }
}

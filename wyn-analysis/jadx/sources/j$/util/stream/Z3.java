package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class Z3 extends AbstractC2970j0 {
    @Override // j$.util.stream.AbstractC2929b
    final Spliterator M(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        return EnumC2958g3.ORDERED.t(abstractC2929b.H()) ? L(abstractC2929b, spliterator, new C2942d2(8)).spliterator() : new o4((j$.util.a0) abstractC2929b.U(spliterator), 1);
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new j4(this, abstractC2929b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        Y3 y32 = new Y3(interfaceC3011r2);
        y32.f38135b = true;
        return y32;
    }
}

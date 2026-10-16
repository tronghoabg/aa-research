package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class f4 extends A implements g4 {
    @Override // j$.util.stream.AbstractC2929b
    final Spliterator M(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        return EnumC2958g3.ORDERED.t(abstractC2929b.H()) ? L(abstractC2929b, spliterator, new C2942d2(11)).spliterator() : new k4((j$.util.V) abstractC2929b.U(spliterator), 0);
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new i4(this, abstractC2929b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        return new e4(this, interfaceC3011r2, false);
    }

    @Override // j$.util.stream.g4
    public final h4 k(C0 c02, boolean z2) {
        return new e4(this, c02, z2);
    }
}

package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class K2 extends A {
    @Override // j$.util.stream.AbstractC2929b
    public final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        Objects.requireNonNull(interfaceC3011r2);
        return EnumC2958g3.SORTED.t(i5) ? interfaceC3011r2 : EnumC2958g3.SIZED.t(i5) ? new P2(interfaceC3011r2) : new H2(interfaceC3011r2);
    }

    @Override // j$.util.stream.AbstractC2929b
    public final K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC2958g3.SORTED.t(abstractC2929b.H())) {
            return abstractC2929b.z(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((E0) abstractC2929b.z(spliterator, true, intFunction)).d();
        Arrays.sort(dArr);
        return new X0(dArr);
    }
}

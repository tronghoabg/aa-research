package j$.util.stream;

import j$.util.Comparator;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class N2 extends AbstractC2967i2 {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f38048m;

    /* renamed from: n, reason: collision with root package name */
    private final Comparator f38049n;

    N2(AbstractC2972j2 abstractC2972j2) {
        super(abstractC2972j2, EnumC2958g3.f38207q | EnumC2958g3.f38205o, 0);
        this.f38048m = true;
        this.f38049n = Comparator.CC.a();
    }

    N2(AbstractC2972j2 abstractC2972j2, java.util.Comparator comparator) {
        super(abstractC2972j2, EnumC2958g3.f38207q | EnumC2958g3.f38206p, 0);
        this.f38048m = false;
        this.f38049n = (java.util.Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC2929b
    public final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        Objects.requireNonNull(interfaceC3011r2);
        if (EnumC2958g3.SORTED.t(i5) && this.f38048m) {
            return interfaceC3011r2;
        }
        boolean zT = EnumC2958g3.SIZED.t(i5);
        java.util.Comparator comparator = this.f38049n;
        if (zT) {
            return new S2(interfaceC3011r2, comparator);
        }
        return new O2(interfaceC3011r2, comparator);
    }

    @Override // j$.util.stream.AbstractC2929b
    public final K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC2958g3.SORTED.t(abstractC2929b.H()) && this.f38048m) {
            return abstractC2929b.z(spliterator, false, intFunction);
        }
        Object[] objArrO = abstractC2929b.z(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(objArrO, this.f38049n);
        return new N0(objArrO);
    }
}

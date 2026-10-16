package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
final class X3 extends AbstractC2925a0 implements g4 {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ IntPredicate f38130l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3(AbstractC2935c0 abstractC2935c0, int i5, IntPredicate intPredicate) {
        super(abstractC2935c0, i5);
        this.f38130l = intPredicate;
    }

    @Override // j$.util.stream.AbstractC2929b
    final Spliterator M(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        return EnumC2958g3.ORDERED.t(abstractC2929b.H()) ? L(abstractC2929b, spliterator, new C2942d2(7)).spliterator() : new l4((Spliterator.OfInt) abstractC2929b.U(spliterator), this.f38130l);
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 L(AbstractC2929b abstractC2929b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new i4(this, abstractC2929b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        return new W3(this, interfaceC3011r2, false);
    }

    @Override // j$.util.stream.g4
    public final h4 k(C0 c02, boolean z2) {
        return new W3(this, c02, z2);
    }
}

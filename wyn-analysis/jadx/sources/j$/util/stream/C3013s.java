package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3013s extends AbstractC2977k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38303b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2929b f38304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3013s(AbstractC2929b abstractC2929b, InterfaceC3011r2 interfaceC3011r2, int i5) {
        super(interfaceC3011r2);
        this.f38303b = i5;
        this.f38304c = abstractC2929b;
    }

    @Override // j$.util.stream.AbstractC2977k2, j$.util.stream.InterfaceC3011r2
    public void l(long j8) {
        switch (this.f38303b) {
            case 4:
                this.f38245a.l(-1L);
                break;
            default:
                super.l(j8);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2997o2, j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        switch (this.f38303b) {
            case 0:
                this.f38245a.accept((InterfaceC3011r2) ((DoubleFunction) ((C3018t) this.f38304c).f38312n).apply(d3));
                return;
            case 1:
                ((C3023u) this.f38304c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d3);
                throw null;
            case 2:
                ((C3028v) this.f38304c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d3);
                throw null;
            case 3:
                ((C3033w) this.f38304c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d3);
                throw null;
            case 4:
                ((C3023u) this.f38304c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d3);
                throw null;
            default:
                ((DoubleConsumer) ((C3043y) this.f38304c).f38352n).accept(d3);
                this.f38245a.accept(d3);
                return;
        }
    }
}

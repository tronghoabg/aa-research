package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
final class V extends AbstractC2982l2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38116b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2929b f38117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(AbstractC2929b abstractC2929b, InterfaceC3011r2 interfaceC3011r2, int i5) {
        super(interfaceC3011r2);
        this.f38116b = i5;
        this.f38117c = abstractC2929b;
    }

    @Override // j$.util.stream.AbstractC2982l2, j$.util.stream.InterfaceC3011r2
    public void l(long j8) {
        switch (this.f38116b) {
            case 5:
                this.f38253a.l(-1L);
                break;
            default:
                super.l(j8);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3002p2, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        switch (this.f38116b) {
            case 0:
                this.f38253a.accept((InterfaceC3011r2) ((IntFunction) ((C3018t) this.f38117c).f38312n).apply(i5));
                return;
            case 1:
                ((IntConsumer) ((W) this.f38117c).f38120m).accept(i5);
                this.f38253a.accept(i5);
                return;
            case 2:
                this.f38253a.accept(((IntUnaryOperator) ((W) this.f38117c).f38120m).applyAsInt(i5));
                return;
            case 3:
                ((C3033w) this.f38117c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i5);
                throw null;
            case 4:
                ((C3023u) this.f38117c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i5);
                throw null;
            default:
                if (((IntPredicate) ((W) this.f38117c).f38120m).test(i5)) {
                    this.f38253a.accept(i5);
                    return;
                }
                return;
        }
    }
}

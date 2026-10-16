package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2945e0 extends AbstractC2987m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38178b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2929b f38179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2945e0(AbstractC2929b abstractC2929b, InterfaceC3011r2 interfaceC3011r2, int i5) {
        super(interfaceC3011r2);
        this.f38178b = i5;
        this.f38179c = abstractC2929b;
    }

    @Override // j$.util.stream.AbstractC2987m2, j$.util.stream.InterfaceC3011r2
    public void l(long j8) {
        switch (this.f38178b) {
            case 4:
                this.f38258a.l(-1L);
                break;
            default:
                super.l(j8);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        switch (this.f38178b) {
            case 0:
                this.f38258a.accept((InterfaceC3011r2) ((LongFunction) ((C3018t) this.f38179c).f38312n).apply(j8));
                return;
            case 1:
                ((C3033w) this.f38179c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j8);
                throw null;
            case 2:
                ((C3028v) this.f38179c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j8);
                throw null;
            case 3:
                ((C3023u) this.f38179c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j8);
                throw null;
            case 4:
                ((C3033w) this.f38179c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j8);
                throw null;
            default:
                ((LongConsumer) ((C2960h0) this.f38179c).f38219n).accept(j8);
                this.f38258a.accept(j8);
                return;
        }
    }
}

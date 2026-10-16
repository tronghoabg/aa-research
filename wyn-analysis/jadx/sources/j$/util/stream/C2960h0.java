package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2960h0 extends AbstractC2970j0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f38218m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f38219n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2960h0(AbstractC2929b abstractC2929b, int i5, Object obj, int i10) {
        super(abstractC2929b, i5, 1);
        this.f38218m = i10;
        this.f38219n = obj;
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        switch (this.f38218m) {
            case 0:
                return new C2955g0(this, interfaceC3011r2);
            case 1:
                return new C2945e0(this, interfaceC3011r2, 5);
            case 2:
                return new C2947e2(this, interfaceC3011r2);
            default:
                return new C2984m(this, interfaceC3011r2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2960h0(AbstractC2975k0 abstractC2975k0, LongConsumer longConsumer) {
        super(abstractC2975k0, 0, 1);
        this.f38218m = 1;
        this.f38219n = longConsumer;
    }
}

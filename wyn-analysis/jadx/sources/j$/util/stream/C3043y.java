package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3043y extends A {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f38351m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f38352n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3043y(AbstractC2929b abstractC2929b, int i5, Object obj, int i10) {
        super(abstractC2929b, i5, 1);
        this.f38351m = i10;
        this.f38352n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3043y(B b5, DoubleConsumer doubleConsumer) {
        super(b5, 0, 1);
        this.f38351m = 1;
        this.f38352n = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        switch (this.f38351m) {
            case 0:
                return new C3038x(this, interfaceC3011r2);
            case 1:
                return new C3013s(this, interfaceC3011r2, 5);
            case 2:
                return new C2984m(this, interfaceC3011r2, 6);
            default:
                return new C2947e2(this, interfaceC3011r2);
        }
    }
}

package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3018t extends AbstractC2967i2 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f38311m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f38312n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3018t(AbstractC2929b abstractC2929b, int i5, Object obj, int i10) {
        super(abstractC2929b, i5, 1);
        this.f38311m = i10;
        this.f38312n = obj;
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        switch (this.f38311m) {
            case 0:
                return new C3013s(this, interfaceC3011r2, 0);
            case 1:
                return new V(this, interfaceC3011r2, 0);
            case 2:
                return new C2945e0(this, interfaceC3011r2, 0);
            case 3:
                return new C2984m(this, interfaceC3011r2, 1);
            case 4:
                return new C2984m(this, interfaceC3011r2, 2);
            case 5:
                return new C2984m(this, interfaceC3011r2, 3);
            default:
                return new C2979l(this, interfaceC3011r2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3018t(AbstractC2972j2 abstractC2972j2, Consumer consumer) {
        super(abstractC2972j2, 0, 1);
        this.f38311m = 3;
        this.f38312n = consumer;
    }
}

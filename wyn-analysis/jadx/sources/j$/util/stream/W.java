package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class W extends AbstractC2930b0 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f38119l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Object f38120m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(AbstractC2929b abstractC2929b, int i5, Object obj, int i10) {
        super(abstractC2929b, i5);
        this.f38119l = i10;
        this.f38120m = obj;
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        switch (this.f38119l) {
            case 0:
                return new V(this, interfaceC3011r2, 1);
            case 1:
                return new V(this, interfaceC3011r2, 2);
            case 2:
                return new Y(this, interfaceC3011r2);
            case 3:
                return new V(this, interfaceC3011r2, 5);
            case 4:
                return new C2984m(this, interfaceC3011r2, 4);
            default:
                return new C2957g2(this, interfaceC3011r2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AbstractC2935c0 abstractC2935c0, IntConsumer intConsumer) {
        super(abstractC2935c0, 0);
        this.f38119l = 0;
        this.f38120m = intConsumer;
    }
}

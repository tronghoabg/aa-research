package j$.util.stream;

/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3033w extends AbstractC2970j0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f38332m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3033w(AbstractC2929b abstractC2929b, int i5, int i10) {
        super(abstractC2929b, i5, 1);
        this.f38332m = i10;
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        switch (this.f38332m) {
            case 0:
                return new C3013s(this, interfaceC3011r2, 3);
            case 1:
                return new X(0, interfaceC3011r2);
            case 2:
                return new V(this, interfaceC3011r2, 3);
            case 3:
                return new C2945e0(this, interfaceC3011r2, 1);
            case 4:
                return interfaceC3011r2;
            default:
                return new C2945e0(this, interfaceC3011r2, 4);
        }
    }
}

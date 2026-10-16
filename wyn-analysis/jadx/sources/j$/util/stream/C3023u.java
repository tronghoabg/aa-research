package j$.util.stream;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3023u extends A {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f38316m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3023u(AbstractC2929b abstractC2929b, int i5, int i10) {
        super(abstractC2929b, i5, 1);
        this.f38316m = i10;
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        switch (this.f38316m) {
            case 0:
                return new C3013s(this, interfaceC3011r2, 1);
            case 1:
                return interfaceC3011r2;
            case 2:
                return new C3013s(this, interfaceC3011r2, 4);
            case 3:
                return new X(1, interfaceC3011r2);
            case 4:
                return new V(this, interfaceC3011r2, 4);
            case 5:
                return new C2950f0(interfaceC3011r2);
            default:
                return new C2945e0(this, interfaceC3011r2, 3);
        }
    }
}

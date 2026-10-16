package j$.util.stream;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3028v extends AbstractC2930b0 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f38325l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3028v(AbstractC2929b abstractC2929b, int i5, int i10) {
        super(abstractC2929b, i5);
        this.f38325l = i10;
    }

    @Override // j$.util.stream.AbstractC2929b
    final InterfaceC3011r2 O(int i5, InterfaceC3011r2 interfaceC3011r2) {
        switch (this.f38325l) {
            case 0:
                return new C3013s(this, interfaceC3011r2, 2);
            case 1:
                return interfaceC3011r2;
            default:
                return new C2945e0(this, interfaceC3011r2, 2);
        }
    }
}

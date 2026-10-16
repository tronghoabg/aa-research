package j$.util.stream;

/* loaded from: classes2.dex */
final class X extends AbstractC2982l2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(int i5, InterfaceC3011r2 interfaceC3011r2) {
        super(interfaceC3011r2);
        this.f38127b = i5;
    }

    @Override // j$.util.stream.InterfaceC3002p2, j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        switch (this.f38127b) {
            case 0:
                this.f38253a.accept(i5);
                break;
            default:
                this.f38253a.accept(i5);
                break;
        }
    }
}

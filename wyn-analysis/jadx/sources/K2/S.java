package k2;

/* loaded from: classes.dex */
public final /* synthetic */ class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f38941b;

    public /* synthetic */ S(X x5, int i5) {
        this.f38940a = i5;
        this.f38941b = x5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38940a) {
            case 0:
                this.f38941b.v();
                break;
            case 1:
                X x5 = this.f38941b;
                if (!x5.f38974O) {
                    InterfaceC3143E interfaceC3143E = x5.f38991r;
                    interfaceC3143E.getClass();
                    interfaceC3143E.a(x5);
                    break;
                }
                break;
            default:
                this.f38941b.f38969I = true;
                break;
        }
    }
}

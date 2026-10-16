package f6;

/* renamed from: f6.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2580J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2584N f34900b;

    public /* synthetic */ RunnableC2580J(C2584N c2584n, int i5) {
        this.f34899a = i5;
        this.f34900b = c2584n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34899a) {
            case 0:
                this.f34900b.u();
                break;
            case 1:
                C2584N c2584n = this.f34900b;
                if (!c2584n.f34928K) {
                    InterfaceC2609v interfaceC2609v = c2584n.f34943p;
                    interfaceC2609v.getClass();
                    interfaceC2609v.b(c2584n);
                    break;
                }
                break;
            default:
                this.f34900b.f34922E = true;
                break;
        }
    }
}

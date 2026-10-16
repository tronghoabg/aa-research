package R8;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f10496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K3.r f10497c;

    public /* synthetic */ n(s sVar, K3.r rVar, int i5) {
        this.f10495a = i5;
        this.f10496b = sVar;
        this.f10497c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10495a) {
            case 0:
                this.f10496b.a(this.f10497c);
                break;
            default:
                this.f10496b.a(this.f10497c);
                break;
        }
    }
}

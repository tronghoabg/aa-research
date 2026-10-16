package f6;

/* renamed from: f6.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2572B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I5.f f34870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2603p f34872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2608u f34873e;

    public /* synthetic */ RunnableC2572B(I5.f fVar, InterfaceC2574D interfaceC2574D, C2603p c2603p, C2608u c2608u, int i5) {
        this.f34869a = i5;
        this.f34870b = fVar;
        this.f34871c = interfaceC2574D;
        this.f34872d = c2603p;
        this.f34873e = c2608u;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f6.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [f6.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [f6.D, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34869a) {
            case 0:
                I5.f fVar = this.f34870b;
                int i5 = fVar.f5392a;
                this.f34871c.C(i5, fVar.f5393b, this.f34872d, this.f34873e);
                break;
            case 1:
                I5.f fVar2 = this.f34870b;
                int i10 = fVar2.f5392a;
                this.f34871c.A(i10, fVar2.f5393b, this.f34872d, this.f34873e);
                break;
            default:
                I5.f fVar3 = this.f34870b;
                int i11 = fVar3.f5392a;
                this.f34871c.D(i11, fVar3.f5393b, this.f34872d, this.f34873e);
                break;
        }
    }
}

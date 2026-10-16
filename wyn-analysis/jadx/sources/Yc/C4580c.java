package yc;

/* renamed from: yc.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C4580c implements InterfaceC4590m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4584g f48105b;

    public /* synthetic */ C4580c(C4584g c4584g, int i5) {
        this.f48104a = i5;
        this.f48105b = c4584g;
    }

    @Override // yc.InterfaceC4590m
    public final void onError(String str) {
        switch (this.f48104a) {
            case 0:
                this.f48105b.f48119h.w(str);
                break;
            case 1:
                C4584g c4584g = this.f48105b;
                c4584g.f48119h.l(c4584g.f48136z, "cameraAccess", str);
                break;
            default:
                C4584g c4584g2 = this.f48105b;
                c4584g2.f48119h.l(c4584g2.f48136z, "cameraAccess", str);
                break;
        }
    }
}

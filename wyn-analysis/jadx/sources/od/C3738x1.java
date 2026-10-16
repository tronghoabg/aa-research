package od;

/* renamed from: od.x1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3738x1 implements A1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42126b;

    public /* synthetic */ C3738x1(int i5, int i10) {
        this.f42125a = i10;
        this.f42126b = i5;
    }

    @Override // od.A1
    public final void a(G1 g12) {
        switch (this.f42125a) {
            case 0:
                g12.f41564a.e(this.f42126b);
                break;
            case 1:
                g12.f41564a.b(this.f42126b);
                break;
            default:
                g12.f41564a.d(this.f42126b);
                break;
        }
    }
}

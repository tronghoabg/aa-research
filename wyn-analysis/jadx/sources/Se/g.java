package Se;

/* loaded from: classes5.dex */
public final class g extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11077b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(He.g gVar, Object obj, int i5) {
        super(gVar);
        this.f11077b = i5;
        this.f11078c = obj;
    }

    @Override // He.g
    public final void c(He.h hVar) {
        switch (this.f11077b) {
            case 0:
                this.f11063a.b(new f(hVar, (Le.d) this.f11078c, 0));
                break;
            case 1:
                this.f11063a.b(new p(hVar, (He.m) this.f11078c));
                break;
            default:
                this.f11063a.b(new i(2, hVar, (He.g) this.f11078c));
                break;
        }
    }
}

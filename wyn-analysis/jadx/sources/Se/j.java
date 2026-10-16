package Se;

/* loaded from: classes5.dex */
public final class j extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11085b;

    /* renamed from: c, reason: collision with root package name */
    public final Le.c f11086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(He.g gVar, Le.c cVar, int i5) {
        super(gVar);
        this.f11085b = i5;
        this.f11086c = cVar;
    }

    @Override // He.g
    public final void c(He.h hVar) {
        switch (this.f11085b) {
            case 0:
                this.f11063a.b(new b(hVar, this.f11086c));
                break;
            case 1:
                this.f11063a.b(new Qe.d(hVar, this.f11086c, 1));
                break;
            default:
                this.f11063a.b(new q(hVar, this.f11086c));
                break;
        }
    }
}

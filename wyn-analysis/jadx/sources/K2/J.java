package k2;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements Q1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z1.d f38909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3168z f38910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2.g f38911d;

    public /* synthetic */ J(Z1.d dVar, C3168z c3168z, h2.g gVar, int i5) {
        this.f38908a = i5;
        this.f38909b = dVar;
        this.f38910c = c3168z;
        this.f38911d = gVar;
    }

    @Override // Q1.c
    public final void accept(Object obj) {
        M m10 = (M) obj;
        switch (this.f38908a) {
            case 0:
                Z1.d dVar = this.f38909b;
                m10.y(dVar.f16926a, dVar.f16927b, this.f38910c, this.f38911d);
                break;
            case 1:
                Z1.d dVar2 = this.f38909b;
                m10.r(dVar2.f16926a, dVar2.f16927b, this.f38910c, this.f38911d);
                break;
            default:
                Z1.d dVar3 = this.f38909b;
                m10.D(dVar3.f16926a, dVar3.f16927b, this.f38910c, this.f38911d);
                break;
        }
    }
}

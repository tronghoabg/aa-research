package J9;

/* renamed from: J9.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0661u {

    /* renamed from: c, reason: collision with root package name */
    public static final ta.f f5984c = ta.f.d();

    /* renamed from: a, reason: collision with root package name */
    public final I f5985a;

    /* renamed from: b, reason: collision with root package name */
    public He.g f5986b = Se.e.f11072a;

    public C0661u(I i5) {
        this.f5985a = i5;
    }

    public final He.g a() {
        He.g gVar = this.f5986b;
        Se.k kVarA = this.f5985a.a(ta.f.parser());
        final int i5 = 0;
        Le.b bVar = new Le.b(this) { // from class: J9.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0661u f5980b;

            {
                this.f5980b = this;
            }

            @Override // Le.b, Q1.c
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        this.f5980b.f5986b = He.g.a((ta.f) obj);
                        break;
                    default:
                        this.f5980b.f5986b = Se.e.f11072a;
                        break;
                }
            }
        };
        ya.b bVar2 = Ne.b.f8674d;
        He.g gVarD = gVar.d(new Se.r(kVarA, bVar, bVar2));
        final int i10 = 1;
        return new Se.r(gVarD, bVar2, new Le.b(this) { // from class: J9.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0661u f5980b;

            {
                this.f5980b = this;
            }

            @Override // Le.b, Q1.c
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f5980b.f5986b = He.g.a((ta.f) obj);
                        break;
                    default:
                        this.f5980b.f5986b = Se.e.f11072a;
                        break;
                }
            }
        });
    }
}

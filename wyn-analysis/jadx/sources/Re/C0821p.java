package Re;

import x9.C4504d;

/* renamed from: Re.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0821p extends AbstractC0806a {

    /* renamed from: c, reason: collision with root package name */
    public final F5.d f10752c;

    /* renamed from: d, reason: collision with root package name */
    public final ya.b f10753d;

    /* renamed from: e, reason: collision with root package name */
    public final C4504d f10754e;

    /* renamed from: f, reason: collision with root package name */
    public final C4504d f10755f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0821p(He.c cVar, F5.d dVar) {
        super(cVar);
        ya.b bVar = Ne.b.f8674d;
        C4504d c4504d = Ne.b.f8673c;
        this.f10752c = dVar;
        this.f10753d = bVar;
        this.f10754e = c4504d;
        this.f10755f = c4504d;
    }

    @Override // He.c
    public final void e(He.f fVar) {
        boolean z2 = fVar instanceof Oe.a;
        He.c cVar = this.f10702b;
        if (z2) {
            cVar.d(new C0819n((Oe.a) fVar, this.f10752c, this.f10753d, this.f10754e, this.f10755f));
        } else {
            cVar.d(new C0820o(fVar, this.f10752c, this.f10753d, this.f10754e, this.f10755f));
        }
    }
}

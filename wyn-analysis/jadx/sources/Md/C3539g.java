package md;

/* renamed from: md.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3539g extends AbstractC3536d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3536d f40640a;

    /* renamed from: b, reason: collision with root package name */
    public final ud.g f40641b;

    public C3539g(AbstractC3536d abstractC3536d, ud.g gVar) {
        this.f40640a = abstractC3536d;
        Fe.e.t(gVar, "interceptor");
        this.f40641b = gVar;
    }

    @Override // md.AbstractC3536d
    public final String g() {
        return this.f40640a.g();
    }

    @Override // md.AbstractC3536d
    public final AbstractC3538f h(F6.r rVar, C3535c c3535c) {
        AbstractC3536d abstractC3536d = this.f40640a;
        ud.g gVar = this.f40641b;
        gVar.getClass();
        return new ud.f(gVar, abstractC3536d.h(rVar, c3535c));
    }
}

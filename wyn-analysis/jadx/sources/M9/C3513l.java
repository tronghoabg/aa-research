package m9;

import p9.C3781b;

/* renamed from: m9.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3513l implements L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3781b f40492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p9.n f40493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p9.v f40494d;

    public /* synthetic */ C3513l(C3781b c3781b, p9.n nVar, p9.v vVar, int i5) {
        this.f40491a = i5;
        this.f40492b = c3781b;
        this.f40493c = nVar;
        this.f40494d = vVar;
    }

    @Override // m9.L
    public final void remove() {
        switch (this.f40491a) {
            case 0:
                C3781b c3781b = this.f40492b;
                p9.n nVar = this.f40493c;
                p9.v vVar = this.f40494d;
                c3781b.f43341c = true;
                nVar.getClass();
                nVar.f43382d.a(new p9.m(nVar, vVar, 0));
                break;
            default:
                C3781b c3781b2 = this.f40492b;
                p9.n nVar2 = this.f40493c;
                p9.v vVar2 = this.f40494d;
                c3781b2.f43341c = true;
                nVar2.getClass();
                nVar2.f43382d.a(new p9.m(nVar2, vVar2, 0));
                break;
        }
    }
}

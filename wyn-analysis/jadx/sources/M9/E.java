package m9;

import p9.C3781b;

/* loaded from: classes4.dex */
public final /* synthetic */ class E implements L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3781b f40410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p9.n f40411b;

    public /* synthetic */ E(C3781b c3781b, p9.n nVar) {
        this.f40410a = c3781b;
        this.f40411b = nVar;
    }

    @Override // m9.L
    public final void remove() {
        C3781b c3781b = this.f40410a;
        p9.n nVar = this.f40411b;
        c3781b.f43341c = true;
        nVar.getClass();
        nVar.f43382d.a(new ng.a(5, nVar, c3781b));
    }
}

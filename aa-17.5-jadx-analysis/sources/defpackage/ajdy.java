package defpackage;

/* loaded from: classes3.dex */
final class ajdy implements aitf, aiwr {
    public final aitg a;
    final /* synthetic */ ajdz b;

    public ajdy(ajdz ajdzVar, aitg aitgVar) {
        this.b = ajdzVar;
        this.a = aitgVar;
    }

    @Override // defpackage.aiwr
    public final void E(ajbv ajbvVar, int i) {
        this.a.E(ajbvVar, i);
    }

    @Override // defpackage.aitf
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aitf
    public final void d(afec afecVar) {
        throw null;
    }

    @Override // defpackage.aitf
    public final /* bridge */ /* synthetic */ void e(Object obj, afeh afehVar) {
        boolean z = aitz.a;
        ajdz ajdzVar = this.b;
        ajdzVar.a.c(null);
        xrr xrrVar = new xrr(ajdzVar, 10);
        aitg aitgVar = this.a;
        aitgVar.C(obj, aitgVar.e, new njt(xrrVar, 13));
    }

    @Override // defpackage.aitf
    public final /* bridge */ /* synthetic */ void f(aitu aituVar, Object obj) {
        throw null;
    }

    @Override // defpackage.aitf
    public final boolean g(Throwable th) {
        return this.a.g(th);
    }

    @Override // defpackage.aitf
    public final boolean h() {
        throw null;
    }

    @Override // defpackage.afck
    public final afco hH() {
        return this.a.b;
    }

    @Override // defpackage.aitf
    public final boolean i() {
        throw null;
    }

    @Override // defpackage.aitf
    public final /* bridge */ /* synthetic */ Object j(Object obj, afeh afehVar) {
        boolean z = aitz.a;
        ajdz ajdzVar = this.b;
        njt njtVar = new njt(ajdzVar, 14);
        ajcz ajczVarG = this.a.G((afak) obj, njtVar);
        if (ajczVarG != null) {
            ajdzVar.a.c(null);
        }
        return ajczVarG;
    }

    @Override // defpackage.afck
    public final void w(Object obj) {
        this.a.w(obj);
    }
}

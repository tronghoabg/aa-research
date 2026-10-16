package defpackage;

/* loaded from: classes.dex */
public final class baa extends cfx implements cyu {
    public afdr a;
    public azy b;
    public api c;
    public boolean d;
    private ddp e;
    private final afec f = new aui(this, 17);
    private afec g;

    public baa(afdr afdrVar, azy azyVar, api apiVar, boolean z) {
        this.a = afdrVar;
        this.b = azyVar;
        this.c = apiVar;
        this.d = z;
        b();
    }

    public final void b() {
        this.e = new ddp(new alg(this, 19), new alg(this, 20));
        this.g = this.d ? new aui(this, 18) : null;
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        decVar.a(ddx.n, true);
        decVar.a(ddx.Q, this.f);
        api apiVar = this.c;
        api apiVar2 = api.a;
        ddp ddpVar = this.e;
        if (apiVar == apiVar2) {
            if (ddpVar == null) {
                affa.d("scrollAxisRange");
                ddpVar = null;
            }
            decVar.a(ddx.x, ddpVar);
        } else {
            if (ddpVar == null) {
                affa.d("scrollAxisRange");
                ddpVar = null;
            }
            decVar.a(ddx.w, ddpVar);
        }
        afec afecVar = this.g;
        if (afecVar != null) {
            decVar.a(ddq.f, new ddf(null, afecVar));
        }
        decVar.a(ddq.C, new ddf(null, new ddz(new bap(this, 1), 0)));
        decVar.a(ddx.f, this.b.e());
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }
}

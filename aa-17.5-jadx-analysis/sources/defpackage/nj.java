package defpackage;

/* loaded from: classes2.dex */
final class nj extends ebv {
    final /* synthetic */ int a;
    final /* synthetic */ nk b;
    private boolean c = false;

    public nj(nk nkVar, int i) {
        this.b = nkVar;
        this.a = i;
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final void a() {
        if (this.c) {
            return;
        }
        nk nkVar = this.b;
        nkVar.a.setVisibility(this.a);
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final void c() {
        this.c = true;
    }
}

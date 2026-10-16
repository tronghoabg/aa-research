package defpackage;

/* loaded from: classes.dex */
final class vqc implements vqa {
    final /* synthetic */ xyc a;
    final /* synthetic */ xyc b;
    final /* synthetic */ vqe c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public vqc(vqe vqeVar, xyc xycVar, xyc xycVar2, Object obj, int i) {
        this.e = i;
        this.a = xycVar;
        this.b = xycVar2;
        this.d = obj;
        this.c = vqeVar;
    }

    private final void a() {
        vqe vqeVar = this.c;
        vpy vpyVar = vqeVar.b;
        if (vpyVar != null) {
            ((vqq) this.d).g.remove(vpyVar);
            vqeVar.b = null;
        }
    }

    private final void b() {
        vqe vqeVar = this.c;
        vqf vqfVar = vqeVar.a;
        if (vqfVar != null) {
            ((vqk) this.d).b(vqfVar);
            vqeVar.a = null;
        }
    }

    @Override // defpackage.vqa
    public final void g(vky vkyVar) {
        int i = this.e;
        xyc xycVar = this.a;
        if (i != 0) {
            if (((Boolean) xycVar.gu()).booleanValue()) {
                this.c.c.k(vkyVar);
                return;
            } else if (((Boolean) this.b.gu()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.k(vkyVar);
                return;
            }
        }
        if (((Boolean) xycVar.gu()).booleanValue()) {
            this.c.c.k(vkyVar);
        } else if (((Boolean) this.b.gu()).booleanValue()) {
            this.c.c.k(vkyVar);
        } else {
            a();
        }
    }

    @Override // defpackage.vqa
    public final void j(vky vkyVar) {
        int i = this.e;
        xyc xycVar = this.a;
        if (i != 0) {
            if (((Boolean) xycVar.gu()).booleanValue()) {
                this.c.c.l(vkyVar);
                return;
            } else if (((Boolean) this.b.gu()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.l(vkyVar);
                return;
            }
        }
        if (((Boolean) xycVar.gu()).booleanValue()) {
            this.c.c.l(vkyVar);
        } else if (((Boolean) this.b.gu()).booleanValue()) {
            this.c.c.l(vkyVar);
        } else {
            a();
        }
    }
}

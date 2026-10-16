package defpackage;

/* loaded from: classes.dex */
final class lnd extends kfn {
    final /* synthetic */ lne a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnd(lne lneVar) {
        super(null);
        this.a = lneVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [qrx] */
    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        char c;
        qrx qrxVar;
        try {
            try {
                lne lneVar = this.a;
                mki.a.g();
                rdm rdmVarD = ((qsz) qrnVar).d();
                lneVar.n = (qrx) rdmVarD.f.a(new rcl(rdmVarD, 10));
                c = 4041;
            } finally {
                if (this.a.n == null) {
                    ((ype) ((ype) lne.m.f()).ai((char) 4044)).u("CarMediaManager not available, no playback status.");
                }
            }
        } catch (IllegalStateException | SecurityException | qrz | qsa e) {
            ((ype) ((ype) ((ype) lne.m.h()).p(e)).ai(4042)).u("Unable to connect to car.");
            c = 4043;
        }
        if (qrxVar == 0) {
            ((ype) ((ype) lne.m.f()).ai(c)).u("CarMediaManager not available, no playback status.");
        }
    }

    @Override // defpackage.kfn
    public final void b() {
        this.a.n = null;
    }

    @Override // defpackage.kfn
    public final void c(qrn qrnVar) {
        ((ype) lne.m.l().ai((char) 4045)).u("Car service connected.");
    }
}

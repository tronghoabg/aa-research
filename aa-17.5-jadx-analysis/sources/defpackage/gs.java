package defpackage;

/* loaded from: classes2.dex */
final class gs extends ebv {
    final /* synthetic */ gt a;
    private boolean b = false;
    private int c = 0;

    public gs(gt gtVar) {
        this.a = gtVar;
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        gt gtVar = this.a;
        if (i == gtVar.a.size()) {
            ebu ebuVar = gtVar.b;
            if (ebuVar != null) {
                ebuVar.a();
            }
            this.c = 0;
            this.b = false;
            gtVar.c = false;
        }
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ebu ebuVar = this.a.b;
        if (ebuVar != null) {
            ebuVar.b();
        }
    }
}

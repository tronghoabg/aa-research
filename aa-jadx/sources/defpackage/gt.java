package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class gt extends defpackage.ecc {
    final /* synthetic */ defpackage.gu a;
    private boolean b = false;
    private int c = 0;

    public gt(defpackage.gu guVar) {
        this.a = guVar;
    }

    @Override // defpackage.ecc, defpackage.ecb
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        defpackage.gu guVar = this.a;
        if (i == guVar.a.size()) {
            defpackage.ecb ecbVar = guVar.b;
            if (ecbVar != null) {
                ecbVar.a();
            }
            this.c = 0;
            this.b = false;
            guVar.c = false;
        }
    }

    @Override // defpackage.ecc, defpackage.ecb
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        defpackage.ecb ecbVar = this.a.b;
        if (ecbVar != null) {
            ecbVar.b();
        }
    }
}

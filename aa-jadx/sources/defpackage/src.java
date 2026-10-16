package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class src implements defpackage.srd {
    final /* synthetic */ defpackage.sre a;
    private final /* synthetic */ int b;

    public src(defpackage.sre sreVar, int i) {
        this.b = i;
        this.a = sreVar;
    }

    @Override // defpackage.srd
    public final int a() {
        return this.b != 0 ? 4 : 5;
    }

    @Override // defpackage.srd
    public final void b() {
        int i = this.b;
        defpackage.sri sriVar = this.a.a;
        if (i != 0) {
            sriVar.onStart();
        } else {
            sriVar.onResume();
        }
    }
}

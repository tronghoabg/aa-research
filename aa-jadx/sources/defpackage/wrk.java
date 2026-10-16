package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wrk extends defpackage.wuc {
    final /* synthetic */ defpackage.wrm a;

    public wrk(defpackage.wrm wrmVar) {
        this.a = wrmVar;
    }

    @Override // defpackage.wuc
    public final void a(int i) {
        defpackage.wrm wrmVar = this.a;
        wrmVar.c = true;
        defpackage.wrl wrlVar = (defpackage.wrl) wrmVar.d.get();
        if (wrlVar != null) {
            wrlVar.j();
        }
    }

    @Override // defpackage.wuc
    public final void b(android.graphics.Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        defpackage.wrm wrmVar = this.a;
        wrmVar.c = true;
        defpackage.wrl wrlVar = (defpackage.wrl) wrmVar.d.get();
        if (wrlVar != null) {
            wrlVar.j();
        }
    }
}

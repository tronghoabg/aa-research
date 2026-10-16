package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lj extends android.database.DataSetObserver {
    final /* synthetic */ defpackage.ll a;

    public lj(defpackage.ll llVar) {
        this.a = llVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        defpackage.ll llVar = this.a;
        if (llVar.u()) {
            llVar.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}

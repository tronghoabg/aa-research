package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ei implements android.widget.AdapterView.OnItemClickListener {
    final /* synthetic */ android.support.v7.app.AlertController.RecycleListView a;
    final /* synthetic */ android.support.v7.app.AlertController b;
    final /* synthetic */ defpackage.ej c;

    public ei(defpackage.ej ejVar, android.support.v7.app.AlertController.RecycleListView recycleListView, android.support.v7.app.AlertController alertController) {
        this.c = ejVar;
        this.a = recycleListView;
        this.b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        defpackage.ej ejVar = this.c;
        boolean[] zArr = ejVar.s;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        ejVar.w.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}

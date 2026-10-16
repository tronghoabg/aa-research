package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eh implements android.widget.AdapterView.OnItemClickListener {
    final /* synthetic */ android.support.v7.app.AlertController a;
    final /* synthetic */ defpackage.ej b;

    public eh(defpackage.ej ejVar, android.support.v7.app.AlertController alertController) {
        this.b = ejVar;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        android.support.v7.app.AlertController alertController = this.a;
        defpackage.ej ejVar = this.b;
        android.content.DialogInterface.OnClickListener onClickListener = ejVar.q;
        defpackage.fh fhVar = alertController.b;
        onClickListener.onClick(fhVar, i);
        if (ejVar.u) {
            return;
        }
        fhVar.dismiss();
    }
}

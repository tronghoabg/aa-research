package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class al implements android.content.DialogInterface.OnDismissListener {
    final /* synthetic */ defpackage.ao a;

    public al(defpackage.ao aoVar) {
        this.a = aoVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        defpackage.ao aoVar = this.a;
        android.app.Dialog dialog = aoVar.e;
        if (dialog != null) {
            aoVar.onDismiss(dialog);
        }
    }
}

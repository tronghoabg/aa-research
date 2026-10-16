package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ak implements android.content.DialogInterface.OnCancelListener {
    final /* synthetic */ defpackage.ao a;

    public ak(defpackage.ao aoVar) {
        this.a = aoVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        defpackage.ao aoVar = this.a;
        android.app.Dialog dialog = aoVar.e;
        if (dialog != null) {
            aoVar.onCancel(dialog);
        }
    }
}

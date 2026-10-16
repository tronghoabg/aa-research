package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class nk implements android.view.View.OnClickListener {
    final defpackage.gw a;
    final /* synthetic */ defpackage.nm b;

    public nk(defpackage.nm nmVar) {
        this.b = nmVar;
        this.a = new defpackage.gw(nmVar.a.getContext(), nmVar.c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.nm nmVar = this.b;
        android.view.Window.Callback callback = nmVar.d;
        if (callback == null || !nmVar.e) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}

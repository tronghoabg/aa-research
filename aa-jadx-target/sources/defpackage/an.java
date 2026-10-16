package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class an extends defpackage.be {
    final /* synthetic */ defpackage.be a;
    final /* synthetic */ defpackage.ao b;

    public an(defpackage.ao aoVar, defpackage.be beVar) {
        this.b = aoVar;
        this.a = beVar;
    }

    @Override // defpackage.be
    public final android.view.View a(int i) {
        defpackage.be beVar = this.a;
        if (beVar.b()) {
            return beVar.a(i);
        }
        android.app.Dialog dialog = this.b.e;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.be
    public final boolean b() {
        return this.a.b() || this.b.f;
    }
}

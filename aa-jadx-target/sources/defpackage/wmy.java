package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wmy extends defpackage.dzw {
    final /* synthetic */ defpackage.wnb a;

    public wmy(defpackage.wnb wnbVar) {
        this.a = wnbVar;
    }

    @Override // defpackage.dzw
    public final void c(android.view.View view, edn ednVar) {
        super.c(view, ednVar);
        if (!this.a.c) {
            ednVar.w(false);
        } else {
            ednVar.g(1048576);
            ednVar.w(true);
        }
    }

    @Override // defpackage.dzw
    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (i == 1048576) {
            defpackage.wnb wnbVar = this.a;
            if (wnbVar.c) {
                wnbVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.i(view, i, bundle);
    }
}

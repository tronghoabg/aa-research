package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class it implements defpackage.hf {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public it(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hf
    public final void I(defpackage.hh hhVar) {
        int i = this.b;
        if (i == 0) {
            defpackage.hf hfVar = ((android.support.v7.widget.ActionMenuView) this.a).d;
            if (hfVar != null) {
                hfVar.I(hhVar);
                return;
            }
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) obj;
            if (!toolbar.a.m()) {
                toolbar.B.k(hhVar);
            }
            defpackage.hf hfVar2 = toolbar.z;
            if (hfVar2 != null) {
                hfVar2.I(hhVar);
                return;
            }
            return;
        }
        defpackage.fm fmVar = (defpackage.fm) obj;
        if (fmVar.c.l()) {
            fmVar.a.onPanelClosed(108, hhVar);
            return;
        }
        android.view.Window.Callback callback = fmVar.a;
        if (callback.onPreparePanel(0, null, hhVar)) {
            callback.onMenuOpened(108, hhVar);
        }
    }

    @Override // defpackage.hf
    public final boolean M(defpackage.hh hhVar, android.view.MenuItem menuItem) {
        defpackage.izq izqVar;
        if (this.b == 0 && (izqVar = ((android.support.v7.widget.ActionMenuView) this.a).e) != null) {
            android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) izqVar.a;
            if (toolbar.B.l(menuItem)) {
                return true;
            }
            defpackage.izq izqVar2 = toolbar.C;
            return izqVar2 != null && ((defpackage.fm) izqVar2.a).a.onMenuItemSelected(0, menuItem);
        }
        return false;
    }
}

package defpackage;

/* loaded from: classes.dex */
final class fk implements hr {
    final /* synthetic */ fl a;
    private boolean b;

    public fk(fl flVar) {
        this.a = flVar;
    }

    @Override // defpackage.hr
    public final void a(hg hgVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        fl flVar = this.a;
        flVar.c.c();
        flVar.a.onPanelClosed(108, hgVar);
        this.b = false;
    }

    @Override // defpackage.hr
    public final boolean b(hg hgVar) {
        this.a.a.onMenuOpened(108, hgVar);
        return true;
    }
}

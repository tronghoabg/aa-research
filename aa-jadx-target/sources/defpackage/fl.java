package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class fl implements defpackage.hs {
    final /* synthetic */ defpackage.fm a;
    private boolean b;

    public fl(defpackage.fm fmVar) {
        this.a = fmVar;
    }

    @Override // defpackage.hs
    public final void a(defpackage.hh hhVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        defpackage.fm fmVar = this.a;
        fmVar.c.c();
        fmVar.a.onPanelClosed(108, hhVar);
        this.b = false;
    }

    @Override // defpackage.hs
    public final boolean b(defpackage.hh hhVar) {
        this.a.a.onMenuOpened(108, hhVar);
        return true;
    }
}

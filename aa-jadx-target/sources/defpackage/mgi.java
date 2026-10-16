package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mgi implements android.view.View.OnClickListener {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mgi(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.b;
        if (i == 0) {
            defpackage.mgm mgmVar = (defpackage.mgm) this.a;
            defpackage.mhm mhmVar = mgmVar.b;
            if (mhmVar == null) {
                ((defpackage.mfx) defpackage.luq.b().a()).b.a(defpackage.mgt.d);
                return;
            } else {
                mgmVar.e(mhmVar.b(), false);
                return;
            }
        }
        if (i != 1) {
            if (i != 2) {
                ((com.google.android.projection.gearhead.companion.AndroidAutoActivity) this.a).startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(acmt.e())));
                return;
            } else {
                ((com.google.android.projection.gearhead.companion.AndroidAutoActivity) this.a).startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(acmt.c())));
                return;
            }
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.mgm.a.f()).ai((char) 4883)).u("exit button clicked");
        defpackage.mgm mgmVar2 = (defpackage.mgm) this.a;
        defpackage.mhm mhmVar2 = mgmVar2.b;
        if (mhmVar2 != null && mhmVar2.a() != 2) {
            mgmVar2.e(new mgq(), true);
            return;
        }
        defpackage.mft mftVarA = defpackage.luq.b().a();
        ((defpackage.mfx) mftVarA).b.a(defpackage.mgt.d);
    }
}

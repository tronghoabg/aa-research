package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wzy implements android.view.View.OnClickListener {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ android.view.View b;
    final /* synthetic */ defpackage.wzz c;

    public wzy(defpackage.wzz wzzVar, android.view.View view, android.view.View view2) {
        this.a = view;
        this.b = view2;
        this.c = wzzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.wqn.o(this.a, 8);
        defpackage.wqn.o(this.b, 0);
        this.c.s.a.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(acmt.d())).putExtra("force_fullscreen", true).putExtra("finish_on_ended", true));
    }
}

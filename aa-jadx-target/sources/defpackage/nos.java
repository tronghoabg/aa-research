package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class nos extends android.widget.FrameLayout {
    final /* synthetic */ defpackage.nou a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nos(defpackage.nou nouVar, android.content.Context context) {
        super(context);
        this.a = nouVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        defpackage.nou nouVar = this.a;
        if (nouVar.e) {
            ((defpackage.yqj) defpackage.nou.a.l().ai(5304)).y("dispatchConfigurationChanged(): %s dropped as Fragment was already finished", nouVar.h);
        } else {
            ((defpackage.yqj) defpackage.nou.a.l().ai(5303)).y("dispatchConfigurationChanged(): %s", nouVar.h);
            ((defpackage.bg) nouVar.j.a).e.t(configuration, true);
        }
    }
}

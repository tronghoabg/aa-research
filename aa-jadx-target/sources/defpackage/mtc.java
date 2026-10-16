package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mtc extends defpackage.mso {
    private final defpackage.afar b = defpackage.afga.cA(new defpackage.hgb((defpackage.esi) defpackage.esg.a, (android.support.v4.app.Fragment) this, 5));
    public final defpackage.xzg a = new defpackage.xzg((defpackage.xzo) defpackage.ojm.a().b);

    public final defpackage.muf b() {
        return (defpackage.muf) this.b.a();
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        printWriter.getClass();
        android.view.View view = getView();
        view.getClass();
        ((defpackage.kmm) view).h(printWriter);
    }

    @Override // android.support.v4.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        layoutInflater.getClass();
        b().a(!a());
        defpackage.kmm kmmVar = new defpackage.kmm(requireContext());
        kmmVar.j();
        kmmVar.a(new defpackage.ccz(-1241725037, true, new defpackage.mjl(this, 5)));
        return kmmVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        view.getClass();
        view.post(new defpackage.mta(this, 0));
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class kmn extends android.support.v4.app.Fragment {
    public abstract void a(defpackage.bve bveVar, int i);

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        configuration.getClass();
        if (!defpackage.acqe.a.fF().x()) {
            super.onConfigurationChanged(configuration);
            android.view.View view = getView();
            if (view != null) {
                view.dispatchConfigurationChanged(configuration);
                return;
            }
            return;
        }
        if ((configuration.uiMode & 15) == 3) {
            super.onConfigurationChanged(configuration);
            android.view.View view2 = getView();
            if (view2 != null) {
                view2.dispatchConfigurationChanged(configuration);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        layoutInflater.getClass();
        defpackage.kmm kmmVar = new defpackage.kmm(requireContext());
        kmmVar.j();
        kmmVar.a(new defpackage.ccz(699830172, true, new defpackage.cvi(this, 11)));
        return kmmVar;
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class at extends defpackage.az {
    final /* synthetic */ android.support.v4.app.Fragment a;

    public at(android.support.v4.app.Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.az
    public final void a() {
        android.support.v4.app.Fragment fragment = this.a;
        fragment.mSavedStateRegistryController.a();
        defpackage.erm.b(fragment);
        android.os.Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}

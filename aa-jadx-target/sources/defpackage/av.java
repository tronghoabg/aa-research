package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class av extends defpackage.be {
    final /* synthetic */ android.support.v4.app.Fragment a;

    public av(android.support.v4.app.Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.be
    public final android.view.View a(int i) {
        android.support.v4.app.Fragment fragment = this.a;
        android.view.View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(fragment, "Fragment ", " does not have a view"));
    }

    @Override // defpackage.be
    public final boolean b() {
        return this.a.mView != null;
    }
}

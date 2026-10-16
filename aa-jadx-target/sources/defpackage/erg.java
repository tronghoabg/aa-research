package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class erg extends android.app.Fragment {
    public static final /* synthetic */ int b = 0;
    public ajnd a;

    private final void a(defpackage.epw epwVar) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            android.app.Activity activity = getActivity();
            activity.getClass();
            defpackage.ere.a(activity, epwVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        a(defpackage.epw.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(defpackage.epw.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(defpackage.epw.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ajnd ajndVar = this.a;
        if (ajndVar != null) {
            ((eqz) ajndVar.a).a();
        }
        a(defpackage.epw.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ajnd ajndVar = this.a;
        if (ajndVar != null) {
            ((eqz) ajndVar.a).b();
        }
        a(defpackage.epw.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(defpackage.epw.ON_STOP);
    }
}

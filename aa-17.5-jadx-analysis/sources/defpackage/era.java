package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class era extends Fragment {
    public static final /* synthetic */ int b = 0;
    public ajmd a;

    private final void a(epr eprVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            epq.c(activity, eprVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(epr.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(epr.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(epr.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ajmd ajmdVar = this.a;
        if (ajmdVar != null) {
            ((eqt) ajmdVar.a).a();
        }
        a(epr.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ajmd ajmdVar = this.a;
        if (ajmdVar != null) {
            ((eqt) ajmdVar.a).b();
        }
        a(epr.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(epr.ON_STOP);
    }
}

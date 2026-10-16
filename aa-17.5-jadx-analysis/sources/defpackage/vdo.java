package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.libraries.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
public final class vdo implements sqk {
    private final ViewGroup a;
    private final viw b;
    private View c;

    public vdo(ViewGroup viewGroup, viw viwVar) {
        this.b = viwVar;
        spu.aw(viewGroup);
        this.a = viewGroup;
    }

    public final void a(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        try {
            this.b.c(new vdn(onStreetViewPanoramaReadyCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vja.d(bundle, bundle2);
            viw viwVar = this.b;
            viwVar.d(bundle2);
            vja.d(bundle2, bundle);
            this.c = (View) sqi.a(viwVar.a());
            ViewGroup viewGroup = this.a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.c);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // defpackage.sqk
    public final void onDestroy() {
        try {
            this.b.f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onDestroyView() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // defpackage.sqk
    public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // defpackage.sqk
    public final void onPause() {
        try {
            this.b.g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onResume() {
        try {
            this.b.h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vja.d(bundle, bundle2);
            this.b.i(bundle2);
            vja.d(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onStart() {
        try {
            this.b.j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onStop() {
        try {
            this.b.k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onLowMemory() {
    }
}

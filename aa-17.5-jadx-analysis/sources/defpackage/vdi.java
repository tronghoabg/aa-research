package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.OnMapReadyCallback;
import com.google.android.libraries.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
public final class vdi implements sqk {
    public final veq a;
    private final ViewGroup b;
    private View c;

    public vdi(ViewGroup viewGroup, veq veqVar) {
        this.a = veqVar;
        spu.aw(viewGroup);
        this.b = viewGroup;
    }

    public final void a(OnMapReadyCallback onMapReadyCallback) {
        try {
            this.a.c(new vdh(onMapReadyCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vja.d(bundle, bundle2);
            veq veqVar = this.a;
            veqVar.d(bundle2);
            vja.d(bundle2, bundle);
            this.c = (View) sqi.a(veqVar.a());
            ViewGroup viewGroup = this.b;
            viewGroup.removeAllViews();
            viewGroup.addView(this.c);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    @Override // defpackage.sqk
    public final void onDestroy() {
        try {
            this.a.f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onDestroyView() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    @Override // defpackage.sqk
    public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    @Override // defpackage.sqk
    public final void onLowMemory() {
        try {
            this.a.i();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onPause() {
        try {
            this.a.j();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onResume() {
        try {
            this.a.k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vja.d(bundle, bundle2);
            this.a.l(bundle2);
            vja.d(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onStart() {
        try {
            this.a.m();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onStop() {
        try {
            this.a.n();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

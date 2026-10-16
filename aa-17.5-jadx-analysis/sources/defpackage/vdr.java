package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.GoogleMapOptions;
import com.google.android.libraries.maps.OnMapReadyCallback;
import com.google.android.libraries.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
public final class vdr implements sqk {
    public final veo a;
    private final Fragment b;

    public vdr(Fragment fragment, veo veoVar) {
        this.a = veoVar;
        spu.aw(fragment);
        this.b = fragment;
    }

    public final void a(OnMapReadyCallback onMapReadyCallback) {
        try {
            this.a.c(new vdq(onMapReadyCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vja.d(bundle, bundle2);
            Bundle arguments = this.b.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                vja.e(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.a.f(bundle2);
            vja.d(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vja.d(bundle, bundle2);
            veo veoVar = this.a;
            sqi sqiVar = new sqi(layoutInflater);
            new sqi(viewGroup);
            sqj sqjVarR = veoVar.r(sqiVar, bundle2);
            vja.d(bundle2, bundle);
            return (View) sqi.a(sqjVarR);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onDestroy() {
        try {
            this.a.g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onDestroyView() {
        try {
            this.a.h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            vja.d(bundle2, bundle3);
            veo veoVar = this.a;
            new sqi(activity);
            veoVar.s(googleMapOptions);
            vja.d(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onLowMemory() {
        try {
            this.a.k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onPause() {
        try {
            this.a.l();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onResume() {
        try {
            this.a.m();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vja.d(bundle, bundle2);
            this.a.n(bundle2);
            vja.d(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onStart() {
        try {
            this.a.o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.sqk
    public final void onStop() {
        try {
            this.a.p();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}

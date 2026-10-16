package com.google.android.libraries.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.spu;
import defpackage.sqi;
import defpackage.sqj;
import defpackage.sqk;
import defpackage.vdt;
import defpackage.vdu;
import defpackage.viu;
import defpackage.vja;

/* loaded from: classes3.dex */
public class SupportStreetViewPanoramaFragment extends Fragment {
    public static final String ARG_OPTIONS = "StreetViewPanoramaOptions";
    private final vdu a = new vdu(this);

    public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        supportStreetViewPanoramaFragment.setArguments(bundle);
        return supportStreetViewPanoramaFragment;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        spu.ap("getStreetViewPanoramaAsync() must be called on the main thread");
        vdu vduVar = this.a;
        sqk sqkVar = vduVar.a;
        if (sqkVar != null) {
            ((StreetViewPanoramaFragmentDelegate) sqkVar).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            vduVar.d.add(onStreetViewPanoramaReadyCallback);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onActivityCreated */
    public void m105lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.m105lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a.o(activity);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.a.b(bundle);
    }

    @Override // android.support.v4.app.Fragment
    @ResultIgnorabilityUnspecified
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        this.a.c();
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        this.a.d();
        super.onDestroyView();
    }

    @Override // android.support.v4.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            vdu vduVar = this.a;
            vduVar.o(activity);
            vduVar.e(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.a.f();
        super.onLowMemory();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        this.a.g();
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.h();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public void m117x22bc4f96(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        this.a.i(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.j();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        this.a.k();
        super.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class StreetViewPanoramaFragmentDelegate implements sqk {
        private final Fragment a;
        private final viu b;

        public StreetViewPanoramaFragmentDelegate(Fragment fragment, viu viuVar) {
            spu.aw(viuVar);
            this.b = viuVar;
            spu.aw(fragment);
            this.a = fragment;
        }

        public viu getRemoteDelegate() {
            return this.b;
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.b.b(new vdt(onStreetViewPanoramaReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public void onCreate(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                vja.d(bundle, bundle2);
                Bundle arguments = this.a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    vja.e(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.b.c(bundle2);
                vja.d(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                vja.d(bundle, bundle2);
                viu viuVar = this.b;
                sqi sqiVar = new sqi(layoutInflater);
                new sqi(viewGroup);
                sqj sqjVarM = viuVar.m(sqiVar, bundle2);
                vja.d(bundle2, bundle);
                return (View) sqi.a(sqjVarM);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public void onDestroy() {
            try {
                this.b.d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public void onDestroyView() {
            try {
                this.b.f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                vja.d(bundle2, bundle3);
                viu viuVar = this.b;
                new sqi(activity);
                viuVar.n(null);
                vja.d(bundle3, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public void onPause() {
            try {
                this.b.g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public void onResume() {
            try {
                this.b.h();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public void onSaveInstanceState(Bundle bundle) {
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
        public void onStart() {
            try {
                this.b.j();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public void onStop() {
            try {
                this.b.k();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // defpackage.sqk
        public void onLowMemory() {
        }
    }

    public static SupportStreetViewPanoramaFragment newInstance() {
        return new SupportStreetViewPanoramaFragment();
    }
}

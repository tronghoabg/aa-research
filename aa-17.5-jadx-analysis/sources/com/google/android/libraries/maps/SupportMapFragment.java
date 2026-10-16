package com.google.android.libraries.maps;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import defpackage.spu;
import defpackage.sqk;
import defpackage.vdr;
import defpackage.vds;
import defpackage.vja;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class SupportMapFragment extends Fragment {
    public static final String ARG_OPTIONS = "MapOptions";
    private final vds a = new vds(this);

    public static SupportMapFragment newInstance(GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strB;
        spu.ap("dump must be called on the main thread.");
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.println(str + getClass().getName() + ":");
        String strConcat = String.valueOf(str).concat("  ");
        sqk sqkVar = this.a.a;
        if (sqkVar != null) {
            try {
                strB = ((vdr) sqkVar).a.b(strConcat);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            strB = "delegate is null";
        }
        printWriter.println(strB);
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        spu.ap("getMapAsync must be called on the main thread.");
        vds vdsVar = this.a;
        sqk sqkVar = vdsVar.a;
        if (sqkVar != null) {
            ((vdr) sqkVar).a(onMapReadyCallback);
        } else {
            vdsVar.d.add(onMapReadyCallback);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onActivityCreated */
    public void m105lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.m105lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a.o(activity);
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sqk sqkVar = this.a.a;
        if (sqkVar != null) {
            try {
                ((vdr) sqkVar).a.d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.a.b(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewA = this.a.a(layoutInflater, viewGroup, bundle);
        viewA.setClickable(true);
        return viewA;
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

    public final void onEnterAmbient(Bundle bundle) {
        spu.ap("onEnterAmbient must be called on the main thread.");
        sqk sqkVar = this.a.a;
        if (sqkVar != null) {
            vdr vdrVar = (vdr) sqkVar;
            try {
                Bundle bundle2 = new Bundle();
                vja.d(bundle, bundle2);
                vdrVar.a.i(bundle2);
                vja.d(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public final void onExitAmbient() {
        spu.ap("onExitAmbient must be called on the main thread.");
        sqk sqkVar = this.a.a;
        if (sqkVar != null) {
            try {
                ((vdr) sqkVar).a.j();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            vds vdsVar = this.a;
            vdsVar.o(activity);
            GoogleMapOptions googleMapOptionsCreateFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsCreateFromAttributes);
            vdsVar.e(activity, bundle2, bundle);
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
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
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

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }
}

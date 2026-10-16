package com.google.android.libraries.maps;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import defpackage.spu;
import defpackage.sqk;
import defpackage.vdf;
import defpackage.vdg;
import defpackage.vja;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class MapFragment extends Fragment {
    public static final String ARG_OPTIONS = "MapOptions";
    private final vdg a = new vdg(this);

    public static MapFragment newInstance(GoogleMapOptions googleMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    @Override // android.app.Fragment
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strB;
        spu.ap("dump must be called on the main thread.");
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.println(str + getClass().getName() + ":");
        String strConcat = String.valueOf(str).concat("  ");
        sqk sqkVar = this.a.a;
        if (sqkVar != null) {
            try {
                strB = ((vdf) sqkVar).a.b(strConcat);
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
        vdg vdgVar = this.a;
        sqk sqkVar = vdgVar.a;
        if (sqkVar != null) {
            ((vdf) sqkVar).a(onMapReadyCallback);
        } else {
            vdgVar.d.add(onMapReadyCallback);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a.o(activity);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sqk sqkVar = this.a.a;
        if (sqkVar != null) {
            try {
                ((vdf) sqkVar).a.d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewA = this.a.a(layoutInflater, viewGroup, bundle);
        viewA.setClickable(true);
        return viewA;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.a.c();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.a.d();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        spu.ap("onEnterAmbient must be called on the main thread.");
        sqk sqkVar = this.a.a;
        if (sqkVar != null) {
            vdf vdfVar = (vdf) sqkVar;
            try {
                Bundle bundle2 = new Bundle();
                vja.d(bundle, bundle2);
                vdfVar.a.i(bundle2);
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
                ((vdf) sqkVar).a.j();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            vdg vdgVar = this.a;
            vdgVar.o(activity);
            GoogleMapOptions googleMapOptionsCreateFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsCreateFromAttributes);
            vdgVar.e(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.a.f();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.a.g();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.h();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.a.i(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.j();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.a.k();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public static MapFragment newInstance() {
        return new MapFragment();
    }
}

package com.google.android.libraries.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import defpackage.spu;
import defpackage.sqg;
import defpackage.sqk;
import defpackage.vdi;
import defpackage.vdj;
import defpackage.vja;

/* loaded from: classes3.dex */
public class MapView extends FrameLayout {
    private final vdj a;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new vdj(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        spu.ap("getMapAsync() must be called on the main thread");
        vdj vdjVar = this.a;
        sqk sqkVar = vdjVar.a;
        if (sqkVar != null) {
            ((vdi) sqkVar).a(onMapReadyCallback);
        } else {
            vdjVar.d.add(onMapReadyCallback);
        }
    }

    public final void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            vdj vdjVar = this.a;
            vdjVar.b(bundle);
            if (vdjVar.a == null) {
                sqg.l(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void onDestroy() {
        this.a.c();
    }

    public final void onEnterAmbient(Bundle bundle) {
        spu.ap("onEnterAmbient() must be called on the main thread");
        sqk sqkVar = this.a.a;
        if (sqkVar != null) {
            vdi vdiVar = (vdi) sqkVar;
            try {
                Bundle bundle2 = new Bundle();
                vja.d(bundle, bundle2);
                vdiVar.a.g(bundle2);
                vja.d(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public final void onExitAmbient() {
        spu.ap("onExitAmbient() must be called on the main thread");
        sqk sqkVar = this.a.a;
        if (sqkVar != null) {
            try {
                ((vdi) sqkVar).a.h();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public final void onLowMemory() {
        this.a.f();
    }

    public final void onPause() {
        this.a.g();
    }

    public final void onResume() {
        this.a.h();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.a.i(bundle);
    }

    public final void onStart() {
        this.a.j();
    }

    public final void onStop() {
        this.a.k();
    }

    public MapView(Context context) {
        super(context);
        this.a = new vdj(this, context, null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new vdj(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.a = new vdj(this, context, googleMapOptions);
        setClickable(true);
    }
}

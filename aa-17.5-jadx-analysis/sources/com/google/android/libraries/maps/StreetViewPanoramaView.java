package com.google.android.libraries.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.spu;
import defpackage.sqg;
import defpackage.sqk;
import defpackage.vdo;
import defpackage.vdp;

/* loaded from: classes3.dex */
public class StreetViewPanoramaView extends FrameLayout {
    private final vdp a;

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.a = new vdp(this, context, null);
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        spu.ap("getStreetViewPanoramaAsync() must be called on the main thread");
        vdp vdpVar = this.a;
        sqk sqkVar = vdpVar.a;
        if (sqkVar != null) {
            ((vdo) sqkVar).a(onStreetViewPanoramaReadyCallback);
        } else {
            vdpVar.d.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            vdp vdpVar = this.a;
            vdpVar.b(bundle);
            if (vdpVar.a == null) {
                sqg.l(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.a.c();
    }

    public final void onLowMemory() {
        this.a.f();
    }

    public final void onPause() {
        this.a.g();
    }

    public void onResume() {
        this.a.h();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.a.i(bundle);
    }

    public void onStart() {
        this.a.j();
    }

    public void onStop() {
        this.a.k();
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new vdp(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new vdp(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.a = new vdp(this, context, streetViewPanoramaOptions);
    }
}

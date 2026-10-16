package com.google.android.apps.auto.components.carlocalmedia;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.acrz;
import defpackage.eb;
import defpackage.etf;
import defpackage.etp;
import defpackage.ett;
import defpackage.kio;
import defpackage.kly;
import defpackage.klz;
import defpackage.mkn;
import defpackage.qrz;
import defpackage.rcu;
import defpackage.rhj;
import defpackage.rox;
import defpackage.skn;
import defpackage.yfq;
import defpackage.ygr;
import defpackage.yls;
import defpackage.ymp;
import defpackage.ype;
import defpackage.yph;
import j$.util.Objects;

/* loaded from: classes.dex */
public class CarLocalMediaBrowserService extends ett {
    public static final yph g = yph.c("GH.CarLocalMedia");
    private static final ygr l = new ymp(RemoteApiConstants.NOW_PACKAGE);
    public kly h;
    public rhj i;
    public MediaSessionCompat j;
    private skn n;
    private final klz m = new klz(this);
    public boolean k = false;

    @Override // defpackage.ett
    public final etf a(String str, int i, Bundle bundle) {
        ((ype) ((ype) g.f()).ai((char) 3220)).y("getRoot for %s", str);
        if (Objects.equals(str, "com.google.android.projection.gearhead") || (this.n != null && l.contains(str) && this.n.b(str))) {
            return new etf("Aap.CarLocalMedia.Root", null);
        }
        return null;
    }

    @Override // defpackage.ett
    public final void c(String str, etp etpVar) {
        yfq yfqVar;
        if (Objects.equals(str, "Aap.CarLocalMedia.Root")) {
            int i = yfq.d;
            yfqVar = yls.a;
        } else {
            yfqVar = null;
        }
        etpVar.b(yfqVar);
    }

    public final void i() {
        ((ype) g.l().ai((char) 3213)).u("Car got disconnected");
        rhj rhjVar = this.i;
        if (rhjVar != null) {
            rhjVar.a();
        }
        MediaSessionCompat mediaSessionCompat = this.j;
        mediaSessionCompat.getClass();
        eb ebVar = new eb();
        ebVar.d(0, -1L, BitmapDescriptorFactory.HUE_RED);
        mediaSessionCompat.i(ebVar.a());
        k(false);
        this.k = false;
    }

    public final void j(int i) {
        rhj rhjVar = this.i;
        if (rhjVar == null) {
            return;
        }
        try {
            CarLocalMediaPlaybackRequest carLocalMediaPlaybackRequest = new CarLocalMediaPlaybackRequest(i);
            ((rox) rhjVar.a).g(new rcu(rhjVar, carLocalMediaPlaybackRequest, 9, null));
        } catch (qrz e) {
            ((ype) ((ype) ((ype) g.h()).p(e)).ai((char) 3221)).u("Could not send playback request");
        }
    }

    public final void k(boolean z) {
        MediaSessionCompat mediaSessionCompat = this.j;
        if (mediaSessionCompat == null || mediaSessionCompat.b.a.isActive() == z) {
            return;
        }
        this.j.e(z);
    }

    @Override // defpackage.ett, android.app.Service
    public final IBinder onBind(Intent intent) {
        if (acrz.f()) {
            return super.onBind(intent);
        }
        return null;
    }

    @Override // defpackage.ett, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (!acrz.k() || !acrz.f()) {
            ((ype) ((ype) g.h()).ai((char) 3218)).u("Car Local Media not enabled, stopping");
            stopSelf();
            return;
        }
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, "Media.Projected.CarLocalMedia");
        Bundle bundle = new Bundle();
        bundle.putString("android.media.session.BROWSE_SERVICE", mkn.F.getClassName());
        mediaSessionCompat.g(bundle);
        mediaSessionCompat.f(this.m, null);
        d(mediaSessionCompat.b());
        this.j = mediaSessionCompat;
        this.n = skn.a(this);
        kly klyVar = new kly(this);
        this.h = klyVar;
        kio.b().v(klyVar);
    }

    @Override // defpackage.ett, android.app.Service
    public final void onDestroy() {
        i();
        MediaSessionCompat mediaSessionCompat = this.j;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.d();
            this.j = null;
        }
        if (this.h != null) {
            kio kioVarB = kio.b();
            kly klyVar = this.h;
            klyVar.getClass();
            kioVarB.w(klyVar);
            this.h = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}

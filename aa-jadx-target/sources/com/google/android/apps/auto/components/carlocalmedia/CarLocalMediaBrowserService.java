package com.google.android.apps.auto.components.carlocalmedia;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarLocalMediaBrowserService extends defpackage.etz {
    public static final defpackage.yqm g = defpackage.yqm.c("GH.CarLocalMedia");
    private static final defpackage.yhx l = new defpackage.ynu("com.google.android.googlequicksearchbox");
    public kmf h;
    public rif i;
    public android.support.v4.media.session.MediaSessionCompat j;
    private defpackage.slj n;
    private final kmg m = new kmg(this);
    public boolean k = false;

    @Override // defpackage.etz
    public final defpackage.etl a(java.lang.String str, int i, android.os.Bundle bundle) {
        ((defpackage.yqj) ((defpackage.yqj) g.f()).ai((char) 3223)).y("getRoot for %s", str);
        if (j$.util.Objects.equals(str, "com.google.android.projection.gearhead") || (this.n != null && l.contains(str) && this.n.b(str))) {
            return new defpackage.etl("Aap.CarLocalMedia.Root", null);
        }
        return null;
    }

    @Override // defpackage.etz
    public final void c(java.lang.String str, etv etvVar) {
        defpackage.ygw ygwVar;
        if (j$.util.Objects.equals(str, "Aap.CarLocalMedia.Root")) {
            int i = defpackage.ygw.d;
            ygwVar = defpackage.ymx.a;
        } else {
            ygwVar = null;
        }
        etvVar.b(ygwVar);
    }

    public final void i() {
        ((defpackage.yqj) g.l().ai((char) 3217)).u("Car got disconnected");
        rif rifVar = this.i;
        if (rifVar != null) {
            rifVar.a();
        }
        android.support.v4.media.session.MediaSessionCompat mediaSessionCompat = this.j;
        mediaSessionCompat.getClass();
        defpackage.eb ebVar = new defpackage.eb();
        ebVar.d(0, -1L, 0.0f);
        mediaSessionCompat.i(ebVar.a());
        k(false);
        this.k = false;
    }

    public final void j(int i) {
        rif rifVar = this.i;
        if (rifVar == null) {
            return;
        }
        try {
            com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest carLocalMediaPlaybackRequest = new com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest(i);
            ((defpackage.rps) rifVar.a).g(new defpackage.rdp(rifVar, carLocalMediaPlaybackRequest, 9, null));
        } catch (defpackage.qst e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) g.h()).p(e)).ai((char) 3224)).u("Could not send playback request");
        }
    }

    public final void k(boolean z) {
        android.support.v4.media.session.MediaSessionCompat mediaSessionCompat = this.j;
        if (mediaSessionCompat == null || mediaSessionCompat.b.a.isActive() == z) {
            return;
        }
        this.j.e(z);
    }

    @Override // defpackage.etz, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (!defpackage.actb.j()) {
            ((defpackage.yqj) ((defpackage.yqj) g.h()).ai((char) 3221)).u("Car Local Media not enabled, stopping");
            stopSelf();
            return;
        }
        android.support.v4.media.session.MediaSessionCompat mediaSessionCompat = new android.support.v4.media.session.MediaSessionCompat(this, "Media.Projected.CarLocalMedia");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("android.media.session.BROWSE_SERVICE", defpackage.mkt.F.getClassName());
        mediaSessionCompat.g(bundle);
        mediaSessionCompat.f(this.m, null);
        d(mediaSessionCompat.b());
        this.j = mediaSessionCompat;
        this.n = defpackage.slj.a(this);
        defpackage.kfp kmfVar = new kmf(this);
        this.h = kmfVar;
        defpackage.kit.b().v(kmfVar);
    }

    @Override // defpackage.etz, android.app.Service
    public final void onDestroy() {
        i();
        android.support.v4.media.session.MediaSessionCompat mediaSessionCompat = this.j;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.d();
            this.j = null;
        }
        if (this.h != null) {
            defpackage.kit kitVarB = defpackage.kit.b();
            kmf kmfVar = this.h;
            kmfVar.getClass();
            kitVarB.w(kmfVar);
            this.h = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        return 1;
    }
}

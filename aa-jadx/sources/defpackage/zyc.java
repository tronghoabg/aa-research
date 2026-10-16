package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zyc extends defpackage.vhc implements android.view.View.OnClickListener {
    public final defpackage.zsx a;
    public final defpackage.vfj b;
    protected final defpackage.zyd c;
    public android.location.Location d;
    public defpackage.vfj e;
    public boolean f;
    public boolean g;
    public defpackage.vie h;
    public defpackage.vib i;
    public final defpackage.gka j;
    private final defpackage.zuw k;
    private final defpackage.zzw l;
    private defpackage.vih m;
    private final defpackage.xzi n;
    private final defpackage.xh o;

    public zyc(defpackage.gka gkaVar, defpackage.zuw zuwVar, defpackage.xh xhVar, defpackage.zyd zydVar, defpackage.vfj vfjVar, defpackage.zzw zzwVar, defpackage.xzi xziVar) {
        defpackage.zsx zsxVar = defpackage.zsx.a;
        defpackage.zlv.n(gkaVar, "ContextManager");
        this.j = gkaVar;
        defpackage.zlv.n(zuwVar, "CameraManager");
        this.k = zuwVar;
        this.o = xhVar;
        defpackage.zlv.n(zydVar, "MyLocationRenderer");
        this.c = zydVar;
        this.b = vfjVar;
        this.e = vfjVar;
        this.l = zzwVar;
        this.g = true;
        defpackage.zlv.n(xziVar, "DRD");
        this.n = xziVar;
        defpackage.zlv.n(zsxVar, "UiThreadChecker");
        this.a = zsxVar;
        this.m = null;
    }

    private final float h(com.google.android.libraries.maps.model.LatLng latLng, float f) {
        defpackage.zuw zuwVar = this.k;
        float f2 = zuwVar.c().zoom;
        if (f2 <= 10.0f) {
            f2 = 15.0f;
        }
        double d = f;
        double d2 = d + d;
        float f3 = zuwVar.d(defpackage.zlv.B(latLng, 0.5d, 0.5d, java.lang.Math.toDegrees(d2 / 6371009.0d), defpackage.zlv.w(latLng, d2))).zoom;
        return f3 == -1.0f ? f2 : java.lang.Math.min(f2, f3);
    }

    public final void a() {
        this.a.a();
        if (this.f) {
            this.f = false;
            d();
            try {
                this.e.b();
                defpackage.zyd zydVar = this.c;
                zydVar.a();
                zydVar.e(null);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
            }
        }
    }

    final void b(boolean z) {
        if (this.g && this.f) {
            this.o.f(!z);
            defpackage.zyd zydVar = this.c;
            if (z) {
                zydVar.a();
            } else {
                zydVar.c();
            }
        }
    }

    public final void c(defpackage.vih vihVar) {
        this.a.a();
        this.m = vihVar;
        this.c.d(vihVar != null);
    }

    public final void d() {
        boolean z = false;
        if (this.g && this.f) {
            z = true;
        }
        defpackage.xh xhVar = this.o;
        xhVar.f(z);
        if (true != z) {
            this = null;
        }
        xhVar.e(this);
    }

    @Override // defpackage.vhd
    public final void e(defpackage.srh srhVar) {
        f((android.location.Location) defpackage.srg.a(srhVar));
    }

    @Override // defpackage.vhd
    public final void f(android.location.Location location) {
        this.c.f(location);
        if (this.h != null) {
            defpackage.zlv.m(location);
            try {
                this.h.e(new defpackage.srg(new android.location.Location(location)));
            } catch (android.os.RemoteException e) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
            }
        }
        this.d = location;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean g() {
        defpackage.vih vihVar;
        this.a.a();
        android.location.Location location = this.d;
        if (location == null || (vihVar = this.m) == null) {
            return false;
        }
        this.l.b(defpackage.aaix.MY_LOCATION_CLICK_WITH_LISTENER);
        try {
            vihVar.e(location);
            return true;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.location.Location location;
        this.l.b(defpackage.aaix.MY_LOCATION_BUTTON_CLICK);
        defpackage.vib vibVar = this.i;
        if (vibVar != null) {
            try {
                if (vibVar.e()) {
                    return;
                }
            } catch (android.os.RemoteException e) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
            }
        }
        defpackage.zlv.g(this.f, "MyLocation layer not enabled");
        android.location.Location location2 = this.d;
        if (location2 != null) {
            com.google.android.libraries.maps.model.LatLng latLng = new com.google.android.libraries.maps.model.LatLng(location2.getLatitude(), this.d.getLongitude());
            float fH = h(latLng, this.d.getAccuracy());
            defpackage.zuw zuwVar = this.k;
            com.google.android.libraries.maps.model.CameraPosition.Builder builder = com.google.android.libraries.maps.model.CameraPosition.builder(zuwVar.c());
            builder.target(latLng);
            builder.zoom(fH);
            zuwVar.h(builder.build(), -1);
        }
        if (!defpackage.zlv.F((android.content.Context) this.j.a) || (location = this.d) == null) {
            return;
        }
        com.google.android.libraries.maps.model.LatLng latLng2 = new com.google.android.libraries.maps.model.LatLng(location.getLatitude(), this.d.getLongitude());
        defpackage.zyz zyzVar = new defpackage.zyz(latLng2, h(latLng2, this.d.getAccuracy()));
        zyzVar.b = new defpackage.aage(this, view, 1);
        ((defpackage.ztx) this.n.fF()).i(zyzVar);
    }
}

package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class zxa extends vgf implements View.OnClickListener {
    public final zrt a;
    public final vem b;
    protected final zxb c;
    public Location d;
    public vem e;
    public boolean f;
    public boolean g;
    public vhh h;
    public vhe i;
    public final gjt j;
    private final ztt k;
    private final zys l;
    private vhk m;
    private final xyc n;
    private final xa o;

    public zxa(gjt gjtVar, ztt zttVar, xa xaVar, zxb zxbVar, vem vemVar, zys zysVar, xyc xycVar) {
        zrt zrtVar = zrt.a;
        zkt.n(gjtVar, "ContextManager");
        this.j = gjtVar;
        zkt.n(zttVar, "CameraManager");
        this.k = zttVar;
        this.o = xaVar;
        zkt.n(zxbVar, "MyLocationRenderer");
        this.c = zxbVar;
        this.b = vemVar;
        this.e = vemVar;
        this.l = zysVar;
        this.g = true;
        zkt.n(xycVar, "DRD");
        this.n = xycVar;
        zkt.n(zrtVar, "UiThreadChecker");
        this.a = zrtVar;
        this.m = null;
    }

    private final float h(LatLng latLng, float f) {
        ztt zttVar = this.k;
        float f2 = zttVar.c().zoom;
        if (f2 <= 10.0f) {
            f2 = 15.0f;
        }
        double d = f;
        double d2 = d + d;
        float f3 = zttVar.d(ysi.M(latLng, 0.5d, 0.5d, Math.toDegrees(d2 / 6371009.0d), ysi.H(latLng, d2))).zoom;
        return f3 == -1.0f ? f2 : Math.min(f2, f3);
    }

    public final void a() {
        this.a.a();
        if (this.f) {
            this.f = false;
            d();
            try {
                this.e.b();
                zxb zxbVar = this.c;
                zxbVar.a();
                zxbVar.e(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    final void b(boolean z) {
        if (this.g && this.f) {
            this.o.f(!z);
            zxb zxbVar = this.c;
            if (z) {
                zxbVar.a();
            } else {
                zxbVar.c();
            }
        }
    }

    public final void c(vhk vhkVar) {
        this.a.a();
        this.m = vhkVar;
        this.c.d(vhkVar != null);
    }

    public final void d() {
        boolean z = false;
        if (this.g && this.f) {
            z = true;
        }
        xa xaVar = this.o;
        xaVar.f(z);
        if (true != z) {
            this = null;
        }
        xaVar.e(this);
    }

    @Override // defpackage.vgg
    public final void e(sqj sqjVar) {
        f((Location) sqi.a(sqjVar));
    }

    @Override // defpackage.vgg
    public final void f(Location location) {
        this.c.f(location);
        if (this.h != null) {
            zkt.m(location);
            try {
                this.h.e(new sqi(new Location(location)));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.d = location;
    }

    @ResultIgnorabilityUnspecified
    public final boolean g() {
        vhk vhkVar;
        this.a.a();
        Location location = this.d;
        if (location == null || (vhkVar = this.m) == null) {
            return false;
        }
        this.l.b(aahu.MY_LOCATION_CLICK_WITH_LISTENER);
        try {
            vhkVar.e(location);
            return true;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Location location;
        this.l.b(aahu.MY_LOCATION_BUTTON_CLICK);
        vhe vheVar = this.i;
        if (vheVar != null) {
            try {
                if (vheVar.e()) {
                    return;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        zkt.g(this.f, "MyLocation layer not enabled");
        Location location2 = this.d;
        if (location2 != null) {
            LatLng latLng = new LatLng(location2.getLatitude(), this.d.getLongitude());
            float fH = h(latLng, this.d.getAccuracy());
            ztt zttVar = this.k;
            CameraPosition.Builder builder = CameraPosition.builder(zttVar.c());
            builder.target(latLng);
            builder.zoom(fH);
            zttVar.h(builder.build(), -1);
        }
        if (!ysi.Q((Context) this.j.a) || (location = this.d) == null) {
            return;
        }
        LatLng latLng2 = new LatLng(location.getLatitude(), this.d.getLongitude());
        zxw zxwVar = new zxw(latLng2, h(latLng2, this.d.getAccuracy()));
        zxwVar.b = new aafb(this, view, 1);
        ((zst) this.n.gu()).i(zxwVar);
    }
}

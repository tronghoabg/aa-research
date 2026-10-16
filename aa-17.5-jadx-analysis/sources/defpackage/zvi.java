package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.GroundOverlayOptions;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zvi extends IGroundOverlayDelegate.Stub implements zxc {
    private static final GroundOverlayOptions d = new GroundOverlayOptions();
    private static final sqj e = new sqi(null);
    private static final AtomicInteger f = new AtomicInteger(0);
    public final zxd a;
    public zvh b;
    public final zrt c;
    private final String g;
    private final zys h;
    private LatLngBounds i;
    private float j;
    private float k;
    private LatLng l;
    private float m;
    private int n;
    private int o;
    private ztq p;
    private float q;
    private final float r;
    private final float s;
    private float t;
    private boolean u;
    private boolean v;
    private boolean w;
    private sqj x;
    private final aacq y;

    public zvi(GroundOverlayOptions groundOverlayOptions, zxd zxdVar, aacq aacqVar, zys zysVar, zrt zrtVar) {
        zkt.m(zxdVar);
        this.a = zxdVar;
        zkt.m(zysVar);
        this.h = zysVar;
        boolean z = true;
        this.g = String.format(Locale.getDefault(), "go%d", Integer.valueOf(f.getAndIncrement()));
        this.y = aacqVar;
        this.c = zrtVar;
        this.x = e;
        zkt.e(groundOverlayOptions.getWidth() >= BitmapDescriptorFactory.HUE_RED, "line width is negative");
        zkt.e(groundOverlayOptions.getImage() != null, "Options doesn't specify an image");
        this.r = groundOverlayOptions.getAnchorU();
        this.s = groundOverlayOptions.getAnchorV();
        this.u = groundOverlayOptions.isVisible();
        this.t = groundOverlayOptions.getZIndex();
        this.q = groundOverlayOptions.getTransparency();
        this.v = groundOverlayOptions.isClickable();
        ztq ztqVar = (ztq) sqi.a(groundOverlayOptions.getImage().getRemoteObject());
        this.p = ztqVar;
        aacqVar.i(ztqVar);
        Bitmap bitmapH = aacqVar.h(this.p);
        this.n = bitmapH.getHeight();
        this.o = bitmapH.getWidth();
        if (groundOverlayOptions.getLocation() == null && groundOverlayOptions.getBounds() == null) {
            z = false;
        }
        zkt.e(z, "Options doesn't specify a position");
        if (groundOverlayOptions.getBounds() != null) {
            this.i = groundOverlayOptions.getBounds();
            l();
        } else {
            this.l = groundOverlayOptions.getLocation();
            this.j = groundOverlayOptions.getWidth();
            this.k = groundOverlayOptions.getHeight() != -1.0f ? groundOverlayOptions.getHeight() : (this.n / this.o) * this.j;
            m();
        }
        this.m = groundOverlayOptions.getBearing();
        float bearing = groundOverlayOptions.getBearing();
        GroundOverlayOptions groundOverlayOptions2 = d;
        if (bearing != groundOverlayOptions2.getBearing()) {
            zysVar.b(aahu.GROUND_OVERLAY_BEARING);
        }
        if (groundOverlayOptions.getTransparency() != groundOverlayOptions2.getTransparency()) {
            zysVar.b(aahu.GROUND_OVERLAY_TRANSPARENCY);
        }
        if (groundOverlayOptions.isVisible() != groundOverlayOptions2.isVisible()) {
            zysVar.b(aahu.GROUND_OVERLAY_VISIBILITY);
        }
        if (groundOverlayOptions.getZIndex() != groundOverlayOptions2.getZIndex()) {
            zysVar.b(aahu.GROUND_OVERLAY_Z_INDEX);
        }
        if (groundOverlayOptions.isClickable() != groundOverlayOptions2.isClickable()) {
            zysVar.b(aahu.GROUND_OVERLAY_CLICKABILITY);
        }
    }

    private final synchronized float i(LatLngBounds latLngBounds) {
        return (float) (Math.toRadians(latLngBounds.northeast.latitude - latLngBounds.southwest.latitude) * 6371009.0d);
    }

    private final synchronized float k(LatLngBounds latLngBounds) {
        LatLng latLng;
        double dI;
        latLng = this.l;
        dI = ysi.I(latLngBounds.northeast.longitude, latLngBounds.southwest.longitude);
        return (float) (Math.toRadians(dI) * 6371009.0d * Math.cos(Math.toRadians(latLng.latitude)));
    }

    private final synchronized void l() {
        LatLngBounds latLngBounds = this.i;
        LatLng latLng = latLngBounds.northeast;
        double d2 = latLng.latitude;
        LatLng latLng2 = latLngBounds.southwest;
        double d3 = latLng2.latitude;
        double d4 = latLng.longitude;
        double d5 = latLng2.longitude;
        if (d4 < d5) {
            d4 += 360.0d;
        }
        float f2 = this.r;
        this.l = new LatLng(((1.0f - r9) * d2) + (this.s * d3), ((1.0f - f2) * d5) + (f2 * d4));
        this.j = k(this.i);
        this.k = i(this.i);
    }

    private final synchronized void m() {
        this.i = ysi.M(this.l, this.r, this.s, Math.toDegrees(this.k / 6371009.0d), ysi.H(this.l, this.j));
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, tpr] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, tpr] */
    private final void n(int i) {
        synchronized (this) {
            if (this.w) {
                return;
            }
            zvh zvhVar = this.b;
            if (zvhVar != null) {
                aabh aabhVar = (aabh) zvhVar;
                aabhVar.e.a();
                boolean z = aabhVar.h;
                zkt.h(z, "isInitialized=%s", Boolean.valueOf(z));
                if (aabhVar.i) {
                    return;
                }
                switch (i) {
                    case 0:
                    case 1:
                    case 4:
                        aabhVar.e();
                        aabhVar.g.b((abax) aabhVar.k.q(), aabh.a, aabhVar.d(), aabhVar.c(), null);
                        return;
                    case 2:
                    case 3:
                        abnr abnrVar = aabhVar.k;
                        int i2 = ((abax) abnrVar.b).i;
                        aacl aaclVar = aabhVar.d;
                        twq twqVar = aabhVar.j;
                        zvi zviVar = aabhVar.c;
                        int iB = aaclVar.b(twqVar, zviVar.d(), zviVar.c());
                        abnrVar.t();
                        abax abaxVar = (abax) abnrVar.b;
                        abaxVar.b |= 128;
                        abaxVar.i = iB;
                        aabf aabfVar = aabhVar.g;
                        ((zrt) aabfVar.a).a();
                        ?? r10 = aabfVar.b;
                        if (r10 != 0) {
                            r10.b(((typ) ((twq) aabfVar.c).b).g.b(iB));
                        }
                        aaclVar.c(twqVar, i2);
                        return;
                    case 5:
                    case 6:
                        aabf aabfVar2 = aabhVar.g;
                        float fC = aabhVar.c();
                        ((zrt) aabfVar2.a).a();
                        ?? r102 = aabfVar2.b;
                        if (r102 != 0) {
                            r102.a(fC);
                            return;
                        }
                        return;
                    default:
                        aabhVar.g.c(aabhVar.d());
                        return;
                }
            }
        }
    }

    public final synchronized float a() {
        return this.m;
    }

    public final synchronized float b() {
        return 1.0f - this.q;
    }

    public final synchronized float c() {
        return this.t;
    }

    public final synchronized Bitmap d() {
        return this.y.h(this.p);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate) {
        return equals(iGroundOverlayDelegate);
    }

    public final synchronized LatLngBounds f() {
        return this.i;
    }

    public final synchronized boolean g() {
        return this.v;
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final synchronized float getBearing() {
        this.c.a();
        return a();
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final synchronized LatLngBounds getBounds() {
        this.c.a();
        return f();
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final synchronized float getHeight() {
        this.c.a();
        return this.k;
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final String getId() {
        return this.g;
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final synchronized LatLng getPosition() {
        this.c.a();
        return this.l;
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final sqj getTag() {
        this.c.a();
        return this.x;
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final synchronized float getTransparency() {
        this.c.a();
        return this.q;
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final synchronized float getWidth() {
        this.c.a();
        return this.j;
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final synchronized float getZIndex() {
        this.c.a();
        return c();
    }

    public final synchronized boolean h() {
        return this.u;
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final int hashCodeRemote() {
        return hashCode();
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final synchronized boolean isClickable() {
        this.c.a();
        return g();
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final synchronized boolean isVisible() {
        this.c.a();
        return h();
    }

    @Override // defpackage.zxc
    public final void j() {
        zvh zvhVar = this.b;
        if (zvhVar != null) {
            aabh aabhVar = (aabh) zvhVar;
            aabhVar.e.a();
            boolean z = aabhVar.h;
            zkt.h(z, "isInitialized=%s", Boolean.valueOf(z));
            if (!aabhVar.i) {
                aabhVar.g.a();
                aabhVar.d.c(aabhVar.j, ((abax) aabhVar.k.b).i);
                aabhVar.i = true;
            }
        }
        synchronized (this) {
            if (this.w) {
                return;
            }
            this.x = e;
            this.w = true;
            this.y.j(this.p);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void remove() {
        this.c.a();
        this.h.b(aahu.GROUND_OVERLAY_REMOVE);
        j();
        this.a.b(this);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setBearing(float f2) {
        this.c.a();
        this.h.b(aahu.GROUND_OVERLAY_BEARING);
        synchronized (this) {
            this.m = f2;
        }
        n(0);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setClickable(boolean z) {
        this.c.a();
        this.h.b(aahu.GROUND_OVERLAY_CLICKABILITY);
        synchronized (this) {
            this.v = z;
        }
        n(7);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setDimensions(float f2) {
        setDimensionsWithHeight(f2, -1.0f);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setDimensionsWithHeight(float f2, float f3) {
        this.c.a();
        this.h.b(aahu.GROUND_OVERLAY_SET_DIMENSIONS);
        synchronized (this) {
            this.j = f2;
            if (f3 == -1.0f) {
                f3 = (this.n / this.o) * f2;
            }
            this.k = f3;
            m();
        }
        n(1);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setImage(sqj sqjVar) {
        this.c.a();
        zkt.n(sqjVar, "wrappedImageDescriptor");
        this.h.b(aahu.GROUND_OVERLAY_SET_IMAGE);
        synchronized (this) {
            aacq aacqVar = this.y;
            aacqVar.j(this.p);
            ztq ztqVar = (ztq) sqi.a(sqjVar);
            this.p = ztqVar;
            aacqVar.i(ztqVar);
            Bitmap bitmapH = aacqVar.h(this.p);
            this.n = bitmapH.getHeight();
            this.o = bitmapH.getWidth();
        }
        n(2);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setPosition(LatLng latLng) {
        this.c.a();
        this.h.b(aahu.GROUND_OVERLAY_SET_LOCATION);
        synchronized (this) {
            this.l = latLng;
            m();
        }
        n(4);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        this.c.a();
        synchronized (this) {
            this.i = latLngBounds;
            l();
        }
        n(4);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setTag(sqj sqjVar) {
        this.c.a();
        this.h.b(aahu.GROUND_OVERLAY_SET_TAG);
        this.x = sqjVar;
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setTransparency(float f2) {
        this.c.a();
        this.h.b(aahu.GROUND_OVERLAY_TRANSPARENCY);
        boolean z = false;
        if (f2 >= BitmapDescriptorFactory.HUE_RED && f2 <= 1.0f) {
            z = true;
        }
        zkt.e(z, "Transparency must be in the range [0..1]");
        synchronized (this) {
            this.q = f2;
        }
        n(6);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setVisible(boolean z) {
        this.c.a();
        this.h.b(aahu.GROUND_OVERLAY_VISIBILITY);
        synchronized (this) {
            this.u = z;
        }
        n(5);
    }

    @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
    public final void setZIndex(float f2) {
        this.c.a();
        this.h.b(aahu.GROUND_OVERLAY_Z_INDEX);
        synchronized (this) {
            this.t = f2;
        }
        n(3);
    }
}

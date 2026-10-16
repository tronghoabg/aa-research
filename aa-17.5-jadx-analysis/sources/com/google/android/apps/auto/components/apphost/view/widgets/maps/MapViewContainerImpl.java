package com.google.android.apps.auto.components.apphost.view.widgets.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.car.app.model.CarLocation;
import androidx.car.app.model.Place;
import com.google.android.apps.auto.components.apphost.view.widgets.maps.MapViewContainerImpl;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.LocationSource;
import com.google.android.libraries.maps.MapView;
import com.google.android.libraries.maps.OnMapReadyCallback;
import com.google.android.libraries.maps.UiSettings;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.Marker;
import com.google.android.libraries.maps.model.MarkerOptions;
import com.google.android.projection.gearhead.R;
import defpackage.ajmd;
import defpackage.eps;
import defpackage.ept;
import defpackage.eqa;
import defpackage.eqc;
import defpackage.gef;
import defpackage.geu;
import defpackage.gks;
import defpackage.gpc;
import defpackage.gpg;
import defpackage.gph;
import defpackage.kea;
import defpackage.ken;
import defpackage.keo;
import defpackage.yfq;
import defpackage.yls;
import defpackage.yph;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MapViewContainerImpl extends gpc {
    public static final /* synthetic */ int e = 0;
    private static final yph f = yph.c("CarApp.H.Tem");
    public final float a;
    public boolean b;
    public GoogleMap c;
    public LocationSource.OnLocationChangedListener d;
    private MapView g;
    private final int h;
    private Rect i;
    private final gph j;
    private final float k;
    private Place l;
    private List m;
    private List n;
    private Marker o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private geu u;
    private eqc v;
    private boolean w;
    private final LocationSource x;
    private final ajmd y;

    public MapViewContainerImpl(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        int i3 = yfq.d;
        this.m = yls.a;
        this.n = new ArrayList(8);
        this.x = new ken(this);
        this.y = new ajmd(this, null);
        this.h = context.getResources().getDimensionPixelOffset(R.dimen.map_padding);
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.map_max_zoom_level, typedValue, true);
        this.a = typedValue.getFloat();
        this.j = new gph(context, new gpg(context, attributeSet, i, i2));
        this.k = getResources().getDisplayMetrics().density;
        eqc eqcVar = new eqc(this, true);
        this.v = eqcVar;
        eqcVar.c(this);
    }

    private static Marker p(GoogleMap googleMap, CarLocation carLocation, Bitmap bitmap) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(bitmap));
        markerOptions.position(new LatLng(carLocation.getLatitude(), carLocation.getLongitude()));
        return googleMap.addMarker(markerOptions);
    }

    @Override // defpackage.gpc, defpackage.epf
    public final void fL(eqa eqaVar) {
        this.g.onStop();
        this.s = false;
        removeView(this.g);
    }

    @Override // defpackage.gpc, defpackage.epf
    public final void fM() {
        this.g.onPause();
        geu geuVar = this.u;
        geuVar.getClass();
        geuVar.B().c(this, 3);
        n(false);
    }

    @Override // defpackage.gpc, defpackage.epf
    public final void fv(eqa eqaVar) {
        if (this.r) {
            return;
        }
        this.g.onCreate(null);
        this.g.getMapAsync(new OnMapReadyCallback() { // from class: kel
            @Override // com.google.android.libraries.maps.OnMapReadyCallback
            public final void onMapReady(GoogleMap googleMap) {
                MapViewContainerImpl mapViewContainerImpl = this.a;
                googleMap.setMaxZoomPreference(mapViewContainerImpl.a);
                googleMap.setMapColorScheme(2);
                googleMap.setOnMarkerClickListener(new kem());
                UiSettings uiSettings = googleMap.getUiSettings();
                uiSettings.setMyLocationButtonEnabled(false);
                uiSettings.setAllGesturesEnabled(false);
                mapViewContainerImpl.c = googleMap;
                mapViewContainerImpl.n(mapViewContainerImpl.b);
                mapViewContainerImpl.o("on_create");
            }
        });
        this.r = true;
    }

    @Override // defpackage.gpc, defpackage.epf
    public final void fw(eqa eqaVar) {
        this.g.onDestroy();
        this.r = false;
    }

    @Override // defpackage.gpc, defpackage.epf
    public final void fx(eqa eqaVar) {
        this.g.onResume();
        geu geuVar = this.u;
        geuVar.getClass();
        geuVar.B().b(this, 3, new kea(this, 4));
        n(this.b);
    }

    @Override // defpackage.gpc, defpackage.epf
    public final void fy(eqa eqaVar) {
        this.g.onStart();
        this.s = true;
        addView(this.g);
        this.q = true;
        this.p = true;
        o("on_start");
    }

    @Override // defpackage.gpc
    public final gph g() {
        return this.j;
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.v;
    }

    @Override // defpackage.gpc
    public final void h(eps epsVar) {
        this.v.f(epsVar);
    }

    @Override // defpackage.gpc
    public final void i(Place place) {
        this.q = true;
        this.l = place;
        o("set_anchor");
    }

    @Override // defpackage.gpc
    public final void j(boolean z) {
        this.b = z;
        n(z);
    }

    @Override // defpackage.gpc
    public final void k(List list) {
        if (list.equals(this.m)) {
            return;
        }
        this.p = true;
        this.m = list;
        o("set_places");
    }

    @Override // defpackage.gpc
    public final void l(geu geuVar) {
        if (this.u != null) {
            gks.d("CarApp.H.Tem", "TemplateContext has already been set.");
            return;
        }
        this.u = geuVar;
        geuVar.B().b(this, 7, new kea(this, 3));
        m();
    }

    public final void m() {
        eps epsVar = this.v.e;
        if (this.g != null) {
            if (epsVar.a(eps.c)) {
                this.v.f(eps.a);
            }
            this.v.d(this);
        }
        if (epsVar == eps.a) {
            return;
        }
        geu geuVar = this.u;
        geuVar.getClass();
        this.g = (MapView) LayoutInflater.from(keo.c(geuVar)).inflate(R.layout.map_view_static, (ViewGroup) this, false);
        eqc eqcVar = new eqc(this, true);
        this.v = eqcVar;
        eqcVar.c(this);
        this.v.f(epsVar);
    }

    public final void n(boolean z) {
        geu geuVar = this.u;
        if (geuVar == null) {
            return;
        }
        GoogleMap googleMap = this.c;
        gef gefVar = (gef) geuVar.l(gef.class);
        gefVar.getClass();
        LocationSource locationSource = null;
        if (geuVar.i().c() > 3) {
            boolean z2 = this.w;
            if (z) {
                if (!z2) {
                    gefVar.f(this.y);
                    this.w = true;
                }
                locationSource = this.x;
            } else if (z2) {
                gefVar.g(this.y);
                this.w = false;
            }
        } else if (geuVar.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0 && geuVar.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z = false;
        }
        if (googleMap != null) {
            googleMap.setLocationSource(locationSource);
            googleMap.setMyLocationEnabled(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.apphost.view.widgets.maps.MapViewContainerImpl.o(java.lang.String):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (isLaidOut()) {
            return;
        }
        o("layout");
    }

    public MapViewContainerImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MapViewContainerImpl(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MapViewContainerImpl(Context context) {
        this(context, null);
    }
}

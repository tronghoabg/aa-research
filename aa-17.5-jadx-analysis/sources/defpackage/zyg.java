package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.libraries.maps.StreetViewPanoramaOptions;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.android.libraries.maps.model.StreetViewPanoramaLocation;
import com.google.android.libraries.maps.model.StreetViewPanoramaOrientation;
import com.google.android.libraries.maps.model.StreetViewSource;
import com.google.android.projection.gearhead.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zyg extends vir implements View.OnClickListener {
    private static final String j = "zyg";
    public final zyj a;
    public final zrt b;
    public final zyh c;
    public final zst d;
    public final zuu e;
    public final boolean f;
    public boolean g = false;
    public String h = "";
    public final gjt i;
    private final FrameLayout k;
    private final zys l;
    private final zyl m;
    private final Executor n;
    private final zyn o;
    private final zym p;
    private final StreetViewPanoramaCamera q;
    private final aabc r;

    protected zyg(aabc aabcVar, gjt gjtVar, zyj zyjVar, zrt zrtVar, zyh zyhVar, FrameLayout frameLayout, zys zysVar, zyl zylVar, zst zstVar, Executor executor, zyn zynVar, zym zymVar, zuu zuuVar, boolean z, StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.r = aabcVar;
        this.i = gjtVar;
        this.a = zyjVar;
        this.b = zrtVar;
        this.c = zyhVar;
        this.k = frameLayout;
        this.l = zysVar;
        this.m = zylVar;
        this.d = zstVar;
        this.n = executor;
        this.o = zynVar;
        this.p = zymVar;
        this.e = zuuVar;
        this.f = z;
        this.q = streetViewPanoramaCamera;
    }

    public static zyg G(StreetViewPanoramaOptions streetViewPanoramaOptions, gjt gjtVar, aabc aabcVar) {
        try {
            zkt.n(streetViewPanoramaOptions, "StreetViewPanoramaOptions");
            zkt.n(gjtVar, "ContextManager");
            zkt.n(aabcVar, "AppEnvironment");
            zvp.a(gjtVar, aabcVar);
            Object obj = gjtVar.a;
            FrameLayout frameLayout = new FrameLayout(gjtVar.A());
            Object obj2 = aabcVar.i;
            Object obj3 = aabcVar.g;
            Object obj4 = aabcVar.h;
            aahu aahuVar = aahu.RENDERER_STREETVIEW_ONLY_ONE_RENDERER;
            zys zysVarG = zys.g((Context) obj, (zyx) aabcVar.j, "H", (kex) aabcVar.c, null);
            zysVarG.b(aahuVar);
            boolean z = zkt.i;
            vjc vjcVar = ((vjd) obj3).c;
            String str = aafc.b;
            zkt.n(gjtVar, "ContextManager");
            zkt.n(aabcVar, "AppEnvironment");
            zrs zrsVar = zrs.a;
            xyc xycVar = ((zuq) obj2).b;
            zst zstVar = (zst) xycVar.gu();
            aaha aahaVarJ = aafc.j((Context) obj);
            double dT = gjtVar.t();
            CharSequence[] charSequenceArrH = gjtVar.H(R.array.maps_compass_directions);
            CharSequence[] charSequenceArrH2 = gjtVar.H(R.array.maps_full_compass_directions);
            String strF = gjtVar.F(R.string.maps_YOUR_LOCATION);
            String strF2 = gjtVar.F(R.string.maps_invalid_panorama_data);
            zrt zrtVar = zrt.a;
            aafc aafcVar = new aafc(gjtVar, zstVar, aahaVarJ, z, dT, charSequenceArrH, charSequenceArrH2, strF, strF2, zrtVar);
            zyh zyhVar = new zyh(gjtVar);
            StreetViewPanoramaCamera streetViewPanoramaCamera = streetViewPanoramaOptions.getStreetViewPanoramaCamera();
            if (streetViewPanoramaCamera == null) {
                streetViewPanoramaCamera = zyj.a;
            }
            String panoramaId = streetViewPanoramaOptions.getPanoramaId();
            LatLng position = streetViewPanoramaOptions.getPosition();
            Integer radius = streetViewPanoramaOptions.getRadius();
            StreetViewSource source = streetViewPanoramaOptions.getSource();
            if (aahr.j(streetViewPanoramaCamera)) {
                aafcVar.i.h(streetViewPanoramaCamera, 0L);
            } else if (streetViewPanoramaCamera != null) {
                zrn.b("Invalid StreetViewPanoramaCamera ignored: ".concat(streetViewPanoramaCamera.toString()));
            }
            aafcVar.k(panoramaId, position, radius, source, null, false);
            zyl zylVar = new zyl((Context) obj);
            zuu zuuVar = new zuu(gjtVar);
            RelativeLayout relativeLayout = zuuVar.a;
            relativeLayout.setVisibility(8);
            frameLayout.addView(aafcVar);
            frameLayout.addView((View) zyhVar.a);
            frameLayout.addView(relativeLayout);
            boolean z2 = streetViewPanoramaOptions.getUseViewLifecycleInFragment() != null && streetViewPanoramaOptions.getUseViewLifecycleInFragment().booleanValue();
            StreetViewPanoramaCamera streetViewPanoramaCamera2 = streetViewPanoramaOptions.getStreetViewPanoramaCamera() != null ? streetViewPanoramaOptions.getStreetViewPanoramaCamera() : zyj.a;
            zysVarG.b(aahu.PANORAMA_CREATED);
            zyg zygVar = new zyg(aabcVar, gjtVar, aafcVar, zrtVar, zyhVar, frameLayout, zysVarG, zylVar, (zst) xycVar.gu(), zrz.b(), (zyn) aabcVar.l, (zym) aabcVar.f, zuuVar, z2, streetViewPanoramaCamera2);
            zygVar.a.h(new zyf(zygVar));
            ((View) zygVar.c.c).setOnClickListener(zygVar);
            if (streetViewPanoramaOptions.getUserNavigationEnabled() != null) {
                zygVar.l(streetViewPanoramaOptions.getUserNavigationEnabled().booleanValue());
            }
            if (streetViewPanoramaOptions.getZoomGesturesEnabled() != null) {
                zygVar.m(streetViewPanoramaOptions.getZoomGesturesEnabled().booleanValue());
            }
            if (streetViewPanoramaOptions.getPanningGesturesEnabled() != null) {
                zygVar.j(streetViewPanoramaOptions.getPanningGesturesEnabled().booleanValue());
            }
            if (streetViewPanoramaOptions.getStreetNamesEnabled() != null) {
                zygVar.k(streetViewPanoramaOptions.getStreetNamesEnabled().booleanValue());
            }
            zym zymVar = zygVar.p;
            zymVar.c.a();
            String str2 = zym.a;
            if (zrn.e(str2, 4)) {
                Log.i(str2, String.format("registerStreetViewPanoramaInstance(%s)", zygVar));
            }
            zymVar.d.add(zygVar);
            zymVar.a();
            return zygVar;
        } catch (Throwable th) {
            zus.c(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    private final StreetViewPanoramaCamera H() {
        this.b.a();
        return F() ? zyj.a : this.a.a();
    }

    private final StreetViewPanoramaLocation I() {
        this.b.a();
        if (F()) {
            return null;
        }
        return this.a.b();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Executor, zyj] */
    public final void A() {
        try {
            zym zymVar = this.p;
            zymVar.c.a();
            String str = zym.a;
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("unregisterStreetViewPanoramaInstance(%s)", this));
            }
            zymVar.d.remove(this);
            E();
            ?? r0 = this.a;
            ((aafc) r0).k.a();
            synchronized (r0) {
                if (((aafc) r0).q) {
                    String str2 = aafc.b;
                    if (zrn.e(str2, 5)) {
                        Log.w(str2, "onDestroy() called more than once!");
                    }
                } else {
                    ((aafc) r0).q = true;
                    String str3 = aafc.b;
                    if (zrn.e(str3, 4)) {
                        Log.i(str3, "onDestroy()");
                    }
                    ((aafc) r0).e.b = null;
                    aafa aafaVar = ((aafc) r0).f;
                    aafaVar.c.a();
                    String str4 = aafa.a;
                    if (zrn.e(str4, 4)) {
                        Log.i(str4, "onDestroy() enqueued");
                    }
                    r0.execute(new aabr(aafaVar, 9));
                    aage aageVar = ((aafc) r0).l;
                    aageVar.c.a();
                    r0.execute(new aabr(aageVar, 12));
                    ((aafc) r0).m.e.a();
                    aahg aahgVar = ((aafc) r0).g;
                    synchronized (aahgVar) {
                        if (aahgVar.f) {
                            String str5 = aahg.a;
                            if (zrn.e(str5, 5)) {
                                Log.w(str5, "onDestroy() called more than once!");
                            }
                        } else {
                            String str6 = aahg.a;
                            if (zrn.e(str6, 4)) {
                                Log.i(str6, "onDestroy()");
                            }
                            aahgVar.f = true;
                            aahgVar.c.clear();
                            aahgVar.d.clear();
                            aahgVar.e = null;
                        }
                    }
                    ((aafc) r0).h.b();
                    aafi aafiVar = ((aafc) r0).i;
                    aafiVar.c.a();
                    if (aafiVar.g) {
                        String str7 = aafi.a;
                        if (zrn.e(str7, 5)) {
                            Log.w(str7, "onDestroy() called more than once!");
                        }
                    } else {
                        String str8 = aafi.a;
                        if (zrn.e(str8, 4)) {
                            Log.i(str8, "onDestroy()");
                        }
                        aafiVar.g = true;
                        synchronized (aafiVar) {
                            aafiVar.o = null;
                            aafiVar.v = null;
                        }
                        aafiVar.n = null;
                        aafiVar.u = null;
                        aafiVar.m = aagi.a;
                        aafiVar.t = zyj.a;
                        aafiVar.l = null;
                        aafiVar.h = null;
                        aafiVar.i = null;
                        aafiVar.j = null;
                        aafiVar.k = null;
                        aafiVar.b.removeCallbacks(aafiVar);
                    }
                }
            }
            this.l.d();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    public final void B() {
        try {
            this.r.a();
            this.a.onPause();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    public final void C() {
        try {
            this.r.b();
            this.a.onResume();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    public final void D(Bundle bundle) {
        String str;
        try {
            this.b.a();
            if (F()) {
                return;
            }
            StreetViewPanoramaCamera streetViewPanoramaCameraH = H();
            StreetViewPanoramaLocation streetViewPanoramaLocationI = I();
            if (streetViewPanoramaLocationI != null) {
                str = streetViewPanoramaLocationI.panoId;
                bundle.putString("position", str);
                zyn zynVar = this.o;
                zynVar.b.a();
                if (str != null) {
                    Map map = zynVar.c;
                    zrc zrcVar = zynVar.a;
                    map.put(str, Long.valueOf(System.currentTimeMillis()));
                    zynVar.b();
                }
            } else {
                str = null;
            }
            String str2 = j;
            if (zrn.e(str2, 3)) {
                Log.d(str2, String.format("onSaveInstanceState(%s):[%s,%s]", bundle, str, streetViewPanoramaCameraH));
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    public final void E() {
        zyj zyjVar = this.a;
        zyjVar.h(null);
        zyjVar.e(null);
        zyjVar.d(null);
        zyjVar.f(null);
        zyjVar.g(null);
    }

    final boolean F() {
        if (!this.g) {
            return false;
        }
        zrn.b(this.h);
        return true;
    }

    public final View a() {
        try {
            return this.k;
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    public final void b(vij vijVar) {
        try {
            this.b.a();
            this.l.b(aahu.PANORAMA_SET_ON_PANORAMA_READY_CALLBACK);
            this.n.execute(new zww(this, vijVar, 3));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    public final /* synthetic */ void c(vij vijVar) {
        try {
            vijVar.a(this);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (Error e2) {
            throw new zsg(e2);
        } catch (RuntimeException e3) {
            throw new zsh(e3);
        }
    }

    public final void d(Bundle bundle) {
        try {
            String string = "";
            if (F()) {
                this.o.a("");
                return;
            }
            StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) vja.c(bundle, "camera");
            if (streetViewPanoramaCamera == null) {
                streetViewPanoramaCamera = this.q;
            }
            if (bundle != null && bundle.containsKey("position")) {
                string = bundle.getString("position");
            }
            this.o.a(string);
            String str = j;
            if (zrn.e(str, 3)) {
                Log.d(str, String.format("onCreate(%s):[%s,%s]", bundle, string, streetViewPanoramaCamera));
            }
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            zkt.n(streetViewPanoramaCamera, "StreetViewPanoramaCamera");
            String str2 = aafc.b;
            if (zrn.e(str2, 4)) {
                Log.i(str2, String.format("onCreate(%s,%s)", streetViewPanoramaCamera, string));
            }
            if (aahr.j(streetViewPanoramaCamera)) {
                ((aafc) zyjVar).i.h(streetViewPanoramaCamera, 0L);
            } else {
                zrn.b("Invalid StreetViewPanoramaCamera ignored: ".concat(String.valueOf(String.valueOf(streetViewPanoramaCamera))));
            }
            if (ysi.R(string)) {
                return;
            }
            ((aafc) zyjVar).k(string, null, null, null, null, false);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final sqj e(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            this.b.a();
            Point point = null;
            if (F()) {
                return new sqi(null);
            }
            this.l.b(aahu.PANORAMA_PROJECT_TO_POINT);
            if (streetViewPanoramaOrientation == null) {
                return new sqi(null);
            }
            zyj zyjVar = this.a;
            float f = streetViewPanoramaOrientation.tilt;
            float f2 = streetViewPanoramaOrientation.bearing;
            ((aafc) zyjVar).k.a();
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, "orientationToPoint(" + f + "," + f2 + ")");
            }
            aafi aafiVar = ((aafc) zyjVar).i;
            aafiVar.c.a();
            String str2 = aafi.a;
            if (zrn.e(str2, 4)) {
                Log.i(str2, String.format("orientationToPoint(%s,%s)", Float.valueOf(f), Float.valueOf(f2)));
            }
            if (!aafiVar.g && !aafiVar.m.i() && aafiVar.c() != null) {
                aagn aagnVar = aafiVar.l;
                String str3 = aagn.a;
                if (zrn.e(str3, 4)) {
                    Log.i(str3, "orientationToPoint(" + f + "," + f2 + ") @ " + aagnVar.toString());
                }
                zkt.l(f, "tiltDeg cannot be NaN");
                zkt.l(f2, "bearingDeg cannot be NaN");
                zkt.i(f, a.bG(f, "illegal tilt: "));
                aebg aebgVar = (aebg) aagn.b.get();
                Object obj = aebgVar.b;
                Object obj2 = aebgVar.a;
                double d = aahr.a;
                double d2 = f2 * 0.017453292f;
                double dSin = Math.sin(d2);
                double dCos = Math.cos(d2);
                double d3 = f * 0.017453292f;
                double dSin2 = Math.sin(d3);
                double dCos2 = Math.cos(d3);
                ((float[]) obj2)[0] = (float) (dSin * dCos2);
                ((float[]) obj2)[1] = (float) dSin2;
                ((float[]) obj2)[2] = (float) (dCos * dCos2);
                ((float[]) obj2)[3] = 1.0f;
                if (zrn.e(str3, 3)) {
                    Log.d(str3, "orientationToPoint.worldSpaceVector=".concat(String.valueOf(Arrays.toString((float[]) obj2))));
                }
                Matrix.multiplyMV((float[]) obj, 0, aagnVar.e(), 0, (float[]) obj2, 0);
                if (zrn.e(str3, 3)) {
                    Log.d(str3, "orientationToPoint.viewSpaceVector=".concat(String.valueOf(Arrays.toString((float[]) obj))));
                }
                float f3 = ((float) aagnVar.q) / ((float[]) obj)[2];
                for (int i = 0; i < 4; i++) {
                    ((float[]) obj)[i] = ((float[]) obj)[i] * f3;
                }
                point = new Point((int) (((float[]) obj)[0] + (aagnVar.h * 0.5d)), (int) ((aagnVar.i * 0.5d) - ((float[]) obj)[1]));
            }
            return new sqi(point);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vis
    public final StreetViewPanoramaCamera f() {
        try {
            return H();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vis
    public final StreetViewPanoramaLocation g() {
        try {
            return I();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vis
    public final StreetViewPanoramaOrientation h(sqj sqjVar) {
        Point point;
        try {
            this.b.a();
            if (F()) {
                return null;
            }
            this.l.b(aahu.PANORAMA_PROJECT_TO_ORIENTATION);
            if (sqjVar == null || (point = (Point) sqi.a(sqjVar)) == null) {
                return null;
            }
            return this.a.c(point.x, point.y);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vis
    public final void i(StreetViewPanoramaCamera streetViewPanoramaCamera, long j2) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_ANIMATE_TO);
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            zkt.n(streetViewPanoramaCamera, "camera");
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, "animateCamera(" + String.valueOf(streetViewPanoramaCamera) + "@" + j2 + "ms)");
            }
            if (aahr.j(streetViewPanoramaCamera)) {
                ((aafc) zyjVar).i.h(streetViewPanoramaCamera, j2);
            } else {
                zrn.b("Invalid StreetViewPanoramaCamera ignored: ".concat(String.valueOf(String.valueOf(streetViewPanoramaCamera))));
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void j(boolean z) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_ENABLE_PANNING);
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, "enableYawTilt(" + z + ")");
            }
            ((aafc) zyjVar).j.a = z;
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void k(boolean z) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_ENABLE_STREET_NAMES);
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, "enableStreetNames(" + z + ")");
            }
            aage aageVar = ((aafc) zyjVar).l;
            aageVar.c.a();
            synchronized (aageVar) {
                String str2 = aage.a;
                if (zrn.e(str2, 4)) {
                    Log.i(str2, String.format("setEnabled(%s => %s)", Boolean.valueOf(aageVar.h), Boolean.valueOf(z)));
                }
                if (aageVar.h == z) {
                    return;
                }
                aageVar.h = z;
                aageVar.b.b("ROAD_LABELS_setEnabled");
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void l(boolean z) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_ENABLE_NAVIGATION);
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, "enableNavigation(" + z + ")");
            }
            ((aafc) zyjVar).r = z;
            aafz aafzVar = ((aafc) zyjVar).m;
            aafzVar.e.a();
            synchronized (aafzVar) {
                String str2 = aafz.a;
                if (zrn.e(str2, 4)) {
                    Log.i(str2, String.format("setEnabled(%s => %s)", Boolean.valueOf(aafzVar.f), Boolean.valueOf(z)));
                }
                if (aafzVar.f != z) {
                    aafzVar.f = z;
                    aafzVar.c.b("CHEVRONS_setEnabled");
                }
            }
            ((aafc) zyjVar).e.b("OPTIONS_enableUserNavigationUi()");
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void m(boolean z) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_ENABLE_ZOOM);
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, "enableZoom(" + z + ")");
            }
            ((aafc) zyjVar).j.b = z;
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void n(vhx vhxVar) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_SET_CAMERA_CHANGE_LISTENER);
            this.a.d(vhxVar);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void o(via viaVar) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_SET_CHANGE_LISTENER);
            this.a.e(viaVar);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            if (!F() && view == this.c.c) {
                zyl zylVar = this.m;
                zyj zyjVar = this.a;
                StreetViewPanoramaLocation streetViewPanoramaLocationB = zyjVar.b();
                StreetViewPanoramaCamera streetViewPanoramaCameraA = zyjVar.a();
                zkt.n(streetViewPanoramaLocationB, "StreetViewPanoramaLocation");
                zkt.n(streetViewPanoramaCameraA, "StreetViewPanoramaCamera");
                zylVar.a(String.format("https://%s/cbk?cb_client=%s&output=report&panoid=%s&&cbp=%s", "cbk0.google.com", "an_mobile", streetViewPanoramaLocationB.panoId, String.format(Locale.US, "1,%f,,%f,%f", Float.valueOf(streetViewPanoramaCameraA.bearing), Float.valueOf(streetViewPanoramaCameraA.zoom), Float.valueOf(-streetViewPanoramaCameraA.tilt))));
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void p(vid vidVar) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_SET_CLICK_LISTENER);
            this.a.f(vidVar);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void q(vig vigVar) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_SET_LONG_CLICK_LISTENER);
            this.a.g(vigVar);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void r(LatLng latLng) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_SET_POSITION);
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("setPosition(%s)", latLng));
            }
            ((aafc) zyjVar).k(null, latLng, null, null, null, false);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void s(String str) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_SET_POSITION_WITH_ID);
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            String str2 = aafc.b;
            if (zrn.e(str2, 4)) {
                Log.i(str2, String.format("setPositionWithID(%s)", str));
            }
            ((aafc) zyjVar).k(str, null, null, null, null, false);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void t(LatLng latLng, int i) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            this.l.b(aahu.PANORAMA_SET_POSITION_WITH_RADIUS);
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("setPositionWithRadius(%s@%sm)", latLng, Integer.valueOf(i)));
            }
            ((aafc) zyjVar).k(null, latLng, Integer.valueOf(i), null, null, false);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void u(LatLng latLng, int i, StreetViewSource streetViewSource) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            if (streetViewSource != null && !StreetViewSource.isRecognizedStreetViewSource(streetViewSource.getType())) {
                zrn.b(String.format(StreetViewSource.UNRECOGNIZED_STREETVIEWSOURCE_ERROR_MESSAGE_TEMPLATE, Integer.valueOf(streetViewSource.getType())));
            }
            boolean zC = a.C(streetViewSource, StreetViewSource.OUTDOOR);
            zys zysVar = this.l;
            if (zC) {
                zysVar.b(aahu.PANORAMA_SET_POSITION_WITH_RADIUS_AND_SOURCE_OUTDOOR);
            } else {
                zysVar.b(aahu.PANORAMA_SET_POSITION_WITH_RADIUS_AND_SOURCE_DEFAULT);
            }
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("setPositionWithRadiusAndSource(%s@%sm:%s)", latLng, Integer.valueOf(i), streetViewSource));
            }
            ((aafc) zyjVar).k(null, latLng, Integer.valueOf(i), streetViewSource, null, false);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final void v(LatLng latLng, StreetViewSource streetViewSource) {
        try {
            this.b.a();
            if (F()) {
                return;
            }
            if (streetViewSource != null && !StreetViewSource.isRecognizedStreetViewSource(streetViewSource.getType())) {
                zrn.b(String.format(StreetViewSource.UNRECOGNIZED_STREETVIEWSOURCE_ERROR_MESSAGE_TEMPLATE, Integer.valueOf(streetViewSource.getType())));
            }
            boolean zC = a.C(streetViewSource, StreetViewSource.OUTDOOR);
            zys zysVar = this.l;
            if (zC) {
                zysVar.b(aahu.PANORAMA_SET_POSITION_WITH_SOURCE_OUTDOOR);
            } else {
                zysVar.b(aahu.PANORAMA_SET_POSITION_WITH_SOURCE_DEFAULT);
            }
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            String str = aafc.b;
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("setPositionWithSource(%s:%s)", latLng, streetViewSource));
            }
            ((aafc) zyjVar).k(null, latLng, null, streetViewSource, null, false);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.vis
    public final boolean w() {
        try {
            this.b.a();
            if (F()) {
                return false;
            }
            return this.a.i();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vis
    public final boolean x() {
        try {
            this.b.a();
            if (F()) {
                return false;
            }
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            return ((aafc) zyjVar).l.d();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vis
    public final boolean y() {
        try {
            this.b.a();
            if (F()) {
                return false;
            }
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            return ((aafc) zyjVar).r;
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vis
    public final boolean z() {
        try {
            this.b.a();
            if (F()) {
                return false;
            }
            zyj zyjVar = this.a;
            ((aafc) zyjVar).k.a();
            return ((aafc) zyjVar).j.b;
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }
}

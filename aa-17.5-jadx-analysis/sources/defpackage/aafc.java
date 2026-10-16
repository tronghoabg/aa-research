package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.RemoteException;
import android.util.Log;
import android.view.Choreographer;
import android.view.MotionEvent;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.android.libraries.maps.model.StreetViewPanoramaLocation;
import com.google.android.libraries.maps.model.StreetViewPanoramaOrientation;
import com.google.android.libraries.maps.model.StreetViewSource;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aafc extends GLSurfaceView implements Executor, aaff, aahb, zyj, zyi, aagc, aafh, zsb {
    public static final String b = "aafc";
    private static aaha w;
    private vig A;
    public final Context c;
    public final zst d;
    public final aahn e;
    public final aafa f;
    public final aahg g;
    public final aahc h;
    public final aafi i;
    public final aafd j;
    public final zrt k;
    public final aage l;
    public final aafz m;
    public final String n;
    public final String o;
    public final String p;
    public boolean q;
    public boolean r;
    public zyi s;
    public int t;
    public int u;
    public aagl v;
    private final zzb x;
    private final eek y;
    private vid z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafc(gjt gjtVar, zst zstVar, aaha aahaVar, boolean z, double d, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, String str, String str2, zrt zrtVar) {
        super((Context) gjtVar.a);
        zkt.n(gjtVar, "contextManager");
        Context context = (Context) gjtVar.a;
        this.c = context;
        zkt.n(zstVar, "drd");
        this.d = zstVar;
        zkt.n(charSequenceArr, "compassDirectionSuffixes");
        zkt.n(charSequenceArr2, "fullCompassDirections");
        zkt.n(str, "localizedYourLocationString");
        this.n = str;
        zkt.n(str2, "localizedInvalidPanoString");
        this.o = str2;
        this.p = "unknown location";
        zkt.n(zrtVar, "uiThreadChecker");
        this.k = zrtVar;
        synchronized (this) {
            this.q = false;
        }
        this.r = true;
        this.z = null;
        this.A = null;
        this.s = null;
        this.u = -1;
        this.t = -1;
        this.v = null;
        String str3 = aahn.a;
        aahm aahmVar = new aahm(Choreographer.getInstance());
        this.e = aahmVar;
        this.l = new aage(d, aahmVar, charSequenceArr);
        aafz aafzVar = new aafz(aahmVar, charSequenceArr2);
        this.m = aafzVar;
        aafx aafxVar = new aafx(aafzVar, this);
        this.y = aafxVar;
        aafi aafiVar = new aafi(this, aahmVar);
        this.i = aafiVar;
        aafiVar.c.a();
        String str4 = aafi.a;
        if (zrn.e(str4, 4)) {
            Log.i(str4, String.format("setInternalPanoramaChangeListener(%s)", this));
        }
        if (!aafiVar.g) {
            aafiVar.i = this;
        }
        aafiVar.c.a();
        if (zrn.e(str4, 4)) {
            Log.i(str4, String.format("setOverlayTransitionListener(%s)", this));
        }
        if (!aafiVar.g) {
            aafiVar.k = this;
        }
        aafd aafdVar = new aafd(this, d);
        this.j = aafdVar;
        zzb zzbVar = new zzb();
        this.x = zzbVar;
        zzbVar.a(context, aafdVar, z);
        aahc aahcVar = new aahc(aahaVar, zstVar, zrz.d);
        this.h = aahcVar;
        aahcVar.d(this);
        aahg aahgVar = new aahg(zstVar, aahaVar, aahmVar, Bitmap.Config.ARGB_8888);
        this.g = aahgVar;
        aafa aafaVar = new aafa(aahgVar, aahmVar, d);
        this.f = aafaVar;
        aafaVar.b(this);
        setEGLContextClientVersion(2);
        setRenderer(aafaVar);
        setRenderMode(0);
        aahmVar.b = this;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        ebm.o(this, aafxVar);
    }

    public static synchronized aaha j(Context context) {
        aaha aahaVar;
        zkt.n(context, "clientApplicationContext");
        aahaVar = w;
        if (aahaVar == null) {
            String absolutePath = context.getCacheDir().getAbsolutePath();
            long j = aaha.a;
            zkt.n(absolutePath, "cacheDirPath");
            long j2 = aaha.a;
            aahaVar = new aaha(aahl.a(absolutePath, 10, j2, aaha.b), aahl.a(absolutePath, 10, j2, aaha.c), aahl.a(absolutePath, 80, j2, aaha.d));
            w = aahaVar;
        }
        return aahaVar;
    }

    @Override // defpackage.zyj
    public final StreetViewPanoramaCamera a() {
        this.k.a();
        aafi aafiVar = this.i;
        aafiVar.c.a();
        return aafiVar.t;
    }

    @Override // defpackage.zyj
    public final StreetViewPanoramaLocation b() {
        this.k.a();
        aafi aafiVar = this.i;
        aafiVar.c.a();
        if (aafiVar.m.i()) {
            return null;
        }
        return aafiVar.m.e();
    }

    @Override // defpackage.zyj
    public final StreetViewPanoramaOrientation c(int i, int i2) {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, a.bB(i2, i, "pointToOrientation(", ",", ")"));
        }
        aafi aafiVar = this.i;
        aafiVar.c.a();
        String str2 = aafi.a;
        if (zrn.e(str2, 4)) {
            Log.i(str2, String.format("pointToOrientation(%s,%s)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (aafiVar.g || aafiVar.m.i() || aafiVar.c() == null) {
            return null;
        }
        return aafiVar.l.a(i, i2);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return i();
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return i();
    }

    @Override // defpackage.zyj
    public final void d(vhx vhxVar) {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, a.bV(vhxVar, "setApiOnCameraChangeListener(", ")"));
        }
        aafi aafiVar = this.i;
        aafiVar.c.a();
        String str2 = aafi.a;
        if (zrn.e(str2, 4)) {
            Log.i(str2, String.format("setApiCameraChangeListener(%s)", vhxVar));
        }
        if (aafiVar.g) {
            return;
        }
        aafiVar.j = vhxVar;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        this.k.a();
        zkt.n(motionEvent, "MotionEvent");
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("dispatchHoverEvent(%s)", motionEvent));
        }
        return this.y.t(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // defpackage.zyj
    public final void e(via viaVar) {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, a.bV(viaVar, "setApiOnChangeListener(", ")"));
        }
        aafi aafiVar = this.i;
        aafiVar.c.a();
        String str2 = aafi.a;
        if (zrn.e(str2, 4)) {
            Log.i(str2, String.format("setApiPanoramaChangeListener(%s)", viaVar));
        }
        if (aafiVar.g) {
            return;
        }
        aafiVar.h = viaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zkt.n(runnable, "Runnable");
        queueEvent(runnable);
    }

    @Override // defpackage.zyj
    public final void f(vid vidVar) {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("setApiOnClickListener(%s)", vidVar));
        }
        this.z = vidVar;
    }

    @Override // defpackage.zyj
    public final void g(vig vigVar) {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("setApiOnLongClickListener(%s)", vigVar));
        }
        this.A = vigVar;
    }

    @Override // defpackage.zyj
    public final void h(zyi zyiVar) {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("setPanoramaChangeListener(%s)", zyiVar));
        }
        this.s = zyiVar;
    }

    @Override // defpackage.zyj
    public final boolean i() {
        this.k.a();
        return this.j.a;
    }

    public final void k(String str, LatLng latLng, Integer num, StreetViewSource streetViewSource, StreetViewPanoramaCamera streetViewPanoramaCamera, boolean z) {
        this.k.a();
        String str2 = b;
        if (zrn.e(str2, 4)) {
            Log.i(str2, String.format("loadPanoramaImpl(%s,%s,%s,%s,%s, %s)", str, latLng, num, streetViewSource, streetViewPanoramaCamera, Boolean.valueOf(z)));
        }
        if (str == null && latLng == null) {
            if (zrn.e(str2, 4)) {
                Log.i(str2, "Skipping loadPanorama(<null>,<null>)");
                return;
            }
            return;
        }
        this.t = -1;
        this.u = -1;
        if (str != null) {
            this.v = this.i.b(str, streetViewPanoramaCamera, z);
            aahc aahcVar = this.h;
            aahcVar.b.a();
            aahcVar.a(str, null, null, null);
            return;
        }
        this.v = null;
        aahc aahcVar2 = this.h;
        aahcVar2.b.a();
        zkt.n(latLng, "panoLatLng");
        aahcVar2.a(null, latLng, num, streetViewSource);
    }

    @Override // defpackage.aaff
    public final void l(int i, int i2) {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("onLongPress(%s,%s)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        vig vigVar = this.A;
        if (vigVar == null) {
            return;
        }
        try {
            vigVar.e(c(i, i2));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (Error e2) {
            throw new zsg(e2);
        } catch (RuntimeException e3) {
            throw new zsh(e3);
        }
    }

    @Override // defpackage.aaff
    public final void m(aafe aafeVar) {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, a.bW(aafeVar, "onNewCameraAnimation(", ")"));
        }
        this.i.d(aafeVar);
    }

    @Override // defpackage.aaff
    public final void n(int i, int i2) {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("onSingleTap(%s,%s)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        vid vidVar = this.z;
        if (vidVar == null) {
            return;
        }
        try {
            vidVar.e(c(i, i2));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (Error e2) {
            throw new zsg(e2);
        } catch (RuntimeException e3) {
            throw new zsh(e3);
        }
    }

    @Override // defpackage.aafh
    public final void o(aagi aagiVar) {
        yfq yfqVar;
        this.k.a();
        zkt.n(aagiVar, "pano");
        aage aageVar = this.l;
        aageVar.c.a();
        zkt.n(aagiVar, "pano");
        synchronized (aageVar) {
            String str = aage.a;
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("resetPano(%s => %s)", aageVar.i.b, aagiVar.b));
            }
            if (!a.C(aageVar.i, aagiVar)) {
                aageVar.i = aagiVar;
                aageVar.b.b("ROAD_LABELS_resetPano");
            }
        }
        aafz aafzVar = this.m;
        aafzVar.e.a();
        zkt.n(aagiVar, "pano");
        synchronized (aafzVar) {
            String str2 = aafz.a;
            if (zrn.e(str2, 4)) {
                Log.i(str2, String.format("resetPano(%s => %s)", aafzVar.g.b, aagiVar.b));
            }
            if (a.C(aafzVar.g, aagiVar)) {
                return;
            }
            aafzVar.g = aagiVar;
            if (aagiVar.i()) {
                yfqVar = null;
            } else {
                zkt.g(!aagiVar.i(), "NULL_TARGET");
                yfqVar = aagiVar.m;
            }
            aafzVar.h = yfqVar;
            aafzVar.i = -1;
            aafzVar.j = null;
            aafzVar.k = null;
            aafzVar.c.b("CHEVRONS_resetPano");
        }
    }

    @Override // android.opengl.GLSurfaceView, defpackage.zyj
    public final void onPause() {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, "onPause()");
        }
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView, defpackage.zyj
    public final void onResume() {
        this.k.a();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, "onResume()");
        }
        super.onResume();
        this.e.b("VIEW_onResume()");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.k.a();
        zkt.n(motionEvent, "MotionEvent");
        String str = b;
        if (zrn.e(str, 2)) {
            Log.v(str, a.bV(motionEvent, "onTouchEvent(", ")"));
        }
        if (this.i.a().i()) {
            return true;
        }
        this.x.e(motionEvent);
        return true;
    }
}

package defpackage;

import android.util.Log;
import android.view.MotionEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.StreetViewPanoramaLink;
import com.google.android.libraries.maps.model.StreetViewPanoramaLocation;

/* loaded from: classes3.dex */
public final class aafd implements zze {
    private static final String c = "aafd";
    private final aaff d;
    private final double e;
    public boolean a = true;
    public boolean b = true;
    private float f = BitmapDescriptorFactory.HUE_RED;
    private float g = BitmapDescriptorFactory.HUE_RED;
    private boolean h = false;
    private boolean i = false;

    public aafd(aaff aaffVar, double d) {
        this.d = aaffVar;
        this.e = d;
    }

    @Override // defpackage.zze
    public final boolean c(zzg zzgVar) {
        String str = c;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("handleRotateEvent(%s)", zzgVar));
        }
        return true;
    }

    @Override // defpackage.zze
    public final boolean d(zzi zziVar) {
        String str = c;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("handleScaleEvent(%s)", zziVar));
        }
        if (!this.h && this.b && Math.abs(zziVar.a()) >= 1.0f && Math.abs(zziVar.b()) >= 1.0f) {
            float fA = zziVar.a() - zziVar.b();
            double d = this.e;
            aaff aaffVar = this.d;
            zzf zzfVar = zziVar.a;
            aaffVar.m(new aafo((float) (fA / (d * 180.0d)), zzfVar.e, zzfVar.f));
        }
        return true;
    }

    @Override // defpackage.zze
    public final boolean e(zzl zzlVar) {
        String str = c;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("handleTiltEvent(%s)", zzlVar));
        }
        return true;
    }

    @Override // defpackage.zze
    public final void f() {
        String str = c;
        if (zrn.e(str, 4)) {
            Log.i(str, "handleTouchEnd()");
        }
        if (!this.h || this.i) {
            return;
        }
        if (zrn.e(str, 4)) {
            Log.i(str, "handleTouchEnd() firing onFingerUp()");
        }
        this.i = true;
        aafc aafcVar = (aafc) this.d;
        aafcVar.k.a();
        String str2 = aafc.b;
        if (zrn.e(str2, 4)) {
            Log.i(str2, "onFingerUp()");
        }
        int i = aafcVar.t;
        if (i != -1 && i == aafcVar.u) {
            StreetViewPanoramaLocation streetViewPanoramaLocationB = aafcVar.b();
            if (streetViewPanoramaLocationB != null) {
                int i2 = aafcVar.t;
                StreetViewPanoramaLink[] streetViewPanoramaLinkArr = streetViewPanoramaLocationB.links;
                if (i2 < streetViewPanoramaLinkArr.length) {
                    aafcVar.k(streetViewPanoramaLinkArr[i2].panoId, null, null, null, null, true);
                    return;
                }
            }
            if (zrn.e(str2, 5)) {
                Log.w(str2, "Pano location CHANGED while in the middle of a navigation selection.");
            }
        }
        aafcVar.t = -1;
        aafcVar.u = -1;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        String str = c;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("onDoubleTap(%s)", motionEvent));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0264  */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDoubleTapEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafd.onDoubleTapEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        String str = c;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("onDown(%s)", motionEvent));
        }
        this.h = false;
        this.i = false;
        aaff aaffVar = this.d;
        aaffVar.m(new aafn());
        if (motionEvent != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            aafc aafcVar = (aafc) aaffVar;
            aafcVar.k.a();
            String str2 = aafc.b;
            if (zrn.e(str2, 4)) {
                Log.i(str2, a.bB(y, x, "onFingerDown(", ",", ")"));
            }
            aafz aafzVar = aafcVar.m;
            int iA = aafzVar.a(x, y);
            aafcVar.t = iA;
            aafcVar.u = iA;
            aafzVar.b(iA);
            if (zrn.e(str2, 4)) {
                Log.i(str2, "onFingerDown(" + x + "," + y + ") hit arrow " + aafcVar.t);
            }
            boolean z = aafcVar.t != -1;
            this.h = z;
            if (z && zrn.e(str, 4)) {
                Log.i(str, "onDown() => LOCKED");
            }
        } else if (zrn.e(str, 6)) {
            Log.e(str, "onDown()::NULL");
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        String str = c;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("onFling(%s,%s,%s,%s)", motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)));
        }
        if (motionEvent == null || motionEvent2 == null) {
            if (zrn.e(str, 6)) {
                Log.e(str, "onFling()::NULL");
            }
        } else if (!this.h && this.a) {
            this.d.m(new aafj(aahr.d(this.f, -2.5f, 2.5f) * 0.8f, aahr.d(this.g, -2.5f, 2.5f) * 0.5f));
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        String str = c;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("onLongPress(%s)", motionEvent));
        }
        if (motionEvent == null) {
            if (zrn.e(str, 6)) {
                Log.e(str, "onLongPress()::NULL");
            }
        } else {
            if (this.h) {
                return;
            }
            if (zrn.e(str, 3)) {
                Log.d(str, "onLongPress() firing onLongPress()");
            }
            this.d.l((int) motionEvent.getX(), (int) motionEvent.getY());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        String str = c;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("onScroll(%s,%s,%s,%s)", motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)));
        }
        if (motionEvent == null || motionEvent2 == null) {
            if (zrn.e(str, 6)) {
                Log.e(str, "onScroll()::NULL");
            }
        } else if (this.h) {
            aaff aaffVar = this.d;
            int x = (int) motionEvent2.getX();
            int y = (int) motionEvent2.getY();
            aafc aafcVar = (aafc) aaffVar;
            aafcVar.k.a();
            String str2 = aafc.b;
            if (zrn.e(str2, 2)) {
                Log.v(str2, a.bB(y, x, "onFingerDrag(", ",", ")"));
            }
            if (aafcVar.t != -1) {
                if (zrn.e(str2, 2)) {
                    Log.v(str2, String.format("onFingerDrag(%s,%s):[#%s =?= #%s]", Integer.valueOf(x), Integer.valueOf(y), Integer.valueOf(aafcVar.t), Integer.valueOf(aafcVar.u)));
                }
                aafz aafzVar = aafcVar.m;
                int iA = aafzVar.a(x, y);
                aafcVar.u = iA;
                int i = aafcVar.t;
                if (iA == i) {
                    aafzVar.b(i);
                } else {
                    aafzVar.b(-1);
                }
            }
        } else if (this.a) {
            aaff aaffVar2 = this.d;
            int width = aaffVar2.getWidth();
            int height = aaffVar2.getHeight();
            if (width != 0 && height != 0) {
                this.f = 0.02f * f;
                this.g = (-0.01f) * f2;
                aaffVar2.m(new aafm((f * ((float) aahr.l(true, width, height))) / width, (f2 * ((float) aahr.l(false, width, height))) / (-height)));
                return true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        String str = c;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("onSingleTapConfirmed(%s)", motionEvent));
        }
        if (motionEvent == null) {
            if (zrn.e(str, 6)) {
                Log.e(str, "onSingleTapConfirmed()::NULL");
            }
        } else if (!this.h) {
            if (zrn.e(str, 3)) {
                Log.d(str, "onSingleTapConfirmed() firing onSingleTap()");
            }
            this.d.n((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        String str = c;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("onSingleTapUp(%s)", motionEvent));
        }
        return true;
    }

    @Override // defpackage.zze
    public final void a() {
    }

    @Override // defpackage.zze
    public final void b() {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ku implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public ku(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Type inference failed for: r0v37, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [afer, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int iF;
        int iF2;
        int i = 0;
        switch (this.b) {
            case 0:
                defpackage.kx kxVar = (defpackage.kx) this.a;
                int i2 = kxVar.q;
                if (i2 == 1) {
                    kxVar.p.cancel();
                } else if (i2 != 2) {
                    return;
                }
                kxVar.q = 3;
                android.animation.ValueAnimator valueAnimator = kxVar.p;
                valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 1:
                defpackage.kt ktVar = (defpackage.kt) this.a;
                ktVar.b = null;
                ktVar.drawableStateChanged();
                return;
            case 2:
                android.view.ViewParent parent = ((defpackage.ky) this.a).c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            case 3:
                defpackage.ky kyVar = (defpackage.ky) this.a;
                kyVar.d();
                android.view.View view = kyVar.c;
                if (view.isEnabled() && !view.isLongClickable() && kyVar.b()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    kyVar.d = true;
                    return;
                }
                return;
            case 4:
                ((defpackage.ll) this.a).q();
                return;
            case 5:
                defpackage.ll llVar = (defpackage.ll) this.a;
                defpackage.kt ktVar2 = llVar.e;
                if (ktVar2 == null || !ktVar2.isAttachedToWindow() || llVar.e.getCount() <= llVar.e.getChildCount()) {
                    return;
                }
                llVar.e.getChildCount();
                llVar.p.setInputMethodMode(2);
                llVar.s();
                return;
            case 6:
                ((android.support.v7.widget.StaggeredGridLayoutManager) this.a).L();
                return;
            case 7:
                ((android.support.v7.widget.Toolbar) this.a).j();
                return;
            case 8:
                defpackage.nx nxVar = (defpackage.nx) this.a;
                if (nxVar.b != null) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    long j = nxVar.w;
                    long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                    defpackage.mc mcVarG = nxVar.o.g();
                    if (nxVar.v == null) {
                        nxVar.v = new android.graphics.Rect();
                    }
                    mcVarG.aG(nxVar.b.a, nxVar.v);
                    if (mcVarG.ag()) {
                        int i3 = (int) (nxVar.i + nxVar.g);
                        int paddingLeft = (i3 - nxVar.v.left) - nxVar.o.getPaddingLeft();
                        float f = nxVar.g;
                        if ((f >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || paddingLeft >= 0) && (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || (paddingLeft = ((i3 + nxVar.b.a.getWidth()) + nxVar.v.right) - (nxVar.o.getWidth() - nxVar.o.getPaddingRight())) <= 0)) {
                            iF = 0;
                        } else {
                            iF = paddingLeft;
                        }
                    } else {
                        iF = 0;
                    }
                    if (mcVarG.ah()) {
                        int i4 = (int) (nxVar.j + nxVar.h);
                        iF2 = (i4 - nxVar.v.top) - nxVar.o.getPaddingTop();
                        float f2 = nxVar.h;
                        if ((f2 >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || iF2 >= 0) && (f2 <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || (iF2 = ((i4 + nxVar.b.a.getHeight()) + nxVar.v.bottom) - (nxVar.o.getHeight() - nxVar.o.getPaddingBottom())) <= 0)) {
                            iF2 = 0;
                        }
                    } else {
                        iF2 = 0;
                    }
                    if (iF != 0) {
                        defpackage.nt ntVar = nxVar.l;
                        android.support.v7.widget.RecyclerView recyclerView = nxVar.o;
                        int width = nxVar.b.a.getWidth();
                        nxVar.o.getWidth();
                        iF = ntVar.f(recyclerView, width, iF, j2);
                    }
                    int i5 = iF;
                    if (iF2 != 0) {
                        defpackage.nt ntVar2 = nxVar.l;
                        android.support.v7.widget.RecyclerView recyclerView2 = nxVar.o;
                        int height = nxVar.b.a.getHeight();
                        nxVar.o.getHeight();
                        iF2 = ntVar2.f(recyclerView2, height, iF2, j2);
                    }
                    if (i5 != 0) {
                        i = i5;
                    } else if (iF2 == 0) {
                        nxVar.w = Long.MIN_VALUE;
                        return;
                    }
                    if (nxVar.w == Long.MIN_VALUE) {
                        nxVar.w = jCurrentTimeMillis;
                    }
                    nxVar.o.scrollBy(i, iF2);
                    defpackage.mr mrVar = nxVar.b;
                    if (mrVar != null) {
                        nxVar.e(mrVar);
                    }
                    nxVar.o.removeCallbacks(nxVar.p);
                    android.support.v7.widget.RecyclerView recyclerView3 = nxVar.o;
                    int[] iArr = defpackage.ebt.a;
                    recyclerView3.postOnAnimation(this);
                    return;
                }
                return;
            case 9:
                defpackage.ob obVar = (defpackage.ob) this.a;
                java.lang.Runnable runnable = obVar.a;
                if (runnable != null) {
                    runnable.run();
                    obVar.a = null;
                    return;
                }
                return;
            case 10:
                defpackage.of.g((defpackage.of) this.a);
                return;
            case 11:
                java.util.Map map = ((defpackage.ql) this.a).a;
                synchronized (map) {
                    for (androidx.car.app.CarAppBinder carAppBinder : map.values()) {
                        if (android.util.Log.isLoggable("CarApp", 3)) {
                            android.util.Log.d("CarApp", "Executing onAutoDriveEnabled for " + carAppBinder.getCurrentSessionInfo());
                        }
                        carAppBinder.onAutoDriveEnabled();
                    }
                    break;
                }
                return;
            case 12:
                ((defpackage.rc) ((defpackage.qs) this.a).a(defpackage.rc.class)).c();
                return;
            case 13:
                defpackage.btq btqVar = (defpackage.btq) this.a;
                defpackage.buf bufVar = btqVar.b;
                if (bufVar != null) {
                    bufVar.setState(defpackage.btq.a);
                }
                btqVar.d = null;
                return;
            case 14:
                ((defpackage.czl) this.a).c();
                return;
            case 15:
                java.lang.Class cls = defpackage.czz.a;
                this.a.invoke();
                return;
            case 16:
                ((defpackage.czz) this.a).S();
                return;
            case 17:
                ((defpackage.czz) this.a).S();
                return;
            case 18:
                this.a.invoke();
                return;
            case 19:
                this.a.invoke();
                return;
            default:
                this.a.invoke();
                return;
        }
    }

    public /* synthetic */ ku(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jjj implements defpackage.jje, defpackage.jjl {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM.RLCOMPOSER");
    public volatile defpackage.ipo b;
    public defpackage.jjd c;
    public final defpackage.izq d;
    private final android.content.Context e;
    private final int f;
    private final boolean g;
    private final defpackage.affh h;
    private android.media.ImageReader i;
    private android.media.ImageWriter j;
    private android.media.Image k;
    private android.os.Handler l;
    private final ajay m;
    private jjk n;
    private int o;
    private long p;
    private java.util.UUID q;
    private final java.lang.Runnable r;
    private final ajba s;

    public jjj(android.content.Context context, defpackage.izq izqVar, int i, boolean z) {
        context.getClass();
        hkb hkbVar = new hkb(context, 3);
        this.e = context;
        this.d = izqVar;
        this.f = i;
        this.g = z;
        this.h = hkbVar;
        ajba ajbaVarA = ajbb.a(new jjm(defpackage.afce.a, false, i, new jja(0, 0, 0, 0, 1.0f), 0L));
        this.s = ajbaVarA;
        this.m = new ajak(ajbaVarA, (aiwg) null);
        this.o = 3;
        this.r = new defpackage.jeo(this, 12);
    }

    private static final void a(android.media.Image image, defpackage.jjd jjdVar) {
        android.hardware.HardwareBuffer hardwareBufferM = hh$.ExternalSyntheticApiModelOutline0.m(image);
        if (hardwareBufferM != null) {
            try {
                android.graphics.Bitmap bitmapM = ep$.ExternalSyntheticApiModelOutline0.m(hardwareBufferM, (android.graphics.ColorSpace) null);
                android.graphics.Bitmap bitmapCopy = bitmapM != null ? bitmapM.copy(android.graphics.Bitmap.Config.ARGB_8888, false) : null;
                if (bitmapM != null) {
                    bitmapM.recycle();
                }
                if (bitmapCopy != null) {
                    jjdVar.a(bitmapCopy);
                    ep$.ExternalSyntheticApiModelOutline1.m(hardwareBufferM);
                    return;
                }
                ep$.ExternalSyntheticApiModelOutline1.m(hardwareBufferM);
            } catch (java.lang.Throwable th) {
                ep$.ExternalSyntheticApiModelOutline1.m(hardwareBufferM);
                throw th;
            }
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        jjdVar.a(bitmapCreateBitmap);
    }

    private static final boolean q(defpackage.jhl jhlVar) {
        int iJ = jhlVar.j();
        if (iJ != 5) {
            return iJ == 4 && !jhlVar.aE();
        }
        return true;
    }

    @Override // defpackage.jje
    public final void b(com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.jjd jjdVar, java.util.UUID uuid, int i, int i2, android.util.SparseArray sparseArray, defpackage.jhi jhiVar) {
        java.lang.Object objB;
        jjm jjmVar;
        jjdVar.getClass();
        uuid.getClass();
        sparseArray.getClass();
        jhiVar.getClass();
        android.os.Handler handler = this.l;
        if (handler == null) {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            jjdVar.a(bitmapCreateBitmap);
            return;
        }
        android.media.Image image = this.k;
        java.lang.Runnable runnable = this.r;
        handler.removeCallbacks(runnable);
        if (image != null) {
            this.c = null;
            a(image, jjdVar);
            return;
        }
        this.c = jjdVar;
        handler.postDelayed(runnable, 2000L);
        ajba ajbaVar = this.s;
        do {
            objB = ajbaVar.b();
            jjmVar = (jjm) objB;
        } while (!ajbaVar.e(objB, jjm.a(jjmVar, (java.util.List) null, false, 0, (jja) null, jjmVar.e + 1, 15)));
    }

    @Override // defpackage.jje
    public final void c(java.io.PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("RelayComposer:");
    }

    @Override // defpackage.jje
    public final void d(defpackage.jhi jhiVar) {
        jhiVar.getClass();
    }

    @Override // defpackage.jje
    public final void e(defpackage.jhi jhiVar) {
        ajba ajbaVar = this.s;
        jjm jjmVar = (jjm) ajbaVar.b();
        defpackage.ive iveVar = jhiVar.a;
        int i = iveVar.g;
        int i2 = iveVar.h;
        int i3 = jhiVar.f;
        int i4 = jhiVar.g;
        float f = jhiVar.d;
        ajbaVar.d(jjm.a(jjmVar, (java.util.List) null, false, 0, new jja(i, i2, i3, i4, f), 0L, 23));
        ((defpackage.yqj) a.f()).T("onUiConfigChanged: margins changed to left=%d, top=%d, par=%f, usableWidth=%d, usableHeight=%d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Float.valueOf(f), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
    }

    @Override // defpackage.jje
    public final void f(int i, java.util.UUID uuid, int i2, android.util.SparseArray sparseArray) {
        uuid.getClass();
        sparseArray.getClass();
    }

    @Override // defpackage.jje
    public final void i(android.view.Surface surface, java.util.UUID uuid, defpackage.jhi jhiVar, boolean z) {
        surface.getClass();
        uuid.getClass();
        jhiVar.getClass();
        this.q = uuid;
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = android.os.Looper.getMainLooper();
        }
        this.l = new android.os.Handler(looperMyLooper);
        defpackage.yqj yqjVar = (defpackage.yqj) a.f();
        defpackage.ive iveVar = jhiVar.a;
        int i = jhiVar.g;
        int i2 = iveVar.h;
        int i3 = jhiVar.f;
        int i4 = iveVar.b;
        int i5 = iveVar.c;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i4);
        java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(i5);
        int i6 = iveVar.g;
        java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(i6);
        java.lang.Integer numValueOf6 = java.lang.Integer.valueOf(i2);
        int i7 = iveVar.i;
        yqjVar.V("start(): scaledWidth=%d, scaledHeight=%d, codecWidth=%d, codecHeight=%d, leftMargin=%d, topMargin=%d, dpi=%d", numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, java.lang.Integer.valueOf(i7));
        if (this.b != null) {
            throw new java.lang.IllegalStateException("Lifecycle violation: start() called while VirtualDisplay is still active.");
        }
        ajba ajbaVar = this.s;
        int i8 = this.f;
        float f = jhiVar.d;
        ajbaVar.d(new jjm(defpackage.afce.a, false, i8, new jja(i6, i2, i3, i, f), 0L));
        android.media.ImageReader imageReaderM = ep$.ExternalSyntheticApiModelOutline0.m(i4, i5, 34, 3, 66304L);
        imageReaderM.getClass();
        this.i = imageReaderM;
        android.media.ImageWriter imageWriterNewInstance = android.media.ImageWriter.newInstance(surface, 3);
        imageWriterNewInstance.getClass();
        this.j = imageWriterNewInstance;
        defpackage.ipo ipoVar = (defpackage.ipo) this.h.invoke(new com.google.android.gms.car.DrawingSpec(i4, i5, i7, imageReaderM.getSurface(), null, 0, -1, null), java.lang.Boolean.TRUE, "RelayComposer");
        ipoVar.j(3, 1);
        android.content.Context context = this.e;
        ipoVar.e(new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.apps.auto.carservice.car.window.composition.ProjectionRootActivity.class));
        this.b = ipoVar;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.carservice.car.window.composition.ProjectionRootActivity.class);
        intent.addFlags(402685952);
        intent.putExtra("usable_width", i3);
        intent.putExtra("usable_height", i);
        intent.putExtra("display_left_margin", i6);
        intent.putExtra("display_top_margin", i2);
        intent.putExtra("par", f);
        android.os.Bundle bundle = new android.os.Bundle();
        jjk jjkVar = new jjk(this, this.m);
        this.n = jjkVar;
        bundle.putBinder("relay_host_callback", jjkVar);
        intent.putExtra("relay_host_callback_bundle", bundle);
        android.app.ActivityOptions activityOptionsMakeBasic = android.app.ActivityOptions.makeBasic();
        a$.ExternalSyntheticApiModelOutline1.m(activityOptionsMakeBasic, ipoVar.c().getDisplayId());
        context.startActivity(intent, activityOptionsMakeBasic.toBundle());
    }

    @Override // defpackage.jje
    public final void j() {
        ((defpackage.yqj) a.f()).u("stop()");
        ajba ajbaVar = this.s;
        ajbaVar.d(jjm.a((jjm) ajbaVar.b(), (java.util.List) null, true, 0, (jja) null, 0L, 29));
        android.os.Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacks(this.r);
        }
        this.l = null;
        defpackage.jjd jjdVar = this.c;
        if (jjdVar != null) {
            this.c = null;
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            jjdVar.a(bitmapCreateBitmap);
        }
        jjk jjkVar = this.n;
        if (jjkVar != null) {
            jjkVar.a = null;
            jjkVar.b = null;
        }
        this.n = null;
        defpackage.ipo ipoVar = this.b;
        if (ipoVar != null) {
            ipoVar.g();
        }
        this.b = null;
        android.media.Image image = this.k;
        if (image != null) {
            image.close();
        }
        this.k = null;
        android.media.ImageReader imageReader = this.i;
        if (imageReader != null) {
            imageReader.close();
        }
        this.i = null;
        android.media.ImageWriter imageWriter = this.j;
        if (imageWriter != null) {
            imageWriter.close();
        }
        this.j = null;
    }

    @Override // defpackage.jje
    public final void k(long j) {
        android.media.Image image = this.k;
        if (image == null) {
            return;
        }
        image.setTimestamp(j);
        defpackage.jjd jjdVar = this.c;
        if (jjdVar != null) {
            android.os.Handler handler = this.l;
            if (handler == null) {
                throw new java.lang.IllegalStateException("compositionHandler is null");
            }
            handler.removeCallbacks(this.r);
            this.c = null;
            a(image, jjdVar);
        }
        android.media.ImageWriter imageWriter = this.j;
        if (imageWriter == null) {
            image.close();
            this.k = null;
            throw new java.lang.IllegalStateException("imageWriter is null in submitFrame()");
        }
        try {
            imageWriter.queueInputImage(image);
            this.k = null;
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(1, java.util.concurrent.TimeUnit.SECONDS)).p(e)).u("Failed to queue image, likely full. Retaining frame.");
        }
    }

    @Override // defpackage.jje
    public final void l(android.util.SparseArray sparseArray, int i) {
        this = this;
        sparseArray = sparseArray;
        sparseArray.getClass();
        ajba ajbaVar = this.s;
        if (((jjm) ajbaVar.b()).c == i) {
            java.util.List list = ((jjm) ajbaVar.b()).a;
            int size = sparseArray.size();
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                if (i2 >= size) {
                    java.util.List list2 = list;
                    if (i3 != list2.size()) {
                        a.l().B("shouldUpdate: window count shrunken (prev=%d, current=%d), returning true", list2.size(), i3);
                        break;
                    }
                    return;
                }
                int iKeyAt = sparseArray.keyAt(i2);
                java.util.List list3 = (java.util.List) sparseArray.valueAt(i2);
                if (list3 != null) {
                    int size2 = list3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        defpackage.jhl jhlVar = (defpackage.jhl) list3.get(i4);
                        if (!(jhlVar instanceof defpackage.jhr)) {
                            java.util.Objects.toString(jhlVar);
                            throw new java.lang.IllegalArgumentException("Window must be a ViewProjectionWindow: ".concat(java.lang.String.valueOf(jhlVar)));
                        }
                        if (i3 >= list.size()) {
                            a.l().B("shouldUpdate: more windows added (prev=%d, current > %d), returning true", list.size(), i3);
                            break loop0;
                        }
                        jjs jjsVar = (jjs) list.get(i3);
                        if (!q(jhlVar)) {
                            defpackage.jhr jhrVar = (defpackage.jhr) jhlVar;
                            int iL = jhrVar.l();
                            int i5 = jjsVar.a;
                            if (i5 != iL) {
                                a.l().R("shouldUpdate: window ID mismatch at idx=%d (prevId=%d, currentId=%d), returning true", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(iL));
                                break loop0;
                            }
                            android.graphics.Rect rectT = jhrVar.t();
                            int i6 = jjsVar.d;
                            if (i6 != iKeyAt || !defpackage.afga.f(jjsVar.c, jhrVar.J()) || !defpackage.afga.f(jjsVar.g, rectT) || jjsVar.e != jhlVar.a() || jjsVar.i != jhrVar.T()) {
                                a.l().W("shouldUpdate: material properties changed for window id=%d (name=%s), returning true\n  prevData: zOrder=%d, bounds=%s, insets=%s, alpha=%f\n  current : zOrder=%d, bounds=%s, insets=%s, alpha=%f", java.lang.Integer.valueOf(iL), jhrVar.F(), java.lang.Integer.valueOf(i6), jjsVar.c, jjsVar.g, java.lang.Float.valueOf(jjsVar.e), java.lang.Integer.valueOf(iKeyAt), jhrVar.J(), rectT, java.lang.Float.valueOf(jhlVar.a()));
                                break loop0;
                            }
                            i3++;
                        }
                        i4++;
                        list = list;
                        size = size;
                        i2 = i2;
                    }
                }
                i2++;
                list = list;
                size = size;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size3 = sparseArray.size();
        int i7 = 0;
        while (i7 < size3) {
            int iKeyAt2 = sparseArray.keyAt(i7);
            java.util.List<defpackage.jhl> list4 = (java.util.List) sparseArray.valueAt(i7);
            if (list4 != null) {
                for (defpackage.jhl jhlVar2 : list4) {
                    if (!(jhlVar2 instanceof defpackage.jhr)) {
                        java.util.Objects.toString(jhlVar2);
                        throw new java.lang.IllegalArgumentException("Window is not a ViewProjectionWindow: ".concat(java.lang.String.valueOf(jhlVar2)));
                    }
                    defpackage.jhr jhrVar2 = (defpackage.jhr) jhlVar2;
                    int iL2 = jhrVar2.l();
                    if (!q(jhlVar2)) {
                        java.util.UUID uuid = this.q;
                        if (uuid == null) {
                            throw new java.lang.IllegalStateException("displayConfigurationId is null, must call start() first");
                        }
                        int i8 = ((jjm) this.m.b()).d.d;
                        if (i8 <= 0) {
                            throw new java.lang.IllegalStateException("usableHeight is not configured, must call start() first");
                        }
                        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParamsC = jhrVar2.C();
                        android.graphics.Rect rectJ = jhrVar2.J();
                        float f = rectJ.left;
                        float f2 = rectJ.right;
                        int i9 = i8 - rectJ.top;
                        float f3 = i8 - rectJ.bottom;
                        float f4 = i9;
                        defpackage.jhm jhmVar = new defpackage.jhm(jhrVar2, f, f4, f2, f3);
                        defpackage.jhm jhmVar2 = new defpackage.jhm(jhrVar2, f, f4, f2, f3);
                        defpackage.ebm.l(jhrVar2, sparseArray, uuid, this.g, jhmVar2, i7);
                        int iK = defpackage.afhi.k(jhmVar2.a);
                        int iK2 = defpackage.afhi.k(jhmVar2.c);
                        float f5 = i8;
                        int iK3 = defpackage.afhi.k(f5 - jhmVar2.d);
                        int iK4 = defpackage.afhi.k(f5 - jhmVar2.b);
                        boolean z = true;
                        if (jhmVar2.a <= f && jhmVar2.c >= f2 && jhmVar2.d >= f4 && jhmVar2.b <= f3) {
                            z = false;
                        }
                        if (!jhrVar2.C().h || z) {
                            android.graphics.Rect rectN = jhrVar2.n();
                            int iE = defpackage.afqt.e(iK, rectN.left + projectionWindowDecorationParamsC.a);
                            iK2 = defpackage.afqt.f(iK2, rectN.right - projectionWindowDecorationParamsC.c);
                            iK3 = defpackage.afqt.e(iK3, rectN.top + projectionWindowDecorationParamsC.b);
                            iK4 = defpackage.afqt.f(iK4, rectN.bottom - projectionWindowDecorationParamsC.d);
                            iK = iE;
                        }
                        jji jjiVar = new jji(new android.graphics.Rect(iK, iK3, defpackage.afqt.e(iK2, iK), defpackage.afqt.e(iK4, iK3)), jhrVar2.x(jhmVar, jhmVar2));
                        android.graphics.Rect rect = jjiVar.a;
                        float f6 = jjiVar.b;
                        a.l().T("updateUiState: window id=%d, name=%s\n  bounds: %s\n  customCropBounds: %s\n  cornerRadiusPx: %f", java.lang.Integer.valueOf(iL2), jhrVar2.F(), jhrVar2.J(), rect, java.lang.Float.valueOf(f6));
                        java.lang.String strF = jhrVar2.F();
                        if (strF == null) {
                            strF = "Unknown";
                        }
                        arrayList.add(new jjs(iL2, strF, jhrVar2.J(), iKeyAt2, jhlVar2.a(), rect, jhrVar2.t(), f6, jhrVar2.T()));
                        i7 = i7;
                    }
                }
            }
            i7++;
            this = this;
            sparseArray = sparseArray;
        }
        ajbaVar.d(jjm.a((jjm) ajbaVar.b(), arrayList, false, i, (jja) null, 0L, 26));
    }

    @Override // defpackage.jje
    public final boolean m() {
        return false;
    }

    @Override // defpackage.jje
    public final boolean n(android.util.SparseArray sparseArray) {
        sparseArray.getClass();
        android.media.ImageReader imageReader = this.i;
        if (imageReader == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).l(1, java.util.concurrent.TimeUnit.SECONDS)).u("imageReader is null in hasNewContent");
            return false;
        }
        android.media.Image imageAcquireLatestImage = imageReader.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            android.media.Image image = this.k;
            if (image != null) {
                image.close();
            }
            this.k = imageAcquireLatestImage;
        }
        return this.k != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    @Override // defpackage.jje
    public final boolean o(defpackage.iyl iylVar) {
        int i;
        char c;
        int i2;
        ?? r12;
        int length = iylVar.h.length;
        defpackage.ipo ipoVar = this.b;
        if (ipoVar == null) {
            ((defpackage.yqj) a.h()).u("injectTouchEvent: virtualDisplay is null");
            return false;
        }
        android.hardware.input.VirtualTouchscreen virtualTouchscreenB = ipoVar.b();
        if (virtualTouchscreenB == null) {
            throw new java.lang.IllegalStateException("virtual touch screen missing");
        }
        jja jjaVar = ((jjm) this.m.b()).d;
        int i3 = jjaVar.a;
        int i4 = jjaVar.b;
        int i5 = iylVar.e;
        int i6 = i5 & 255;
        int i7 = i5 >> 8;
        int i8 = 6;
        boolean z = true;
        if (i6 != 5) {
            i = i6 != 6 ? i6 : 1;
        } else {
            i = 0;
        }
        long j = iylVar.g;
        long j2 = this.p;
        if (true != defpackage.fzj.k(j - j2, i, this.o)) {
            j2 = j;
        }
        this.o = i;
        this.p = j;
        int length2 = iylVar.h.length;
        int i9 = 0;
        while (i9 < length2) {
            defpackage.iyk iykVar = iylVar.h[i9];
            if (i6 != i8) {
                c = 5;
                if (i6 == 5) {
                    i2 = 5;
                } else {
                    i2 = i6;
                }
                android.hardware.input.VirtualTouchEvent.Builder action = new android.hardware.input.VirtualTouchEvent.Builder().setAction(i);
                if (i2 == 3) {
                    r12 = c;
                } else {
                    r12 = z;
                }
                boolean z2 = z;
                android.hardware.input.VirtualTouchEvent virtualTouchEventBuild = action.setToolType((int) r12).setPointerId(iykVar.g).setX(iykVar.e + i3).setY(iykVar.f + i4).setPressure(1.0f).setEventTimeNanos(j2 * 1000000).build();
                virtualTouchEventBuild.getClass();
                int i10 = iykVar.e;
                int i11 = iykVar.f;
                virtualTouchscreenB.sendTouchEvent(virtualTouchEventBuild);
                i9++;
                z = z2;
                i = i;
                i8 = 6;
            } else {
                c = 5;
                i2 = i6;
            }
            int i12 = i9 != (i7 & 255) ? 2 : i;
            android.hardware.input.VirtualTouchEvent.Builder action2 = new android.hardware.input.VirtualTouchEvent.Builder().setAction(i12);
            if (i2 == 3) {
                r12 = c;
            } else {
                r12 = z;
            }
            boolean z3 = z;
            android.hardware.input.VirtualTouchEvent virtualTouchEventBuild2 = action2.setToolType((int) r12).setPointerId(iykVar.g).setX(iykVar.e + i3).setY(iykVar.f + i4).setPressure(1.0f).setEventTimeNanos(j2 * 1000000).build();
            virtualTouchEventBuild2.getClass();
            int i13 = iykVar.e;
            int i14 = iykVar.f;
            virtualTouchscreenB.sendTouchEvent(virtualTouchEventBuild2);
            i9++;
            z = z3;
            i = i;
            i8 = 6;
        }
        return z;
    }

    @Override // defpackage.jje
    public final boolean p() {
        return false;
    }

    @Override // defpackage.jje
    public final void g(boolean z) {
    }

    @Override // defpackage.jje
    public final void h(boolean z) {
    }
}

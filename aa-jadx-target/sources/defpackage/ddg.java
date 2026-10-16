package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ddg implements android.view.ScrollCaptureCallback {
    public static final /* synthetic */ int d = 0;
    public final defpackage.dec a;
    public final ddk b;
    public final defpackage.kwv c;
    private final defpackage.dlx e;
    private final android.view.View f;
    private final aiuw g;

    public ddg(defpackage.dec decVar, defpackage.dlx dlxVar, aiuw aiuwVar, defpackage.kwv kwvVar, android.view.View view) {
        this.a = decVar;
        this.e = dlxVar;
        this.c = kwvVar;
        this.f = view;
        this.g = ahoi.d(aiuwVar, ddi.b);
        this.b = new ddk(dlxVar.a(), new gji(this, (defpackage.afdk) null, 1));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.ScrollCaptureSession, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    public final java.lang.Object a(android.view.ScrollCaptureSession scrollCaptureSession, defpackage.dlx dlxVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        ddf ddfVar;
        int i;
        int i2;
        ?? r0;
        defpackage.dlx dlxVar2;
        int i3;
        int i4;
        int iA;
        int iA2;
        defpackage.dlx dlxVar3;
        android.graphics.Canvas canvasLockHardwareCanvas;
        if (afdkVar instanceof ddf) {
            ddfVar = (ddf) afdkVar;
            int i5 = ddfVar.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ddfVar.f = i5 - Integer.MIN_VALUE;
            } else {
                ddfVar = new ddf(this, afdkVar);
            }
        } else {
            ddfVar = new ddf(this, afdkVar);
        }
        java.lang.Object obj = ddfVar.d;
        java.lang.Object obj2 = defpackage.afdr.a;
        int i6 = ddfVar.f;
        if (i6 == 0) {
            defpackage.afga.cz(obj);
            i = dlxVar.c;
            i2 = dlxVar.e;
            ddk ddkVar = this.b;
            ddfVar.a = scrollCaptureSession;
            ddfVar.g = dlxVar;
            ddfVar.b = i;
            ddfVar.c = i2;
            ddfVar.f = 1;
            if (i > i2) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bn(i2, i, "Expected min=", " ≤ max="));
            }
            int i7 = ddkVar.a;
            int i8 = i2 - i;
            if (i8 <= i7) {
                java.lang.Object objC = ddkVar.c(((i8 / 2) + i) - (i7 / 2), ddfVar);
                if (objC != obj2) {
                    objC = defpackage.afbk.a;
                }
                if (objC != obj2) {
                }
                return obj2;
            }
            throw new java.lang.IllegalArgumentException("Expected range (" + i8 + ") to be ≤ viewportSize=" + ddkVar.a);
        }
        if (i6 == 1) {
            int i9 = ddfVar.c;
            int i10 = ddfVar.b;
            defpackage.dlx dlxVar4 = ddfVar.g;
            java.lang.Object obj3 = ddfVar.a;
            defpackage.afga.cz(obj);
            i = i10;
            dlxVar = dlxVar4;
            i2 = i9;
            scrollCaptureSession = obj3;
        } else {
            if (i6 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = ddfVar.c;
            i3 = ddfVar.b;
            dlxVar2 = ddfVar.g;
            java.lang.Object obj4 = ddfVar.a;
            defpackage.afga.cz(obj);
            r0 = obj4;
        }
        ddk ddkVar2 = this.b;
        iA = ddkVar2.a(i3);
        iA2 = ddkVar2.a(i4);
        dlxVar3 = new defpackage.dlx(dlxVar2.b, iA, dlxVar2.d, iA2);
        if (iA == iA2) {
            return defpackage.dlx.a;
        }
        canvasLockHardwareCanvas = a$.ExternalSyntheticApiModelOutline0.m(a$.ExternalSyntheticApiModelOutline0.m((java.lang.Object) r0)).lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-dlxVar3.b, -dlxVar3.c);
            defpackage.dlx dlxVar5 = this.e;
            canvasLockHardwareCanvas.translate(-dlxVar5.b, -dlxVar5.c);
            this.f.getRootView().draw(canvasLockHardwareCanvas);
            int iK = defpackage.afhi.k(this.b.b);
            return new defpackage.dlx(dlxVar3.b, dlxVar3.c + iK, dlxVar3.d, dlxVar3.e + iK);
        } finally {
            a$.ExternalSyntheticApiModelOutline0.m(a$.ExternalSyntheticApiModelOutline0.m((java.lang.Object) r0)).unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        defpackage.cmr cmrVar = new defpackage.cmr(13);
        ddfVar.a = scrollCaptureSession;
        ddfVar.g = dlxVar;
        ddfVar.b = i;
        ddfVar.c = i2;
        ddfVar.f = 2;
        if (defpackage.bxi.f(cmrVar, ddfVar) != obj2) {
            r0 = scrollCaptureSession;
            dlxVar2 = dlxVar;
            i3 = i;
            i4 = i2;
            ddk ddkVar3 = this.b;
            iA = ddkVar3.a(i3);
            iA2 = ddkVar3.a(i4);
            dlxVar3 = new defpackage.dlx(dlxVar2.b, iA, dlxVar2.d, iA2);
            if (iA == iA2) {
                return defpackage.dlx.a;
            }
            canvasLockHardwareCanvas = a$.ExternalSyntheticApiModelOutline0.m(a$.ExternalSyntheticApiModelOutline0.m((java.lang.Object) r0)).lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-dlxVar3.b, -dlxVar3.c);
            defpackage.dlx dlxVar6 = this.e;
            canvasLockHardwareCanvas.translate(-dlxVar6.b, -dlxVar6.c);
            this.f.getRootView().draw(canvasLockHardwareCanvas);
            int iK2 = defpackage.afhi.k(this.b.b);
            return new defpackage.dlx(dlxVar3.b, dlxVar3.c + iK2, dlxVar3.d, dlxVar3.e + iK2);
        }
        return obj2;
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(java.lang.Runnable runnable) {
        ahoc.d(this.g, aiws.a, 0, new defpackage.bnx(this, runnable, (defpackage.afdk) null, 16), 2);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, android.graphics.Rect rect, java.util.function.Consumer consumer) {
        aiwg aiwgVarD = ahoc.d(this.g, (defpackage.afdo) null, 0, new dde(this, scrollCaptureSession, rect, consumer, (defpackage.afdk) null), 3);
        aiwgVarD.p(new defpackage.chs(cancellationSignal, 19));
        cancellationSignal.setOnCancelListener(new ddh(aiwgVarD));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        a$.ExternalSyntheticApiModelOutline2.m(consumer, defpackage.ckn.b(this.e));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, java.lang.Runnable runnable) {
        this.b.b = 0.0f;
        this.c.I(true);
        runnable.run();
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jhs extends defpackage.jha implements defpackage.jhr {
    private static final defpackage.yqm E = defpackage.yqm.c("CAR.WM.ViewProjWin");
    private final boolean F;
    private volatile android.view.SurfaceControlViewHost.SurfacePackage G;
    private volatile android.window.InputTransferToken H;
    private volatile int I;
    private android.view.SurfaceControl J;
    private android.view.Surface K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhs(defpackage.jkr jkrVar, int i, defpackage.jhk jhkVar, com.google.android.gms.car.display.CarRegionId carRegionId, java.util.UUID uuid, android.content.ComponentName componentName, boolean z) {
        super(jkrVar, i, jhkVar, carRegionId, uuid, componentName, defpackage.acwv.u(), new defpackage.jiz(jhkVar.a()));
        jkrVar.getClass();
        uuid.getClass();
        this.F = z;
        this.I = -1;
    }

    @Override // defpackage.jhr
    public final android.graphics.Rect J() {
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.k;
        return projectionWindowDecorationParams.h ? new android.graphics.Rect(n()) : new android.graphics.Rect(n().left + projectionWindowDecorationParams.a, n().top + projectionWindowDecorationParams.b, n().right - projectionWindowDecorationParams.c, n().bottom - projectionWindowDecorationParams.d);
    }

    @Override // defpackage.jha
    protected final void S() {
        android.view.SurfaceControlViewHost.SurfacePackage surfacePackage = this.G;
        if (surfacePackage != null) {
            bgp$.ExternalSyntheticApiModelOutline0.m(surfacePackage);
        }
        this.G = null;
        this.H = null;
        android.view.Surface surface = this.K;
        if (surface != null) {
            surface.release();
        }
        this.K = null;
        android.view.SurfaceControl surfaceControl = this.J;
        if (surfaceControl != null) {
            ep$.ExternalSyntheticApiModelOutline0.m(surfaceControl);
        }
        this.J = null;
    }

    @Override // defpackage.jhr
    public final android.view.SurfaceControlViewHost.SurfacePackage T() {
        return this.G;
    }

    @Override // defpackage.jhr
    public final void U(android.window.InputTransferToken inputTransferToken, int i) {
        ((defpackage.yqj) E.f()).S("onHostTokenAvailable for %s (id=%d): token=%s, displayId=%d", this.s, java.lang.Integer.valueOf(this.D), inputTransferToken, java.lang.Integer.valueOf(i));
        this.I = i;
        this.H = inputTransferToken;
        synchronized (this.t) {
            this.v = 1;
        }
        this.r.f(k(), d());
    }

    @Override // defpackage.jha
    public final boolean aA() {
        return this.G != null;
    }

    @Override // defpackage.jhl
    public final android.view.Surface aL() {
        return null;
    }

    @Override // defpackage.jhl
    public final defpackage.jhm aM() {
        defpackage.jhi jhiVar = ((defpackage.inh) this.c).w;
        if (jhiVar == null) {
            throw new java.lang.IllegalStateException("WindowManager layoutParams is null during composition");
        }
        float f = n().left;
        float f2 = n().right;
        int i = n().top;
        int i2 = jhiVar.g;
        return new defpackage.jhm(this, f, i2 - i, f2, i2 - n().bottom);
    }

    @Override // defpackage.jhl
    public final com.google.android.gms.car.DrawingSpec aN() {
        android.os.Parcelable parcelable = this.H;
        if (parcelable == null) {
            return null;
        }
        int i = this.I;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("input_transfer_token", parcelable);
        bundle.putInt("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", true != aG() ? 128 : 0);
        android.graphics.Rect rectJ = J();
        com.google.android.gms.car.DrawingSpec drawingSpec = new com.google.android.gms.car.DrawingSpec(rectJ.width(), rectJ.height(), this.c.d(), this.K, o(), (int) defpackage.acwp.c(), i, bundle);
        ((defpackage.yqj) E.f()).S("getWindowDrawingSpec for %s (id=%d): token=%s, spec=%s", this.s, java.lang.Integer.valueOf(this.D), parcelable, drawingSpec);
        return drawingSpec;
    }

    @Override // defpackage.jhl
    public final java.lang.String aO() {
        return "ViewProjectionWindowImpl";
    }

    @Override // defpackage.jhl
    public final void aQ(defpackage.jhz jhzVar, boolean z) {
        jhzVar.getClass();
    }

    @Override // defpackage.jhl
    public final void aS(java.io.PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println(this);
        printWriter.println("  windowId=" + this.D);
        android.view.SurfaceControlViewHost.SurfacePackage surfacePackage = this.G;
        java.util.Objects.toString(surfacePackage);
        printWriter.println("  surfacePackage=".concat(java.lang.String.valueOf(surfacePackage)));
        android.window.InputTransferToken inputTransferToken = this.H;
        java.util.Objects.toString(inputTransferToken);
        printWriter.println("  hostToken=".concat(java.lang.String.valueOf(inputTransferToken)));
        printWriter.println("  displayId=" + this.I);
    }

    @Override // defpackage.jhl
    public final void aT(defpackage.jjn jjnVar) {
        jjnVar.getClass();
        if (this.F && this.K == null) {
            this.J = ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(new android.view.SurfaceControl.Builder(), "BlackholeDummySurface_" + this.D), 1, 1));
            android.view.SurfaceControl surfaceControl = this.J;
            surfaceControl.getClass();
            this.K = new android.view.Surface(surfaceControl);
        }
        synchronized (this.t) {
            this.v = 0;
        }
    }

    @Override // defpackage.jhl
    public final void aX(long j) {
        S();
    }

    @Override // defpackage.jhl
    public final boolean aZ() {
        return false;
    }

    @Override // defpackage.jha
    protected final void af() {
        defpackage.ill.d();
    }

    @Override // defpackage.jhr
    public final void ai(android.os.Bundle bundle) {
        bundle.getClass();
        defpackage.ill.d();
        defpackage.yqm yqmVar = E;
        defpackage.ypu ypuVarL = yqmVar.l();
        android.content.ComponentName componentName = this.s;
        int i = this.D;
        ypuVarL.K("setSurfacePackage for %s (id=%d)", componentName, i);
        android.view.SurfaceControlViewHost.SurfacePackage surfacePackageM = bgp$.ExternalSyntheticApiModelOutline0.m(defpackage.ebl.v(bundle, "surface_package", bgp$.ExternalSyntheticApiModelOutline0.m()));
        if (surfacePackageM == null) {
            ((defpackage.yqj) yqmVar.h()).K("setSurfacePackage for %s (id=%d): extracted SurfacePackage is null", componentName, i);
        }
        this.G = surfacePackageM;
        synchronized (this.u) {
            bn();
        }
    }

    @Override // defpackage.jhl
    public final boolean ba() {
        return aG();
    }

    @Override // defpackage.jhr
    public final float x(defpackage.jhm jhmVar, defpackage.jhm jhmVar2) {
        return this.m.a(jhmVar, jhmVar2).a;
    }

    @Override // defpackage.jha
    protected final void Z() {
    }

    @Override // defpackage.jhl
    public final void aP() {
    }

    @Override // defpackage.jhl
    public final void aV() {
    }
}

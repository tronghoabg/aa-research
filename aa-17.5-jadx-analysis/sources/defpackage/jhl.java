package defpackage;

import android.content.ComponentName;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Surface;
import android.view.SurfaceControlViewHost;
import android.window.InputTransferToken;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jhl extends jgs implements jhk {
    private static final yph D = yph.c("CAR.WM.ViewProjWin");
    private volatile SurfaceControlViewHost.SurfacePackage E;
    private volatile InputTransferToken F;
    private volatile int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhl(jkk jkkVar, int i, jhe jheVar, CarRegionId carRegionId, UUID uuid, ComponentName componentName) {
        super(jkkVar, i, jheVar, carRegionId, uuid, componentName, acvt.u(), new jis(jheVar.a()));
        jkkVar.getClass();
        uuid.getClass();
        this.G = -1;
    }

    @Override // defpackage.jhk
    public final Rect I() {
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.j;
        return projectionWindowDecorationParams.h ? new Rect(n()) : new Rect(n().left + projectionWindowDecorationParams.a, n().top + projectionWindowDecorationParams.b, n().right - projectionWindowDecorationParams.c, n().bottom - projectionWindowDecorationParams.d);
    }

    @Override // defpackage.jgs
    protected final void R() {
        SurfaceControlViewHost.SurfacePackage surfacePackage = this.E;
        if (surfacePackage != null) {
            surfacePackage.release();
        }
        this.E = null;
        this.F = null;
    }

    @Override // defpackage.jhk
    public final SurfaceControlViewHost.SurfacePackage S() {
        return this.E;
    }

    @Override // defpackage.jhk
    public final void T(InputTransferToken inputTransferToken, int i) {
        ((ype) D.f()).S("onHostTokenAvailable for %s (id=%d): token=%s, displayId=%d", this.r, Integer.valueOf(this.C), inputTransferToken, Integer.valueOf(i));
        this.G = i;
        this.F = inputTransferToken;
        synchronized (this.s) {
            this.u = 1;
        }
        this.q.f(k(), d());
    }

    @Override // defpackage.jhf
    public final Surface aJ() {
        return null;
    }

    @Override // defpackage.jhf
    public final jhg aK() {
        jhc jhcVar = ((ina) this.c).w;
        if (jhcVar == null) {
            throw new IllegalStateException("WindowManager layoutParams is null during composition");
        }
        float f = n().left;
        float f2 = n().right;
        int i = n().top;
        int i2 = jhcVar.g;
        return new jhg(this, f, i2 - i, f2, i2 - n().bottom);
    }

    @Override // defpackage.jhf
    public final DrawingSpec aL() {
        Parcelable parcelable = this.F;
        if (parcelable == null) {
            return null;
        }
        int i = this.G;
        Bundle bundle = new Bundle();
        bundle.putParcelable("input_transfer_token", parcelable);
        bundle.putInt("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", true != aE() ? 128 : 0);
        Rect rectI = I();
        DrawingSpec drawingSpec = new DrawingSpec(rectI.width(), rectI.height(), this.c.d(), null, o(), (int) acvn.c(), i, bundle);
        ((ype) D.f()).S("getWindowDrawingSpec for %s (id=%d): token=%s, spec=%s", this.r, Integer.valueOf(this.C), parcelable, drawingSpec);
        return drawingSpec;
    }

    @Override // defpackage.jhf
    public final String aM() {
        return "ViewProjectionWindowImpl";
    }

    @Override // defpackage.jhf
    public final void aO(jhs jhsVar, boolean z) {
        jhsVar.getClass();
    }

    @Override // defpackage.jhf
    public final void aQ(PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println(this);
        printWriter.println("  windowId=" + this.C);
        SurfaceControlViewHost.SurfacePackage surfacePackage = this.E;
        Objects.toString(surfacePackage);
        printWriter.println("  surfacePackage=".concat(String.valueOf(surfacePackage)));
        InputTransferToken inputTransferToken = this.F;
        Objects.toString(inputTransferToken);
        printWriter.println("  hostToken=".concat(String.valueOf(inputTransferToken)));
        printWriter.println("  displayId=" + this.G);
    }

    @Override // defpackage.jhf
    public final void aR(jjh jjhVar) {
        jjhVar.getClass();
        synchronized (this.s) {
            this.u = 0;
        }
    }

    @Override // defpackage.jhf
    public final void aV(long j) {
        R();
    }

    @Override // defpackage.jhf
    public final boolean aX() {
        return false;
    }

    @Override // defpackage.jhf
    public final boolean aY() {
        return aE();
    }

    @Override // defpackage.jgs
    protected final void ae() {
        ilb.d();
    }

    @Override // defpackage.jhk
    public final void ah(Bundle bundle) {
        bundle.getClass();
        ilb.d();
        yph yphVar = D;
        yop yopVarL = yphVar.l();
        ComponentName componentName = this.r;
        int i = this.C;
        yopVarL.K("setSurfacePackage for %s (id=%d)", componentName, i);
        SurfaceControlViewHost.SurfacePackage surfacePackageM210m = bgl$$ExternalSyntheticApiModelOutline0.m210m(dlz.g(bundle, "surface_package", bgl$$ExternalSyntheticApiModelOutline0.m216m()));
        if (surfacePackageM210m == null) {
            ((ype) yphVar.h()).K("setSurfacePackage for %s (id=%d): extracted SurfacePackage is null", componentName, i);
        }
        this.E = surfacePackageM210m;
        synchronized (this.t) {
            aq();
        }
    }

    @Override // defpackage.jgs
    protected final boolean ay() {
        return this.E != null;
    }

    @Override // defpackage.jgs, defpackage.jhk
    public final float bi() {
        return this.v;
    }

    @Override // defpackage.jhk
    public final float w(jhg jhgVar, jhg jhgVar2) {
        return this.l.a(jhgVar, jhgVar2).a;
    }

    @Override // defpackage.jgs
    protected final void Y() {
    }

    @Override // defpackage.jhf
    public final void aN() {
    }

    @Override // defpackage.jhf
    public final void aT() {
    }
}

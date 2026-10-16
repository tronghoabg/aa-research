package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.Surface;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jkb {
    public static final yph a = yph.c("CAR.WM.LOADING.BACK");
    public final jkk b;
    public final CarRegionId c;
    public final String d;
    public boolean e;
    public jhf f;
    private Rect g;
    private Rect h;
    private boolean i;
    private int j;

    public jkb(jkk jkkVar, CarRegionId carRegionId) {
        this.b = jkkVar;
        this.c = carRegionId;
        CarDisplayId carDisplayId = carRegionId.h;
        Objects.toString(carDisplayId);
        this.d = "Loading Screen ".concat(String.valueOf(carDisplayId));
        this.j = -16777216;
    }

    public static final Rect f(iuw iuwVar) {
        Size size = iuwVar.m;
        Rect rect = iuwVar.o;
        return new Rect(rect.left, rect.top, size.getWidth() - rect.right, size.getHeight() - rect.bottom);
    }

    public static final Rect g(iuw iuwVar) {
        Size size = iuwVar.m;
        return new Rect(0, size.getHeight(), size.getWidth(), 0);
    }

    public final synchronized void a(Surface surface) {
        int iCenterX;
        if (this.g == null) {
            this.i = true;
            return;
        }
        if (!surface.isValid()) {
            ((ype) a.h()).u("Surface is invalid, skipping render");
            return;
        }
        Canvas canvasLockCanvas = surface.lockCanvas(null);
        canvasLockCanvas.drawColor(Color.argb(1.0f, Color.red(this.j) / 255.0f, Color.green(this.j) / 255.0f, Color.blue(this.j) / 255.0f), PorterDuff.Mode.SRC);
        Rect rect = this.g;
        if (rect == null) {
            affa.d("contentAreaAndroidBounds");
            rect = null;
        }
        rect.width();
        Rect rect2 = this.g;
        if (rect2 == null) {
            affa.d("contentAreaAndroidBounds");
            rect2 = null;
        }
        int iCenterY = rect2.centerY();
        Rect rect3 = this.h;
        if (!acrz.a.gu().i() || rect3 == null) {
            Rect rect4 = this.g;
            if (rect4 == null) {
                affa.d("contentAreaAndroidBounds");
                rect4 = null;
            }
            iCenterX = rect4.centerX();
        } else if (rect3.left == 0) {
            int i = rect3.right;
            Rect rect5 = this.g;
            if (rect5 == null) {
                affa.d("contentAreaAndroidBounds");
                rect5 = null;
            }
            iCenterX = i + ((rect5.right - rect3.right) / 2);
        } else {
            Rect rect6 = this.g;
            if (rect6 == null) {
                affa.d("contentAreaAndroidBounds");
                rect6 = null;
            }
            int i2 = rect6.left;
            int i3 = rect3.left;
            Rect rect7 = this.g;
            if (rect7 == null) {
                affa.d("contentAreaAndroidBounds");
                rect7 = null;
            }
            iCenterX = i2 + ((i3 - rect7.left) / 2);
        }
        Drawable drawableMutate = ((ina) this.b).l.getResources().getDrawable(R.drawable.gs_android_auto_vd_theme_24, null).mutate();
        float[] fArr = new float[3];
        Color.colorToHSV(this.j, fArr);
        float f = fArr[2];
        float f2 = 0.3f * f;
        if (f2 < 0.2f) {
            f2 = 0.2f;
        }
        fArr[2] = f > 0.5f ? f - f2 : f + f2;
        drawableMutate.setTint(Color.HSVToColor(fArr));
        drawableMutate.setBounds(new Rect(iCenterX - 75, iCenterY - 75, iCenterX + 75, iCenterY + 75));
        drawableMutate.draw(canvasLockCanvas);
        surface.unlockCanvasAndPost(canvasLockCanvas);
    }

    public final void b() {
        this.b.M(new jgw(this, 6));
    }

    public final void c(int i) {
        this.j = i;
        if (this.f != null) {
            b();
        }
    }

    public final void d(iuw iuwVar, UUID uuid) {
        e(g(iuwVar), f(iuwVar), uuid, true, iuwVar.p);
    }

    public final synchronized void e(Rect rect, Rect rect2, UUID uuid, boolean z, List list) {
        jhf jhfVar;
        a.l().S("updateWindowParams(%s, %s, %s, %b)", rect, rect2, uuid, Boolean.valueOf(z));
        this.g = rect2;
        this.h = (Rect) woy.bH(list);
        if (!z) {
            if (this.i) {
                this.i = false;
                b();
                return;
            }
            return;
        }
        int iWidth = rect.width();
        int i = rect.top - rect.bottom;
        jhf jhfVar2 = this.f;
        if (jhfVar2 == null) {
            affa.d("projectionWindow");
            jhfVar2 = null;
            jhfVar = null;
        } else {
            jhfVar = null;
        }
        int i2 = rect.left;
        int i3 = rect.bottom;
        jhf jhfVar3 = this.f;
        if (jhfVar3 == null) {
            affa.d("projectionWindow");
            jhfVar3 = jhfVar;
        }
        int iH = jhfVar3.h();
        jhf jhfVar4 = this.f;
        if (jhfVar4 == null) {
            affa.d("projectionWindow");
            jhfVar4 = jhfVar;
        }
        Rect rectU = jhfVar4.u();
        jhf jhfVar5 = this.f;
        if (jhfVar5 == null) {
            affa.d("projectionWindow");
            jhfVar5 = jhfVar;
        }
        int iF = jhfVar5.f();
        jhf jhfVar6 = this.f;
        if (jhfVar6 == null) {
            affa.d("projectionWindow");
            jhfVar6 = jhfVar;
        }
        int iE = jhfVar6.e();
        jhf jhfVar7 = this.f;
        if (jhfVar7 == null) {
            affa.d("projectionWindow");
            jhfVar7 = jhfVar;
        }
        jid jidVarY = jhfVar7.y();
        jhf jhfVar8 = this.f;
        if (jhfVar8 == null) {
            affa.d("projectionWindow");
            jhfVar8 = jhfVar;
        }
        jid jidVarZ = jhfVar8.z();
        jhf jhfVar9 = this.f;
        if (jhfVar9 == null) {
            affa.d("projectionWindow");
            jhfVar9 = jhfVar;
        }
        int i4 = jhfVar9.x().k;
        jhf jhfVar10 = this.f;
        if (jhfVar10 == null) {
            affa.d("projectionWindow");
            jhfVar10 = jhfVar;
        }
        int i5 = jhfVar10.x().l;
        jhf jhfVar11 = this.f;
        if (jhfVar11 == null) {
            affa.d("projectionWindow");
            jhfVar11 = null;
        }
        yfq yfqVarD = jhfVar11.D();
        jhf jhfVar12 = this.f;
        if (jhfVar12 == null) {
            affa.d("projectionWindow");
            jhfVar12 = null;
        }
        ProjectionWindowDecorationParams projectionWindowDecorationParamsB = jhfVar12.B();
        jhf jhfVar13 = this.f;
        if (jhfVar13 == null) {
            affa.d("projectionWindow");
            jhfVar13 = null;
        }
        jhfVar2.m(i2, i3, iWidth, i, iH, rectU, iF, iE, jidVarY, jidVarZ, i4, i5, yfqVarD, projectionWindowDecorationParamsB, uuid, jhfVar13.r());
        this.i = false;
        b();
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jki {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM.LOADING.BACK");
    public final defpackage.jkr b;
    public final com.google.android.gms.car.display.CarRegionId c;
    public final java.lang.String d;
    public boolean e;
    public defpackage.jhl f;
    private android.graphics.Rect g;
    private android.graphics.Rect h;
    private boolean i;
    private int j;

    public jki(defpackage.jkr jkrVar, com.google.android.gms.car.display.CarRegionId carRegionId) {
        this.b = jkrVar;
        this.c = carRegionId;
        com.google.android.gms.car.display.CarDisplayId carDisplayId = carRegionId.h;
        java.util.Objects.toString(carDisplayId);
        this.d = "Loading Screen ".concat(java.lang.String.valueOf(carDisplayId));
        this.j = -16777216;
    }

    public static final android.graphics.Rect f(defpackage.ive iveVar) {
        android.util.Size size = iveVar.m;
        android.graphics.Rect rect = iveVar.o;
        return new android.graphics.Rect(rect.left, rect.top, size.getWidth() - rect.right, size.getHeight() - rect.bottom);
    }

    public static final android.graphics.Rect g(defpackage.ive iveVar) {
        android.util.Size size = iveVar.m;
        return new android.graphics.Rect(0, size.getHeight(), size.getWidth(), 0);
    }

    public final synchronized void a(android.view.Surface surface) {
        int iCenterX;
        if (this.g == null) {
            this.i = true;
            return;
        }
        if (!surface.isValid()) {
            ((defpackage.yqj) a.h()).u("Surface is invalid, skipping render");
            return;
        }
        android.graphics.Canvas canvasLockCanvas = surface.lockCanvas(null);
        canvasLockCanvas.drawColor(ep$.ExternalSyntheticApiModelOutline1.m(1.0f, android.graphics.Color.red(this.j) / 255.0f, android.graphics.Color.green(this.j) / 255.0f, android.graphics.Color.blue(this.j) / 255.0f), android.graphics.PorterDuff.Mode.SRC);
        android.graphics.Rect rect = this.g;
        if (rect == null) {
            defpackage.afga.d("contentAreaAndroidBounds");
            rect = null;
        }
        rect.width();
        android.graphics.Rect rect2 = this.g;
        if (rect2 == null) {
            defpackage.afga.d("contentAreaAndroidBounds");
            rect2 = null;
        }
        int iCenterY = rect2.centerY();
        android.graphics.Rect rect3 = this.h;
        if (!defpackage.actb.a.fF().h() || rect3 == null) {
            android.graphics.Rect rect4 = this.g;
            if (rect4 == null) {
                defpackage.afga.d("contentAreaAndroidBounds");
                rect4 = null;
            }
            iCenterX = rect4.centerX();
        } else if (rect3.left == 0) {
            int i = rect3.right;
            android.graphics.Rect rect5 = this.g;
            if (rect5 == null) {
                defpackage.afga.d("contentAreaAndroidBounds");
                rect5 = null;
            }
            iCenterX = i + ((rect5.right - rect3.right) / 2);
        } else {
            android.graphics.Rect rect6 = this.g;
            if (rect6 == null) {
                defpackage.afga.d("contentAreaAndroidBounds");
                rect6 = null;
            }
            int i2 = rect6.left;
            int i3 = rect3.left;
            android.graphics.Rect rect7 = this.g;
            if (rect7 == null) {
                defpackage.afga.d("contentAreaAndroidBounds");
                rect7 = null;
            }
            iCenterX = i2 + ((i3 - rect7.left) / 2);
        }
        android.graphics.drawable.Drawable drawableMutate = ((defpackage.inh) this.b).l.getResources().getDrawable(2131231574, null).mutate();
        float[] fArr = new float[3];
        android.graphics.Color.colorToHSV(this.j, fArr);
        float f = fArr[2];
        float f2 = 0.3f * f;
        if (f2 < 0.2f) {
            f2 = 0.2f;
        }
        fArr[2] = f > 0.5f ? f - f2 : f + f2;
        drawableMutate.setTint(android.graphics.Color.HSVToColor(fArr));
        drawableMutate.setBounds(new android.graphics.Rect(iCenterX - 75, iCenterY - 75, iCenterX + 75, iCenterY + 75));
        drawableMutate.draw(canvasLockCanvas);
        surface.unlockCanvasAndPost(canvasLockCanvas);
    }

    public final void b() {
        this.b.M(new defpackage.jpa(this, 1, null));
    }

    public final void c(int i) {
        this.j = i;
        if (this.f != null) {
            b();
        }
    }

    public final void d(defpackage.ive iveVar, java.util.UUID uuid) {
        e(g(iveVar), f(iveVar), uuid, true, iveVar.p);
    }

    public final synchronized void e(android.graphics.Rect rect, android.graphics.Rect rect2, java.util.UUID uuid, boolean z, java.util.List list) {
        defpackage.jhl jhlVar;
        a.l().S("updateWindowParams(%s, %s, %s, %b)", rect, rect2, uuid, java.lang.Boolean.valueOf(z));
        this.g = rect2;
        this.h = (android.graphics.Rect) defpackage.afga.aB(list);
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
        defpackage.jhl jhlVar2 = this.f;
        if (jhlVar2 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar2 = null;
            jhlVar = null;
        } else {
            jhlVar = null;
        }
        int i2 = rect.left;
        int i3 = rect.bottom;
        defpackage.jhl jhlVar3 = this.f;
        if (jhlVar3 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar3 = jhlVar;
        }
        int iH = jhlVar3.h();
        defpackage.jhl jhlVar4 = jhlVar;
        defpackage.jhl jhlVar5 = this.f;
        if (jhlVar5 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar5 = jhlVar4;
        }
        android.graphics.Rect rectV = jhlVar5.v();
        defpackage.jhl jhlVar6 = this.f;
        if (jhlVar6 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar6 = jhlVar4;
        }
        jhq jhqVar = new jhq(rectV, jhlVar6.r());
        defpackage.jhl jhlVar7 = this.f;
        if (jhlVar7 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar7 = jhlVar4;
        }
        int iF = jhlVar7.f();
        defpackage.jhl jhlVar8 = this.f;
        if (jhlVar8 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar8 = jhlVar4;
        }
        int iE = jhlVar8.e();
        defpackage.jhl jhlVar9 = this.f;
        if (jhlVar9 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar9 = jhlVar4;
        }
        defpackage.jik jikVarZ = jhlVar9.z();
        defpackage.jhl jhlVar10 = this.f;
        if (jhlVar10 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar10 = jhlVar4;
        }
        defpackage.jik jikVarA = jhlVar10.A();
        defpackage.jhl jhlVar11 = this.f;
        if (jhlVar11 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar11 = jhlVar4;
        }
        int i4 = jhlVar11.y().k;
        defpackage.jhl jhlVar12 = this.f;
        if (jhlVar12 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar12 = jhlVar4;
        }
        int i5 = jhlVar12.y().l;
        defpackage.jhl jhlVar13 = this.f;
        if (jhlVar13 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar13 = null;
        }
        defpackage.ygw ygwVarE = jhlVar13.E();
        defpackage.jhl jhlVar14 = this.f;
        if (jhlVar14 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar14 = null;
        }
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParamsC = jhlVar14.C();
        defpackage.jhl jhlVar15 = this.f;
        if (jhlVar15 == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar15 = null;
        }
        jhlVar2.m(i2, i3, iWidth, i, iH, jhqVar, iF, iE, jikVarZ, jikVarA, i4, i5, ygwVarE, projectionWindowDecorationParamsC, uuid, jhlVar15.s());
        this.i = false;
        b();
    }
}

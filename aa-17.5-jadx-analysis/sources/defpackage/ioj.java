package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ioj extends ing {
    public final jhf F;
    public raw G;
    public Rect H;
    final ioi I;
    private rcb K;
    private boolean L;
    private static final yph J = yph.c("CAR.CAM.FALLBACK");
    public static final inf E = new ior(1);

    public ioj(iob iobVar, ioc iocVar, jkk jkkVar, CarRegionId carRegionId, Rect rect, Rect rect2, int i, int i2, int i3, UUID uuid) {
        super(iobVar, iocVar, new ComponentName(iobVar.d, (Class<?>) ioj.class), jkkVar, carRegionId);
        ioi ioiVar = new ioi(this);
        this.I = ioiVar;
        jkk jkkVar2 = this.y;
        jkc jkcVar = new jkc();
        jkcVar.n(carRegionId);
        jkcVar.l(1);
        jkcVar.m(i3);
        jkcVar.d(rect);
        jkcVar.g(rect2);
        jkcVar.e(ioiVar);
        jkcVar.j(iobVar.m(carRegionId));
        jkcVar.i(i);
        jkcVar.h(i2);
        jkcVar.b(uuid);
        this.F = jkkVar2.j(jkcVar.a());
    }

    private static final int O(Configuration configuration) {
        return (!ecw.i() || (configuration.uiMode & 48) == 32) ? R.style.Theme_Gearhead_Coolwalk_Dark : R.style.Theme_Gearhead_Coolwalk_Light;
    }

    @Override // defpackage.ing
    public final void A(CarActivityLayoutParams carActivityLayoutParams, UUID uuid) {
        ilb.d();
        int i = carActivityLayoutParams.c;
        int i2 = carActivityLayoutParams.d;
        Rect rect = new Rect(i, i2, carActivityLayoutParams.a + i, carActivityLayoutParams.b + i2);
        jhf jhfVar = this.F;
        jhfVar.ap();
        M();
        this.y.f(jhfVar, rect, carActivityLayoutParams.f, carActivityLayoutParams.j, carActivityLayoutParams.k, carActivityLayoutParams.e, carActivityLayoutParams.a(), uuid, carActivityLayoutParams.g);
        N();
        jhfVar.K();
    }

    @Override // defpackage.ing
    public final void B(Rect rect) {
        ilb.d();
        this.F.as(rect);
    }

    @Override // defpackage.ing
    public final boolean G() {
        return this.L;
    }

    public final void M() {
        raw rawVar = this.G;
        if (rawVar != null) {
            rawVar.dismiss();
            this.G = null;
        }
        rcb rcbVar = this.K;
        if (rcbVar != null) {
            rcbVar.b();
            this.K = null;
        }
    }

    public final void N() {
        ((ype) J.l().ai((char) 824)).u("Creating fallback presentation");
        jkk jkkVar = this.y;
        CarRegionId carRegionId = this.z;
        jhf jhfVar = this.F;
        jkkVar.aa(carRegionId, jhfVar);
        iob iobVar = this.b;
        Context context = iobVar.d;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        DrawingSpec drawingSpecAL = jhfVar.aL();
        drawingSpecAL.getClass();
        rcb rcbVar = new rcb(displayManager, context.getPackageName(), drawingSpecAL.a, drawingSpecAL.b, drawingSpecAL.c, 0, drawingSpecAL.d, -1, new rca() { // from class: iog
            @Override // defpackage.rca
            public final void a(Surface surface) {
                this.a.F.aT();
            }
        });
        this.K = rcbVar;
        Display display = rcbVar.a;
        rat ratVarA = rau.a();
        ratVarA.h(false);
        ratVarA.g(acxa.aw());
        raw rawVarH = raw.h(context, display, 0, null, true, ratVarA.a());
        this.G = rawVarH;
        Rect rect = this.H;
        if (rect != null) {
            rawVarH.v(rect);
        }
        this.G.getContext().setTheme(O(iobVar.c(carRegionId.h)));
        this.G.setContentView(R.layout.car_fallback_layout);
        ((ImageView) this.G.findViewById(R.id.fallback_image)).setImageResource(R.drawable.gs_warning_vd_theme_24);
        this.G.show();
    }

    @Override // defpackage.ing
    public final jhf d() {
        return this.F;
    }

    @Override // defpackage.ing
    public final void l() {
        super.l();
        M();
    }

    @Override // defpackage.ing
    public final void r(Configuration configuration, int i) {
        if (this.G == null || !ecw.i()) {
            return;
        }
        Context context = this.G.getContext();
        context.setTheme(O(configuration));
        if (acxa.aw()) {
            this.G.w(configuration);
        }
        this.G.findViewById(R.id.fallback_root).setBackground(this.G.getResources().getDrawable(R.drawable.fallback_activity_background, context.getTheme()));
        ((TextView) this.G.findViewById(R.id.fallback_error)).setTextColor(spu.aL(context, android.R.attr.textColorPrimary));
        ((ImageView) this.G.findViewById(R.id.fallback_image)).setImageTintList(context.getColorStateList(R.color.error_icon_tint));
    }

    @Override // defpackage.ing
    public final void s(ing ingVar) {
        super.s(ingVar);
        this.b.u(this);
    }

    @Override // defpackage.ing
    public final void t() {
        ((ina) this.y).ak(this.F, 0);
    }

    @Override // defpackage.ing
    public final void u() {
        super.u();
        M();
        this.L = false;
    }

    @Override // defpackage.ing
    public final void w(inu inuVar) {
        super.w(inuVar);
        Rect rect = inuVar.a.k;
        if (rect != null && this.H == null) {
            this.H = rect;
        }
        jhf jhfVar = this.F;
        if (jhfVar.aL() != null && this.G == null) {
            N();
        } else if (jhfVar.aD()) {
            ((ina) this.y).ak(jhfVar, 0);
        }
        iob iobVar = this.b;
        iobVar.z(this);
        iobVar.w(this);
    }

    @Override // defpackage.ing
    public final void y(ing ingVar) {
        super.y(ingVar);
        this.L = true;
        iob iobVar = this.b;
        iobVar.u(this);
        ((ina) this.y).R(this.F, null, null, true, true, false, null);
        iobVar.A(this);
        if (ingVar != null) {
            iobVar.av(this, null);
        }
    }
}

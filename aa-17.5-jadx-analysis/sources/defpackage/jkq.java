package defpackage;

import android.graphics.Rect;
import android.util.Size;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.util.Optional;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jkq {
    public static final yph a = yph.c("CAR.WM.WATERMARK");
    public jhf b;
    private final jkk e;
    private final jes f;
    private final jfg g;
    private final xyc d = wub.L(new imq(7));
    public Size c = null;

    public jkq(jkk jkkVar, jes jesVar, jfg jfgVar) {
        this.e = jkkVar;
        this.f = jesVar;
        this.g = jfgVar;
    }

    public final void a(jhc jhcVar, CarRegionId carRegionId, UUID uuid) {
        Optional optionalX = ((ima) this.f).X();
        optionalX.isPresent();
        CarInfoInternal carInfoInternal = ((iuc) optionalX.get()).r;
        long j = carInfoInternal != null ? carInfoInternal.q : -1L;
        boolean zContains = ((ygr) this.d.gu()).contains(Long.valueOf(j));
        ((ype) ((ype) a.f()).ai(2266)).I("Using cert serial number (0x%x) to determine watermark visibility. showWatermark: %b", j, zContains);
        this.g.e(yzz.CAR_SERVICE, zContains ? yzy.uh : yzy.ui);
        if (zContains) {
            jkk jkkVar = this.e;
            jkc jkcVar = new jkc();
            jkcVar.n(carRegionId);
            jkcVar.l(7);
            jkcVar.m(1000);
            iuw iuwVar = jhcVar.a;
            int i = iuwVar.g;
            int i2 = iuwVar.h;
            int i3 = iuwVar.e;
            int i4 = iuwVar.f;
            jkcVar.d(new Rect(i, i2, i + i3, i2 + i4));
            jkcVar.g(iuwVar.n);
            jkcVar.e(new jkp(this, jkkVar));
            jkcVar.b(uuid);
            jhf jhfVarJ = jkkVar.j(jkcVar.a());
            this.b = jhfVarJ;
            if (jhfVarJ != null) {
                jhfVarJ.aI();
            }
            this.c = new Size(i3, i4);
        }
    }

    public final void b() {
        jhf jhfVar = this.b;
        if (jhfVar != null) {
            ((ina) this.e).R(jhfVar, null, null, true, true, false, null);
        }
        this.c = null;
    }
}

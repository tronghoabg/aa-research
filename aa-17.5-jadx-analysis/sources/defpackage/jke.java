package defpackage;

import android.graphics.Rect;
import com.google.android.gms.car.display.CarRegionId;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jke {
    public static final yph a = yph.c("CAR.CarDisplayInfo");
    public jhf b;
    private final jkk c;

    public jke(jkk jkkVar) {
        this.c = jkkVar;
    }

    public static int a(float f, int i) {
        return Math.round((f * 160.0f) / i);
    }

    public final void b(jhc jhcVar, CarRegionId carRegionId, UUID uuid) {
        if (acvt.a.gu().t()) {
            jkk jkkVar = this.c;
            jkc jkcVar = new jkc();
            jkcVar.n(carRegionId);
            jkcVar.l(7);
            jkcVar.m(999);
            jkcVar.f(192);
            iuw iuwVar = jhcVar.a;
            int i = iuwVar.g;
            int i2 = iuwVar.h;
            jkcVar.d(new Rect(i, i2, iuwVar.e + i, iuwVar.f + i2));
            jkcVar.g(iuwVar.n);
            jkcVar.e(new jkd(jkkVar));
            jkcVar.b(uuid);
            jhf jhfVarJ = jkkVar.j(jkcVar.a());
            this.b = jhfVarJ;
            if (jhfVarJ != null) {
                jhfVarJ.aI();
            }
        }
    }

    public final void c() {
        jhf jhfVar = this.b;
        if (jhfVar != null) {
            ((ina) this.c).R(jhfVar, null, null, true, true, false, null);
        }
    }
}

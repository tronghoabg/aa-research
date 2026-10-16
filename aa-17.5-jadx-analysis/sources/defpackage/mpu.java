package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
class mpu implements mps {
    private final boolean a;

    public mpu(boolean z) {
        this.a = z;
    }

    @Override // defpackage.mps
    public final ComponentName a() {
        if (!this.a) {
            return null;
        }
        nsw nswVar = (nsw) mki.a.i(nsw.class);
        CarDisplayId carDisplayId = CarDisplayId.a;
        nsv nsvVarD = nswVar.d(carDisplayId);
        if ((nsvVarD == nsv.a || nsvVarD == nsv.g || nsvVarD == nsv.h) && !((nsw) mki.a.i(nsw.class)).i(carDisplayId)) {
            return null;
        }
        return mkn.B;
    }

    @Override // defpackage.mps
    public final Intent b(qrn qrnVar) {
        ComponentName componentNameA = map.a(qrnVar, false);
        Intent component = componentNameA == null ? new Intent().setComponent(a()) : map.d(componentNameA) ? ((jwi) mki.a.i(jwi.class)).a(componentNameA) : new Intent().setComponent(componentNameA);
        ComponentName component2 = component.getComponent();
        boolean z = this.a;
        if (component2 == null) {
            if (z) {
                component.setComponent(mkn.B);
                return component;
            }
        } else if (z != ((lgw) mki.a.i(lgw.class)).i(new mqb(component2))) {
            return new Intent();
        }
        return component;
    }

    @Override // defpackage.mps
    public final /* synthetic */ yfq c() {
        int i = yfq.d;
        return yls.a;
    }
}

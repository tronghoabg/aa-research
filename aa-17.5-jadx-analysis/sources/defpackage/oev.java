package defpackage;

import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final class oev implements mpb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public oev(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mpb
    public final void b(Intent intent, CarRegionId carRegionId) {
        if (this.b != 0) {
            if (CarRegionId.a.equals(carRegionId)) {
                ((eqj) this.a).m(intent.getComponent());
                return;
            }
            return;
        }
        if (!mkn.y.equals(intent.getComponent()) && CarDisplayId.b(carRegionId.h)) {
            mpd.b().j(this);
            Handler handler = ((ofb) this.a).e;
            handler.getClass();
            handler.postDelayed(new oez(this, 1), acqd.d());
        }
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void a(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void e(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void f(Intent intent, CarRegionId carRegionId) {
    }
}

package defpackage;

import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final class qfj extends ovb {
    public static final yph a = yph.c("ADU.CarRegionController");
    public static final Long b = 100L;
    public qtu c;
    public final tmb d = new tme();
    public Long e = -1L;
    private final CarRegionId f;

    public qfj(CarRegionId carRegionId) {
        this.f = carRegionId;
    }

    @Override // defpackage.ovc
    public final void e() {
        CarRegionId carRegionId = this.f;
        CarDisplayId carDisplayId = carRegionId.h;
        if (!CarDisplayId.b(carDisplayId)) {
            ((ype) a.l().ai((char) 7051)).u("Only the primary display can request to close overlays");
            return;
        }
        qtu qtuVar = this.c;
        if (qtuVar == null) {
            ((ype) a.l().ai((char) 7050)).u("AppDecorService is not connected, unable to request overlay closure");
            this.e = Long.valueOf(SystemClock.elapsedRealtime());
            return;
        }
        try {
            rab rabVarG = qtuVar.g(carDisplayId.b, carRegionId.g);
            if (rabVarG == null) {
                ((ype) a.l().ai(7049)).u("SystemUiService is null");
            } else {
                rabVarG.e();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.ovc
    public final boolean f() {
        CarRegionId carRegionId = this.f;
        CarDisplayId carDisplayId = carRegionId.h;
        if (!CarDisplayId.b(carDisplayId)) {
            ((ype) a.l().ai((char) 7046)).u("Only the primary display can check if it can close overlays");
            return false;
        }
        qtu qtuVar = this.c;
        if (qtuVar == null) {
            ((ype) a.l().ai((char) 7045)).u("AppDecorService is not connected, unable to check on overlays");
            return false;
        }
        try {
            rab rabVarG = qtuVar.g(carDisplayId.b, carRegionId.g);
            if (rabVarG != null) {
                return rabVarG.i();
            }
            ((ype) a.l().ai(7044)).u("SystemUiService is null");
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}

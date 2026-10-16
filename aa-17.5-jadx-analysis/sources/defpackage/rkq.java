package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class rkq extends rjt {
    private final qzf a;
    private final UUID b;

    public rkq(qzf qzfVar, UUID uuid) {
        this.a = qzfVar;
        this.b = uuid;
    }

    @Override // defpackage.rjt
    public final yfq a() {
        int iE;
        Point pointF;
        CarDisplayId carDisplayId = CarDisplayId.a;
        int iOrdinal = rji.a.ordinal();
        try {
            iE = this.a.e();
        } catch (RemoteException unused) {
            iE = 0;
        }
        try {
            pointF = this.a.f();
        } catch (RemoteException unused2) {
            pointF = null;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        int i = yfq.d;
        return yfq.q(new CarDisplay(carDisplayId, iOrdinal, iE, pointF, rect, rect2, yls.a, rjj.a.ordinal(), this.b.toString(), null));
    }

    @Override // defpackage.rjt
    public final boolean b() {
        return false;
    }
}

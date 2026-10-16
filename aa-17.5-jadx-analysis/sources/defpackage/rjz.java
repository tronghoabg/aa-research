package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final class rjz extends ijo implements rka {
    private final yfy a;

    public rjz(yfy yfyVar) {
        super("com.google.android.gms.car.display.manager.ICarDisplayActionsController");
        woy.aa(!yfyVar.isEmpty(), "No car displays are attached. Displays have not been discovered or car is disconnected/disconnecting.");
        this.a = yfyVar;
    }

    public final iva a(CarDisplayId carDisplayId) {
        iuu iuuVar = (iuu) this.a.get(carDisplayId);
        iuuVar.getClass();
        iva ivaVar = iuuVar.o;
        ivaVar.getClass();
        return ivaVar;
    }

    @Override // defpackage.rka
    public final void e(CarDisplayId carDisplayId) {
        woy.ad(carDisplayId.equals(CarDisplayId.a), "requestResizeDisplayLarger must be called on the primary display, not valid for carDisplayId: %s.", carDisplayId);
        rbe.h(new hhw(this, carDisplayId, 9));
    }

    @Override // defpackage.rka
    public final void f(CarDisplayId carDisplayId) {
        woy.ad(carDisplayId.equals(CarDisplayId.a), "requestResizeDisplaySmaller must be called on the primary display, not valid for carDisplayId: %s.", carDisplayId);
        rbe.h(new hhw(this, carDisplayId, 10));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            CarDisplayId carDisplayId = (CarDisplayId) ijp.a(parcel, CarDisplayId.CREATOR);
            ijp.d(parcel);
            f(carDisplayId);
            return true;
        }
        if (i != 3) {
            return false;
        }
        CarDisplayId carDisplayId2 = (CarDisplayId) ijp.a(parcel, CarDisplayId.CREATOR);
        ijp.d(parcel);
        e(carDisplayId2);
        return true;
    }
}

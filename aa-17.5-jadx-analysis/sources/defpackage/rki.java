package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class rki extends ijo implements rkj {
    private final yfy a;
    private final boolean b;

    public rki(yfy yfyVar, boolean z) {
        super("com.google.android.gms.car.display.manager.ICarDisplayManager");
        woy.aa(!yfyVar.isEmpty(), "No car displays are attached. Displays have not been discovered or car is disconnected/disconnecting.");
        this.b = z;
        this.a = yfyVar;
    }

    @Override // defpackage.rkj
    public final rjx e(CarDisplayId carDisplayId) {
        iuu iuuVar = (iuu) this.a.get(carDisplayId);
        if (iuuVar != null) {
            return iuuVar.r;
        }
        throw new IllegalStateException("No CarDisplayService found for display id: " + carDisplayId.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rkj
    public final List f() {
        ArrayList arrayList = new ArrayList();
        ynp ynpVarListIterator = ((yfq) this.a.values()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            arrayList.add(((iuu) ynpVarListIterator.next()).r.g());
        }
        return arrayList;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            List listF = f();
            parcel2.writeNoException();
            parcel2.writeTypedList(listF);
            return true;
        }
        if (i == 3) {
            CarDisplayId carDisplayId = (CarDisplayId) ijp.a(parcel, CarDisplayId.CREATOR);
            ijp.d(parcel);
            rjx rjxVarE = e(carDisplayId);
            parcel2.writeNoException();
            ijp.i(parcel2, rjxVarE);
            return true;
        }
        if (i != 4) {
            return false;
        }
        boolean z = this.b;
        parcel2.writeNoException();
        ClassLoader classLoader = ijp.a;
        parcel2.writeInt(z ? 1 : 0);
        return true;
    }

    @Override // defpackage.rkj
    public final boolean g() {
        return this.b;
    }
}

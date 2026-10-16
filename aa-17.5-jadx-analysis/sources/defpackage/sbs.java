package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* loaded from: classes2.dex */
public final class sbs extends ijo implements sbt {
    final /* synthetic */ CarSetupServiceImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbs(CarSetupServiceImpl carSetupServiceImpl) {
        super("com.google.android.gms.carsetup.ICarSetupBinder");
        this.a = carSetupServiceImpl;
    }

    @Override // defpackage.sbt
    public final qwl e() {
        CarSetupServiceImpl carSetupServiceImpl = this.a;
        if (carSetupServiceImpl.s == null) {
            carSetupServiceImpl.s = new rsk();
            ruw ruwVar = carSetupServiceImpl.d;
            if (ruwVar != null) {
                ruwVar.h(carSetupServiceImpl.s);
            }
        }
        return carSetupServiceImpl.s;
    }

    @Override // defpackage.sbt
    public final void f() {
        CarSetupServiceImpl carSetupServiceImpl = this.a;
        ruw ruwVar = carSetupServiceImpl.d;
        if (ruwVar != null) {
            ruwVar.h(null);
        }
        carSetupServiceImpl.s = null;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            qwl qwlVarE = e();
            parcel2.writeNoException();
            ijp.i(parcel2, qwlVarE);
        } else if (i == 2) {
            f();
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            CarSetupServiceImpl carSetupServiceImpl = this.a;
            if (carSetupServiceImpl.g.a == 0) {
                carSetupServiceImpl.g.b();
            }
            int i2 = carSetupServiceImpl.g.a;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        }
        return true;
    }
}

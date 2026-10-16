package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rwl extends ijo implements rwm {
    public final /* synthetic */ sgx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwl(sgx sgxVar) {
        super("com.google.android.gms.car.startup.ICarServiceCallback");
        this.a = sgxVar;
    }

    @Override // defpackage.rwm
    public final void e(boolean z) {
        ypf ypfVar = sgx.a;
        if (z) {
            return;
        }
        sgx.a.h().ai(8936).u("startAdditionalServices failed");
        sgx sgxVar = this.a;
        sgxVar.d.post(new rzy(sgxVar.h, 17));
        sgxVar.a();
    }

    @Override // defpackage.rwm
    public final void f(boolean z) {
        ypf ypfVar = sgx.a;
        ypfVar.f().ai(8937).y("onStartRequiredServicesComplete: success=%b", Boolean.valueOf(z));
        if (z) {
            sgx sgxVar = this.a;
            sgxVar.d.post(new rsv(this, 16));
        } else {
            ypfVar.h().ai(8938).u("startRequiredServices failed");
            sgx sgxVar2 = this.a;
            sgxVar2.d.post(new rzy(this, 18));
            sgxVar2.a();
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            f(true);
        } else if (i == 2) {
            boolean zJ = ijp.j(parcel);
            ijp.d(parcel);
            f(zJ);
        } else {
            if (i != 3) {
                return false;
            }
            boolean zJ2 = ijp.j(parcel);
            ijp.d(parcel);
            e(zJ2);
        }
        parcel2.writeNoException();
        return true;
    }
}

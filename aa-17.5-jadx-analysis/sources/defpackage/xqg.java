package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gearhead.demand.DemandClientService;

/* loaded from: classes.dex */
public final class xqg extends ijo implements xqh {
    final /* synthetic */ DemandClientService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqg(DemandClientService demandClientService) {
        super("com.google.android.projection.sdk.demand.IDemandSpace");
        this.a = demandClientService;
    }

    @Override // defpackage.xqh
    public final void e(Bundle bundle) {
        DemandClientService demandClientService = this.a;
        demandClientService.c.post(new qfa(demandClientService, bundle, 9));
    }

    @Override // defpackage.xqh
    public final void f(xqe xqeVar) {
        DemandClientService demandClientService = this.a;
        demandClientService.c.post(new qfa((Object) demandClientService, (Object) xqeVar, 11, (byte[]) null));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        xqe xqcVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.projection.sdk.demand.ICallbacks");
                xqcVar = iInterfaceQueryLocalInterface instanceof xqe ? (xqe) iInterfaceQueryLocalInterface : new xqc(strongBinder);
            }
            ijp.d(parcel);
            f(xqcVar);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.projection.sdk.demand.ICallbacks");
                xqcVar = iInterfaceQueryLocalInterface2 instanceof xqe ? (xqe) iInterfaceQueryLocalInterface2 : new xqc(strongBinder2);
            }
            ijp.d(parcel);
            g(xqcVar);
        } else if (i == 3) {
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.projection.sdk.demand.ICallbacks");
                if (iInterfaceQueryLocalInterface3 instanceof xqe) {
                }
            }
            ijp.d(parcel);
        } else if (i == 4) {
            DemandClientService demandClientService = this.a;
            demandClientService.c.post(new qct(demandClientService, 14));
        } else {
            if (i != 5) {
                return false;
            }
            Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
            ijp.d(parcel);
            e(bundle);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.xqh
    public final void g(xqe xqeVar) {
        DemandClientService demandClientService = this.a;
        demandClientService.c.post(new qfa((Object) demandClientService, (Object) xqeVar, 10, (byte[]) null));
    }
}

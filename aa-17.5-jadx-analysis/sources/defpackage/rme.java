package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.display.CarRegionId;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class rme extends ijo implements rmf {
    private final WeakReference a;

    public rme(rlz rlzVar) {
        super("com.google.android.gms.car.input.ICarProjectionInputService");
        this.a = new WeakReference(rlzVar);
    }

    @Override // defpackage.rmf
    public final void e() {
        rlz rlzVar = (rlz) this.a.get();
        if (rlzVar != null) {
            rlzVar.a.post(new ral(rlzVar, 19));
        }
    }

    @Override // defpackage.rmf
    public final void f(rmi rmiVar) {
        rlz rlzVar = (rlz) this.a.get();
        if (rlzVar != null) {
            rlzVar.a.post(new rfc(rlzVar, rmiVar, 13, null));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        rml rmjVar = null;
        rml rmjVar2 = null;
        rmi rmgVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.input.IProxyInputConnection");
                rmjVar = iInterfaceQueryLocalInterface instanceof rml ? (rml) iInterfaceQueryLocalInterface : new rmj(strongBinder);
            }
            EditorInfo editorInfo = (EditorInfo) ijp.a(parcel, EditorInfo.CREATOR);
            ijp.j(parcel);
            ijp.d(parcel);
            g(rmjVar, editorInfo, CarRegionId.a);
        } else if (i == 2) {
            e();
        } else if (i == 3) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.input.ICarProjectionInputServiceCallback");
                rmgVar = iInterfaceQueryLocalInterface2 instanceof rmi ? (rmi) iInterfaceQueryLocalInterface2 : new rmg(strongBinder2);
            }
            ijp.d(parcel);
            f(rmgVar);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.input.IProxyInputConnection");
                rmjVar2 = iInterfaceQueryLocalInterface3 instanceof rml ? (rml) iInterfaceQueryLocalInterface3 : new rmj(strongBinder3);
            }
            EditorInfo editorInfo2 = (EditorInfo) ijp.a(parcel, EditorInfo.CREATOR);
            ijp.j(parcel);
            CarRegionId carRegionId = (CarRegionId) ijp.a(parcel, CarRegionId.CREATOR);
            ijp.d(parcel);
            g(rmjVar2, editorInfo2, carRegionId);
        }
        return true;
    }

    @Override // defpackage.rmf
    public final void g(rml rmlVar, EditorInfo editorInfo, CarRegionId carRegionId) throws RemoteException {
        rlz rlzVar = (rlz) this.a.get();
        if (rlzVar != null) {
            rlzVar.a.post(new xx(rlzVar, rmlVar, editorInfo, carRegionId, 20));
        }
    }
}

package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.diagnostics.ConnectionState;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class riz extends ijn implements rjb {
    public riz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.diagnostics.ICarDiagnostics");
    }

    @Override // defpackage.rjb
    public final List a() throws RemoteException {
        Parcel parcelGi = gi(4, gh());
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(ConnectionState.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.rjb
    public final void b(rje rjeVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rjeVar);
        gj(1, parcelGh);
    }

    @Override // defpackage.rjb
    public final void c(rje rjeVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rjeVar);
        gj(2, parcelGh);
    }
}

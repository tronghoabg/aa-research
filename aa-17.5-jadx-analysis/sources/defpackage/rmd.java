package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final class rmd extends ijn implements rmf {
    public rmd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.input.ICarProjectionInputService");
    }

    @Override // defpackage.rmf
    public final void e() throws RemoteException {
        gk(2, gh());
    }

    @Override // defpackage.rmf
    public final void f(rmi rmiVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rmiVar);
        gk(3, parcelGh);
    }

    @Override // defpackage.rmf
    public final void g(rml rmlVar, EditorInfo editorInfo, CarRegionId carRegionId) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rmlVar);
        ijp.g(parcelGh, editorInfo);
        parcelGh.writeInt(0);
        ijp.g(parcelGh, carRegionId);
        gk(4, parcelGh);
    }
}

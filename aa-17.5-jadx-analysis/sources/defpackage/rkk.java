package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.UiStyle;

/* loaded from: classes.dex */
public final class rkk extends ijn implements rkm {
    public rkk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayThemingManager");
    }

    @Override // defpackage.rkm
    public final int a() throws RemoteException {
        Parcel parcelGi = gi(3, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.rkm
    public final void b(boolean z) throws RemoteException {
        throw null;
    }

    @Override // defpackage.rkm
    public final void c(UiStyle uiStyle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, uiStyle);
        gj(2, parcelGh);
    }
}

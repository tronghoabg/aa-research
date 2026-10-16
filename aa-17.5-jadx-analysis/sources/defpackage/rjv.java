package defpackage;

import android.graphics.Rect;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class rjv extends ijn implements rjx {
    public rjv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplay");
    }

    @Override // defpackage.rjx
    public final Rect a() throws RemoteException {
        Parcel parcelGi = gi(9, gh());
        Rect rect = (Rect) ijp.a(parcelGi, Rect.CREATOR);
        parcelGi.recycle();
        return rect;
    }

    @Override // defpackage.rjx
    public final CarUiInfo c() throws RemoteException {
        Parcel parcelGi = gi(3, gh());
        CarUiInfo carUiInfo = (CarUiInfo) ijp.a(parcelGi, CarUiInfo.CREATOR);
        parcelGi.recycle();
        return carUiInfo;
    }

    @Override // defpackage.rjx
    public final qzf d() throws RemoteException {
        qzf qzdVar;
        Parcel parcelGi = gi(2, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qzdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarWindowManager");
            qzdVar = iInterfaceQueryLocalInterface instanceof qzf ? (qzf) iInterfaceQueryLocalInterface : new qzd(strongBinder);
        }
        parcelGi.recycle();
        return qzdVar;
    }

    @Override // defpackage.rjx
    public final CarDisplay g() throws RemoteException {
        Parcel parcelGi = gi(6, gh());
        CarDisplay carDisplay = (CarDisplay) ijp.a(parcelGi, CarDisplay.CREATOR);
        parcelGi.recycle();
        return carDisplay;
    }

    @Override // defpackage.rjx
    public final CarDisplayUiFeatures h() throws RemoteException {
        Parcel parcelGi = gi(12, gh());
        CarDisplayUiFeatures carDisplayUiFeatures = (CarDisplayUiFeatures) ijp.a(parcelGi, CarDisplayUiFeatures.CREATOR);
        parcelGi.recycle();
        return carDisplayUiFeatures;
    }

    @Override // defpackage.rjx
    public final List i() throws RemoteException {
        Parcel parcelGi = gi(15, gh());
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(Rect.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rjx
    public final void k(rkd rkdVar) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeStrongBinder(rkdVar);
        gj(7, parcelGh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rjx
    public final void l(rkg rkgVar) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeStrongBinder(rkgVar);
        gj(10, parcelGh);
    }

    @Override // defpackage.rjx
    public final void m(rkp rkpVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rkpVar);
        gj(13, parcelGh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rjx
    public final void n(qyn qynVar) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeStrongBinder(qynVar);
        gj(4, parcelGh);
    }

    @Override // defpackage.rjx
    public final void o() throws RemoteException {
        gj(16, gh());
    }

    @Override // defpackage.rjx
    public final void p(rkd rkdVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rkdVar);
        gj(8, parcelGh);
    }

    @Override // defpackage.rjx
    public final void q(rkg rkgVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rkgVar);
        gj(11, parcelGh);
    }

    @Override // defpackage.rjx
    public final void r(rkp rkpVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rkpVar);
        gj(14, parcelGh);
    }

    @Override // defpackage.rjx
    public final void s(qyn qynVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qynVar);
        gj(5, parcelGh);
    }
}

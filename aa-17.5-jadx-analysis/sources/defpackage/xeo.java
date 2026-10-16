package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.projection.gearhead.service.CarSystemUiControllerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class xeo extends ijo implements IInterface {
    final /* synthetic */ CarSystemUiControllerService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeo(CarSystemUiControllerService carSystemUiControllerService) {
        super("com.google.android.projection.gearhead.sdk.ICarSystemUi");
        this.a = carSystemUiControllerService;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xer] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xer] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, xer] */
    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        xer xepVar = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.projection.gearhead.sdk.ICarSystemUiCallback");
                    xepVar = iInterfaceQueryLocalInterface instanceof xer ? (xer) iInterfaceQueryLocalInterface : new xep(strongBinder);
                }
                ijp.d(parcel);
                try {
                    IBinder iBinderAsBinder = xepVar.asBinder();
                    CarSystemUiControllerService carSystemUiControllerService = this.a;
                    List list = carSystemUiControllerService.b;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((xev) it.next()).a.asBinder() == iBinderAsBinder) {
                            return true;
                        }
                    }
                    xev xevVar = new xev(carSystemUiControllerService, xepVar, 0);
                    list.add(xevVar);
                    tse tseVar = carSystemUiControllerService.g;
                    if (tseVar != null) {
                        xevVar.a.e(tseVar.a);
                    }
                    ((ype) CarSystemUiControllerService.a.l().ai(10177)).w("New CarSystemUiCallback registered, count: %d", list.size());
                    return true;
                } catch (RemoteException unused) {
                    ((ype) ((ype) CarSystemUiControllerService.a.f()).ai((char) 10178)).y("Binder died while registering CarSystemUiCallback: %s", xepVar);
                    return true;
                }
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.projection.gearhead.sdk.ICarSystemUiCallback");
                    xepVar = iInterfaceQueryLocalInterface2 instanceof xer ? (xer) iInterfaceQueryLocalInterface2 : new xep(strongBinder2);
                }
                ijp.d(parcel);
                List list2 = this.a.b;
                ArrayList arrayList = new ArrayList(list2);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    xev xevVar2 = (xev) arrayList.get(i2);
                    ?? r3 = xevVar2.a;
                    if (r3.asBinder() == xepVar.asBinder()) {
                        list2.remove(xevVar2);
                        r3.asBinder().unlinkToDeath(xevVar2, 0);
                        ((ype) CarSystemUiControllerService.a.l().ai((char) 10180)).w("Removed NetworkController, count: %d", list2.size());
                    }
                }
                return true;
            case 3:
                return true;
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                Intent intent = (Intent) ijp.a(parcel, Intent.CREATOR);
                ijp.d(parcel);
                if (kio.b().q()) {
                    CarSystemUiControllerService.a(intent);
                    return true;
                }
                this.a.c = intent;
                ((ype) ((ype) CarSystemUiControllerService.a.f()).ai((char) 10179)).y("Car api client not connected, queueing intent: %s", intent);
                return true;
            case 6:
                String string = parcel.readString();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ijp.d(parcel);
                for (String str : this.a.getPackageManager().getPackagesForUid(getCallingUid())) {
                    if ("com.google.android.projection.gearhead".equals(str)) {
                        int iJ = aclh.j(i4);
                        int iAv = a.av(i5);
                        if (iJ == 0 || iAv == 0) {
                            throw null;
                        }
                        ebf.j().w(string, i3, iJ, iAv);
                        return true;
                    }
                }
                return true;
            case 7:
                parcel2.writeNoException();
                parcel2.writeInt(6);
                return true;
            case 8:
                parcel.readString();
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}

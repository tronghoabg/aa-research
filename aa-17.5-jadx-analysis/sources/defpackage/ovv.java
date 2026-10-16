package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.auto.sdk.SearchItem;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class ovv extends ijo implements ovw {
    public ovv() {
        super("com.google.android.apps.auto.sdk.ISearchController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        ovu ovuVar;
        switch (i) {
            case 1:
                d();
                break;
            case 2:
                a();
                break;
            case 3:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(SearchItem.CREATOR);
                ijp.d(parcel);
                c(arrayListCreateTypedArrayList);
                break;
            case 4:
                CharSequence charSequenceB = ijp.b(parcel);
                ijp.d(parcel);
                b(charSequenceB);
                break;
            case 5:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    ovuVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.ISearchCallback");
                    ovuVar = iInterfaceQueryLocalInterface instanceof ovu ? (ovu) iInterfaceQueryLocalInterface : new ovu(strongBinder);
                }
                ijp.d(parcel);
                h(ovuVar);
                break;
            case 6:
                g();
                break;
            case 7:
                String string = parcel.readString();
                ijp.d(parcel);
                f(string);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

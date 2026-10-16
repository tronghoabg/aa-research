package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* renamed from: D6.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC0359a0 extends zzbem implements InterfaceC0362b0 {
    public static InterfaceC0362b0 zzd(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0362b0 ? (InterfaceC0362b0) iInterfaceQueryLocalInterface : new Z(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        zzben.zzh(parcel);
        zzb(string, string2);
        parcel2.writeNoException();
        return true;
    }
}

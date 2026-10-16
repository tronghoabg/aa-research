package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbvf;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class E0 extends zzbel {
    public final D0 R(BinderC3877b binderC3877b, zzbvf zzbvfVar) throws RemoteException {
        D0 b02;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, binderC3877b);
        zzben.zze(parcelZza, zzbvfVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            b02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            b02 = iInterfaceQueryLocalInterface instanceof D0 ? (D0) iInterfaceQueryLocalInterface : new B0(strongBinder);
        }
        parcelZzcZ.recycle();
        return b02;
    }
}

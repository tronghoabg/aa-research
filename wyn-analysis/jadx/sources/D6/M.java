package D6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbvj;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class M extends zzbel {
    public M(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder R(BinderC3877b binderC3877b, x1 x1Var, String str, zzbvj zzbvjVar, int i5) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, binderC3877b);
        zzben.zzc(parcelZza, x1Var);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        parcelZza.writeInt(i5);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        parcelZzcZ.recycle();
        return strongBinder;
    }
}

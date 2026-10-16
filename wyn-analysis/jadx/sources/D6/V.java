package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzccp;
import java.util.List;

/* loaded from: classes3.dex */
public final class V extends zzbel implements X {
    public V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // D6.X
    public final void zze(List list, S s10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzben.zze(parcelZza, s10);
        zzda(1, parcelZza);
    }

    @Override // D6.X
    public final boolean zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // D6.X
    public final zzccp zzg(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzccp zzccpVarZzt = zzcco.zzt(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzccpVarZzt;
    }

    @Override // D6.X
    public final boolean zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // D6.X
    public final zzbgq zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        zzbgq zzbgqVarZzb = zzbgp.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbgqVarZzb;
    }

    @Override // D6.X
    public final boolean zzj(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(6, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // D6.X
    public final L zzk(String str) throws RemoteException {
        L j8;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(7, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            j8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j8 = iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelZzcZ.recycle();
        return j8;
    }

    @Override // D6.X
    public final void zzl(zzbvj zzbvjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbvjVar);
        zzda(8, parcelZza);
    }

    @Override // D6.X
    public final void zzv(int i5) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i5);
        zzda(18, parcelZza);
    }
}

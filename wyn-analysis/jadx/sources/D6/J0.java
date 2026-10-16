package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* loaded from: classes3.dex */
public abstract class J0 extends zzbem implements L0 {
    public J0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static L0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof L0 ? (L0) iInterfaceQueryLocalInterface : new I0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        N0 m02;
        switch (i5) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzg(zZza);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzh = zzh();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                int iZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(iZzi);
                return true;
            case 6:
                float fZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    m02 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    m02 = iInterfaceQueryLocalInterface instanceof N0 ? (N0) iInterfaceQueryLocalInterface : new M0(strongBinder);
                }
                zzben.zzh(parcel);
                zzl(m02);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzm);
                return true;
            case 10:
                boolean zZzn = zzn();
                parcel2.writeNoException();
                int i12 = zzben.zza;
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                N0 n0Zzo = zzo();
                parcel2.writeNoException();
                zzben.zze(parcel2, n0Zzo);
                return true;
            case 12:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i13 = zzben.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* renamed from: D6.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC0405x extends zzbem implements InterfaceC0407y {
    public AbstractBinderC0405x() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i5) {
            case 1:
                zzb();
                break;
            case 2:
                int i11 = parcel.readInt();
                zzben.zzh(parcel);
                zzc(i11);
                break;
            case 3:
                break;
            case 4:
                zzf();
                break;
            case 5:
                zzg();
                break;
            case 6:
                zzh();
                break;
            case 7:
                zzj();
                break;
            case 8:
                K0 k02 = (K0) zzben.zzb(parcel, K0.CREATOR);
                zzben.zzh(parcel);
                zzd(k02);
                break;
            case 9:
                zzi();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

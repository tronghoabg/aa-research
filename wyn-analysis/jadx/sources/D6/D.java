package D6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* loaded from: classes3.dex */
public abstract class D extends zzbem implements E {
    public D() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            v1 v1Var = (v1) zzben.zzb(parcel, v1.CREATOR);
            zzben.zzh(parcel);
            zze(v1Var);
            parcel2.writeNoException();
            return true;
        }
        if (i5 == 2) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
            return true;
        }
        if (i5 == 3) {
            boolean zZzg = zzg();
            parcel2.writeNoException();
            int i11 = zzben.zza;
            parcel2.writeInt(zZzg ? 1 : 0);
            return true;
        }
        if (i5 == 4) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
            return true;
        }
        if (i5 != 5) {
            return false;
        }
        v1 v1Var2 = (v1) zzben.zzb(parcel, v1.CREATOR);
        int i12 = parcel.readInt();
        zzben.zzh(parcel);
        zzi(v1Var2, i12);
        parcel2.writeNoException();
        return true;
    }
}

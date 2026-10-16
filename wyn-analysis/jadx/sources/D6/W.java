package D6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzccp;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class W extends zzbem implements X {
    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        S p10 = null;
        U t10 = null;
        switch (i5) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(o1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    p10 = iInterfaceQueryLocalInterface instanceof S ? (S) iInterfaceQueryLocalInterface : new P(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                }
                zzben.zzh(parcel);
                zze(arrayListCreateTypedArrayList, p10);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzben.zzh(parcel);
                boolean zZzf = zzf(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzf ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzccp zzccpVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzccpVarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzben.zzh(parcel);
                boolean zZzh = zzh(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzben.zzh(parcel);
                zzbgq zzbgqVarZzi = zzi(string4);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbgqVarZzi);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzben.zzh(parcel);
                boolean zZzj = zzj(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzben.zzh(parcel);
                L lZzk = zzk(string6);
                parcel2.writeNoException();
                zzben.zze(parcel2, lZzk);
                return true;
            case 8:
                zzbvi.zzf(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                o1 o1Var = (o1) zzben.zzb(parcel, o1.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    t10 = iInterfaceQueryLocalInterface2 instanceof U ? (U) iInterfaceQueryLocalInterface2 : new T(strongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                }
                zzben.zzh(parcel);
                boolean zZzm = zzm(string7, o1Var, t10);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 10:
                int i11 = parcel.readInt();
                String string8 = parcel.readString();
                zzben.zzh(parcel);
                boolean zZzn = zzn(i11, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                zzben.zzh(parcel);
                L lZzo = zzo(string9);
                parcel2.writeNoException();
                zzben.zze(parcel2, lZzo);
                return true;
            case 12:
                String string10 = parcel.readString();
                zzben.zzh(parcel);
                zzbgq zzbgqVarZzp = zzp(string10);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbgqVarZzp);
                return true;
            case 13:
                String string11 = parcel.readString();
                zzben.zzh(parcel);
                zzccp zzccpVarZzq = zzq(string11);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzccpVarZzq);
                return true;
            case 14:
                int i12 = parcel.readInt();
                String string12 = parcel.readString();
                zzben.zzh(parcel);
                o1 o1VarZzr = zzr(i12, string12);
                parcel2.writeNoException();
                zzben.zzd(parcel2, o1VarZzr);
                return true;
            case 15:
                int i13 = parcel.readInt();
                zzben.zzh(parcel);
                Bundle bundleZzs = zzs(i13);
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzs);
                return true;
            case 16:
                int i14 = parcel.readInt();
                String string13 = parcel.readString();
                zzben.zzh(parcel);
                int iZzt = zzt(i14, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iZzt);
                return true;
            case 17:
                int i15 = parcel.readInt();
                String string14 = parcel.readString();
                zzben.zzh(parcel);
                boolean zZzu = zzu(i15, string14);
                parcel2.writeNoException();
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 18:
                int i16 = parcel.readInt();
                zzben.zzh(parcel);
                zzv(i16);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

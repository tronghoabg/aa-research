package com.google.android.gms.internal.ads;

import D6.L0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbmy extends zzbem implements zzbmz {
    public zzbmy() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i5) {
            case 2:
                InterfaceC3876a interfaceC3876aZzb = zzb();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzb);
                return true;
            case 3:
                String strZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 4:
                List listZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(listZzd);
                return true;
            case 5:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 6:
                zzbml zzbmlVarZzf = zzf();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmlVarZzf);
                return true;
            case 7:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 8:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzi);
                return true;
            case 10:
                zzj();
                parcel2.writeNoException();
                return true;
            case 11:
                L0 l0Zzk = zzk();
                parcel2.writeNoException();
                zzben.zze(parcel2, l0Zzk);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                boolean zZzm = zzm(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzn(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbme zzbmeVarZzo = zzo();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmeVarZzo);
                return true;
            case 16:
                InterfaceC3876a interfaceC3876aZzp = zzp();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzp);
                return true;
            case 17:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            default:
                return false;
        }
    }
}

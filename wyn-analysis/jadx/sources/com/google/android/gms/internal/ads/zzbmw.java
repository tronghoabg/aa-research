package com.google.android.gms.internal.ads;

import D6.L0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbmw extends zzbem implements zzbmx {
    public zzbmw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
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
                double dZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzh);
                return true;
            case 9:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 10:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 11:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzk);
                return true;
            case 12:
                zzl();
                parcel2.writeNoException();
                return true;
            case 13:
                L0 l0Zzm = zzm();
                parcel2.writeNoException();
                zzben.zze(parcel2, l0Zzm);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzn(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                boolean zZzo = zzo(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzbme zzbmeVarZzq = zzq();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmeVarZzq);
                return true;
            case 18:
                InterfaceC3876a interfaceC3876aZzr = zzr();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzr);
                return true;
            case 19:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            default:
                return false;
        }
    }
}

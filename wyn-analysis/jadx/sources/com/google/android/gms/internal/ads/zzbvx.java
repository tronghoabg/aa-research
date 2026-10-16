package com.google.android.gms.internal.ads;

import D6.L0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbvx extends zzbem implements zzbvy {
    public zzbvx() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbvy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof zzbvy ? (zzbvy) iInterfaceQueryLocalInterface : new zzbvw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i5) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                zzbml zzbmlVarZzh = zzh();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmlVarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                L0 l0Zzn = zzn();
                parcel2.writeNoException();
                zzben.zze(parcel2, l0Zzn);
                return true;
            case 12:
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 13:
                InterfaceC3876a interfaceC3876aZzp = zzp();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzp);
                return true;
            case 14:
                InterfaceC3876a interfaceC3876aZzq = zzq();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzq);
                return true;
            case 15:
                InterfaceC3876a interfaceC3876aZzr = zzr();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzr);
                return true;
            case 16:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzs);
                return true;
            case 17:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 18:
                boolean zZzu = zzu();
                parcel2.writeNoException();
                int i12 = zzben.zza;
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 19:
                zzv();
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzw(interfaceC3876aR);
                parcel2.writeNoException();
                return true;
            case 21:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzx(interfaceC3876aR2, interfaceC3876aR3, interfaceC3876aR4);
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC3876a interfaceC3876aR5 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzy(interfaceC3876aR5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzz);
                return true;
            case 24:
                float fZzA = zzA();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzA);
                return true;
            case 25:
                float fZzB = zzB();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzB);
                return true;
            case 26:
                zzC();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

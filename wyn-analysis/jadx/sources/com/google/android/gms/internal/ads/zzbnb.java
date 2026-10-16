package com.google.android.gms.internal.ads;

import D6.L0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbnb extends zzbem implements zzbnc {
    public zzbnb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbnc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzbnc ? (zzbnc) iInterfaceQueryLocalInterface : new zzbna(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i5) {
            case 1:
                String string = parcel.readString();
                zzben.zzh(parcel);
                String strZze = zze(string);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzbml zzbmlVarZzf = zzf(string2);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmlVarZzf);
                return true;
            case 3:
                List<String> listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzben.zzh(parcel);
                zzi(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                L0 l0Zzk = zzk();
                parcel2.writeNoException();
                zzben.zze(parcel2, l0Zzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC3876a interfaceC3876aZzm = zzm();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzm);
                return true;
            case 10:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                boolean zZzn = zzn(interfaceC3876aR);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i12 = zzben.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 14:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzq(interfaceC3876aR2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbmi zzbmiVarZzs = zzs();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmiVarZzs);
                return true;
            case 17:
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                boolean zZzt = zzt(interfaceC3876aR3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}

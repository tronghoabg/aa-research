package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbmo extends zzbem implements zzbmp {
    public zzbmo() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbmp zzdG(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbmp ? (zzbmp) iInterfaceQueryLocalInterface : new zzbmn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbmi zzbmgVar;
        switch (i5) {
            case 1:
                String string = parcel.readString();
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzb(string, interfaceC3876aR);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                InterfaceC3876a interfaceC3876aZzc = zzc(string2);
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzc);
                return true;
            case 3:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzd(interfaceC3876aR2);
                parcel2.writeNoException();
                return true;
            case 4:
                zze();
                parcel2.writeNoException();
                return true;
            case 5:
                BinderC3877b.R(parcel.readStrongBinder());
                parcel.readInt();
                zzben.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzdB(interfaceC3876aR3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzdD(interfaceC3876aR4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbmgVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbmgVar = iInterfaceQueryLocalInterface instanceof zzbmi ? (zzbmi) iInterfaceQueryLocalInterface : new zzbmg(strongBinder);
                }
                zzben.zzh(parcel);
                zzdE(zzbmgVar);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC3876a interfaceC3876aR5 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzdC(interfaceC3876aR5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

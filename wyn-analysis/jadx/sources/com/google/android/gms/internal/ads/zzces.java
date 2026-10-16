package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzces extends zzbem implements zzcet {
    public zzces() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcet zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzcet ? (zzcet) iInterfaceQueryLocalInterface : new zzcer(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzceq zzceoVar = null;
        switch (i5) {
            case 1:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzcex zzcexVar = (zzcex) zzben.zzb(parcel, zzcex.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzceoVar = iInterfaceQueryLocalInterface instanceof zzceq ? (zzceq) iInterfaceQueryLocalInterface : new zzceo(strongBinder);
                }
                zzben.zzh(parcel);
                zze(interfaceC3876aR, zzcexVar, zzceoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzf(interfaceC3876aR2);
                parcel2.writeNoException();
                return true;
            case 3:
                BinderC3877b.R(parcel.readStrongBinder());
                BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 4:
                BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC3876a interfaceC3876aR3 = BinderC3877b.R(parcel.readStrongBinder());
                zzbzx zzbzxVarZzb = zzbzw.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzg(arrayListCreateTypedArrayList, interfaceC3876aR3, zzbzxVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC3876a interfaceC3876aR4 = BinderC3877b.R(parcel.readStrongBinder());
                zzbzx zzbzxVarZzb2 = zzbzw.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzh(arrayListCreateTypedArrayList2, interfaceC3876aR4, zzbzxVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcaa zzcaaVar = (zzcaa) zzben.zzb(parcel, zzcaa.CREATOR);
                zzben.zzh(parcel);
                zzi(zzcaaVar);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC3876a interfaceC3876aR5 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzj(interfaceC3876aR5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC3876a interfaceC3876aR6 = BinderC3877b.R(parcel.readStrongBinder());
                zzbzx zzbzxVarZzb3 = zzbzw.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzk(arrayListCreateTypedArrayList3, interfaceC3876aR6, zzbzxVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC3876a interfaceC3876aR7 = BinderC3877b.R(parcel.readStrongBinder());
                zzbzx zzbzxVarZzb4 = zzbzw.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzl(arrayListCreateTypedArrayList4, interfaceC3876aR7, zzbzxVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3876a interfaceC3876aR8 = BinderC3877b.R(parcel.readStrongBinder());
                InterfaceC3876a interfaceC3876aR9 = BinderC3877b.R(parcel.readStrongBinder());
                String string = parcel.readString();
                InterfaceC3876a interfaceC3876aR10 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                InterfaceC3876a interfaceC3876aZzm = zzm(interfaceC3876aR8, interfaceC3876aR9, string, interfaceC3876aR10);
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzm);
                return true;
            default:
                return false;
        }
    }
}

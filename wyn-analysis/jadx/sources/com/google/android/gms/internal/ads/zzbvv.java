package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import D6.J0;
import D6.L0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbvv extends zzbel implements IInterface {
    public zzbvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final List zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzben.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }

    public final String zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final zzbml zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbml zzbmlVarZzh = zzbmk.zzh(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbmlVarZzh;
    }

    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    public final void zzl(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(9, parcelZza);
    }

    public final void zzm(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(10, parcelZza);
    }

    public final boolean zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final boolean zzo() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final Bundle zzp() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        Bundle bundle = (Bundle) zzben.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final void zzq(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(14, parcelZza);
    }

    public final InterfaceC3876a zzr() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(15, zza()));
    }

    public final L0 zzs() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        L0 l0Zzb = J0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return l0Zzb;
    }

    public final zzbme zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzbme zzbmeVarZzj = zzbmd.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbmeVarZzj;
    }

    public final InterfaceC3876a zzu() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(20, zza()));
    }

    public final InterfaceC3876a zzv() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(21, zza()));
    }

    public final void zzw(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, InterfaceC3876a interfaceC3876a3) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, interfaceC3876a2);
        zzben.zze(parcelZza, interfaceC3876a3);
        zzda(22, parcelZza);
    }
}

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
public final class zzbvu extends zzbel implements IInterface {
    public zzbvu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
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

    public final double zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        double d3 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d3;
    }

    public final String zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final void zzm() throws RemoteException {
        zzda(10, zza());
    }

    public final void zzn(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(11, parcelZza);
    }

    public final void zzo(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(12, parcelZza);
    }

    public final boolean zzp() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(14, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(15, zza());
        Bundle bundle = (Bundle) zzben.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final void zzs(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(16, parcelZza);
    }

    public final L0 zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        L0 l0Zzb = J0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return l0Zzb;
    }

    public final InterfaceC3876a zzu() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(18, zza()));
    }

    public final zzbme zzv() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzbme zzbmeVarZzj = zzbmd.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbmeVarZzj;
    }

    public final InterfaceC3876a zzw() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(20, zza()));
    }

    public final InterfaceC3876a zzx() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(21, zza()));
    }

    public final void zzy(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, InterfaceC3876a interfaceC3876a3) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, interfaceC3876a2);
        zzben.zze(parcelZza, interfaceC3876a3);
        zzda(22, parcelZza);
    }
}

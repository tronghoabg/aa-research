package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import D6.J0;
import D6.L0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbvw extends zzbel implements zzbvy {
    public zzbvw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final float zzA() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(24, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final float zzB() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(25, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzC() throws RemoteException {
        zzda(26, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final List zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzben.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final zzbml zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbml zzbmlVarZzh = zzbmk.zzh(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbmlVarZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final double zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d3 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d3;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final L0 zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        L0 l0Zzb = J0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return l0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final zzbme zzo() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzbme zzbmeVarZzj = zzbmd.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbmeVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final InterfaceC3876a zzp() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final InterfaceC3876a zzq() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final InterfaceC3876a zzr() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final Bundle zzs() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) zzben.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final boolean zzu() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(18, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzv() throws RemoteException {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzw(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzx(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, InterfaceC3876a interfaceC3876a3) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, interfaceC3876a2);
        zzben.zze(parcelZza, interfaceC3876a3);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzy(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final float zzz() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(23, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }
}

package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import D6.J0;
import D6.L0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbmg extends zzbel implements zzbmi {
    public zzbmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final float zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzf(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final InterfaceC3876a zzg() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final float zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final float zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final L0 zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        L0 l0Zzb = J0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return l0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzm(zzbnq zzbnqVar) throws RemoteException {
        throw null;
    }
}

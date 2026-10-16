package com.google.android.gms.internal.ads;

import D6.A0;
import D6.G0;
import D6.H0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbgo extends zzbel implements zzbgq {
    public zzbgo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final D6.L zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzf(InterfaceC3876a interfaceC3876a, zzbgx zzbgxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbgxVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final H0 zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        H0 h0Zzb = G0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return h0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzh(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzben.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzi(A0 a02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, a02);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final long zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        long j8 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl(long j8) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j8);
        zzda(10, parcelZza);
    }
}

package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbmj extends zzbel implements zzbml {
    public zzbmj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final InterfaceC3876a zzb() throws RemoteException {
        return AbstractC0279p0.t(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final Uri zzc() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzben.zzb(parcelZzcZ, Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final double zzd() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        double d3 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d3;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final int zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        int i5 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final int zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i5 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final Map zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        HashMap mapZzg = zzben.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return mapZzg;
    }
}

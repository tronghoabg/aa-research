package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes4.dex */
public final class zzh extends zza implements IInterface {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    public final void zzd() throws RemoteException {
        zzc(2, zza());
    }

    public final zzl[] zze(InterfaceC3876a interfaceC3876a, zzd zzdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, interfaceC3876a);
        zzc.zza(parcelZza, zzdVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        zzl[] zzlVarArr = (zzl[]) parcelZzb.createTypedArray(zzl.CREATOR);
        parcelZzb.recycle();
        return zzlVarArr;
    }
}

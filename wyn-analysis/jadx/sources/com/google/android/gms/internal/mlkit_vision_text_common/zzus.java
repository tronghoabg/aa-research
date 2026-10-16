package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes4.dex */
public final class zzus extends zza implements zzuu {
    public zzus(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuu
    public final zzuv zzd(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, zzvh zzvhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, interfaceC3876a);
        zzuv zzuvVar = null;
        zzc.zzb(parcelZza, null);
        zzc.zza(parcelZza, zzvhVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            zzuvVar = iInterfaceQueryLocalInterface instanceof zzuv ? (zzuv) iInterfaceQueryLocalInterface : new zzuv(strongBinder);
        }
        parcelZzb.recycle();
        return zzuvVar;
    }
}

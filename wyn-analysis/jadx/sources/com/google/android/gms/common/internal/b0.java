package com.google.android.gms.common.internal;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class b0 extends zza implements c0 {
    @Override // com.google.android.gms.common.internal.c0
    public final InterfaceC3876a zzd() {
        return AbstractC0279p0.t(zzB(1, zza()));
    }

    @Override // com.google.android.gms.common.internal.c0
    public final int zze() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        int i5 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i5;
    }
}

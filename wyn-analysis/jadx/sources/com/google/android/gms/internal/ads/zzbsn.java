package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbsn extends zzbem implements zzbso {
    public zzbsn() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 != 1) {
            if (i5 != 2) {
                return false;
            }
            parcel.readInt();
            zzben.zzh(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}

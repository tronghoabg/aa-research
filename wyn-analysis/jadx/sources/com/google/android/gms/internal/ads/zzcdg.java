package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzcdg extends zzccl {
    private final String zza;
    private final int zzb;

    public zzcdg(R6.b bVar) {
        this(bVar != null ? bVar.getType() : "", bVar != null ? bVar.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final int zzf() throws RemoteException {
        return this.zzb;
    }

    public zzcdg(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzccz implements R6.b {
    private final zzccm zza;

    public zzccz(zzccm zzccmVar) {
        this.zza = zzccmVar;
    }

    @Override // R6.b
    public final int getAmount() {
        zzccm zzccmVar = this.zza;
        if (zzccmVar != null) {
            try {
                return zzccmVar.zzf();
            } catch (RemoteException e7) {
                H6.l.g("Could not forward getAmount to RewardItem", e7);
            }
        }
        return 0;
    }

    @Override // R6.b
    public final String getType() {
        zzccm zzccmVar = this.zza;
        if (zzccmVar != null) {
            try {
                return zzccmVar.zze();
            } catch (RemoteException e7) {
                H6.l.g("Could not forward getType to RewardItem", e7);
            }
        }
        return null;
    }
}

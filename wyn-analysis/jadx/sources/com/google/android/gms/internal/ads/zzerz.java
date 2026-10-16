package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzerz {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdxk zzb;

    public zzerz(zzdxk zzdxkVar) {
        this.zzb = zzdxkVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e7) {
            G6.L.l("Couldn't create RTB adapter : ", e7);
        }
    }

    public final zzbxi zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbxi) concurrentHashMap.get(str);
        }
        return null;
    }
}

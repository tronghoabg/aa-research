package com.google.android.gms.internal.ads;

import D6.H0;
import D6.v1;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzetv {
    private final zzeua zza;
    private final String zzb;
    private H0 zzc;

    public zzetv(zzeua zzeuaVar, String str) {
        this.zza = zzeuaVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzb(v1 v1Var, int i5) throws RemoteException {
        this.zzc = null;
        zzeub zzeubVar = new zzeub(i5);
        zzetu zzetuVar = new zzetu(this);
        this.zza.zza(v1Var, this.zzb, zzeubVar, zzetuVar);
    }

    public final synchronized String zzc() {
        H0 h02;
        try {
            h02 = this.zzc;
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
            return null;
        }
        return h02 != null ? h02.zze() : null;
    }

    public final synchronized String zzd() {
        H0 h02;
        try {
            h02 = this.zzc;
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
            return null;
        }
        return h02 != null ? h02.zze() : null;
    }

    public final /* synthetic */ void zze(H0 h02) {
        this.zzc = h02;
    }
}

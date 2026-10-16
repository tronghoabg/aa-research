package com.google.android.gms.internal.ads;

import D6.InterfaceC0407y;
import D6.v1;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzesm extends D6.D {
    private final zzetv zza;

    public zzesm(Context context, zzcnq zzcnqVar, zzflf zzflfVar, zzdql zzdqlVar, InterfaceC0407y interfaceC0407y) {
        zzetx zzetxVar = new zzetx(zzdqlVar, zzcnqVar.zzD());
        zzetxVar.zza(interfaceC0407y);
        this.zza = new zzetv(new zzeuh(zzcnqVar, context, zzetxVar, zzflfVar), zzflfVar.zzh());
    }

    @Override // D6.E
    public final void zze(v1 v1Var) throws RemoteException {
        this.zza.zzb(v1Var, 1);
    }

    @Override // D6.E
    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    @Override // D6.E
    public final synchronized boolean zzg() throws RemoteException {
        return this.zza.zza();
    }

    @Override // D6.E
    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    @Override // D6.E
    public final synchronized void zzi(v1 v1Var, int i5) throws RemoteException {
        this.zza.zzb(v1Var, i5);
    }
}

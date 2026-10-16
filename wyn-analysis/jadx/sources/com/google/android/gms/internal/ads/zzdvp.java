package com.google.android.gms.internal.ads;

import D6.L0;
import D6.N0;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzdvp extends x6.v {
    private final zzdqb zza;

    public zzdvp(zzdqb zzdqbVar) {
        this.zza = zzdqbVar;
    }

    private static N0 zza(zzdqb zzdqbVar) {
        L0 l0Zzy = zzdqbVar.zzy();
        if (l0Zzy == null) {
            return null;
        }
        try {
            return l0Zzy.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // x6.v
    public final void onVideoEnd() {
        N0 n0Zza = zza(this.zza);
        if (n0Zza == null) {
            return;
        }
        try {
            n0Zza.zzh();
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // x6.v
    public final void onVideoPause() {
        N0 n0Zza = zza(this.zza);
        if (n0Zza == null) {
            return;
        }
        try {
            n0Zza.zzg();
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // x6.v
    public final void onVideoStart() {
        N0 n0Zza = zza(this.zza);
        if (n0Zza == null) {
            return;
        }
        try {
            n0Zza.zze();
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Unable to call onVideoEnd()", e7);
        }
    }
}

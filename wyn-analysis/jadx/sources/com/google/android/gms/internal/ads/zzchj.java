package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes3.dex */
public final class zzchj {
    private final Context zza;
    private final zzchu zzb;
    private final ViewGroup zzc;
    private final zzdzt zzd;
    private zzchi zze;

    public zzchj(Context context, ViewGroup viewGroup, zzclb zzclbVar, zzdzt zzdztVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzclbVar;
        this.zze = null;
        this.zzd = zzdztVar;
    }

    public final Integer zza() {
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            return zzchiVar.zzl();
        }
        return null;
    }

    public final void zzb(int i5, int i10, int i11, int i12) {
        AbstractC1732v.e("The underlay may only be modified from the UI thread.");
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzn(i5, i10, i11, i12);
        }
    }

    public final void zzc(int i5, int i10, int i11, int i12, int i13, boolean z2, zzcht zzchtVar) {
        if (this.zze != null) {
            return;
        }
        zzchu zzchuVar = this.zzb;
        zzbje.zza(zzchuVar.zzq().zzc(), zzchuVar.zzi(), "vpr2");
        zzchi zzchiVar = new zzchi(this.zza, zzchuVar, i13, z2, zzchuVar.zzq().zzc(), zzchtVar, this.zzd);
        this.zze = zzchiVar;
        this.zzc.addView(zzchiVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i5, i10, i11, i12);
        zzchuVar.zzdn(false);
    }

    public final zzchi zzd() {
        return this.zze;
    }

    public final void zze() {
        AbstractC1732v.e("onPause must be called from the UI thread.");
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzr();
        }
    }

    public final void zzf() {
        AbstractC1732v.e("onDestroy must be called from the UI thread.");
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i5) {
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzm(i5);
        }
    }
}

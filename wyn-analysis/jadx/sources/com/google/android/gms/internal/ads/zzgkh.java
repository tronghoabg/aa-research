package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;

/* loaded from: classes3.dex */
final class zzgkh implements zzggc {
    private final zzimt zza;
    private final zzimt zzb;
    private final zzimt zzc;
    private final boolean zzd;
    private final long zze;

    public zzgkh(zzimt zzimtVar, zzimt zzimtVar2, zzimt zzimtVar3, boolean z2, long j8) {
        this.zza = zzimtVar;
        this.zzb = zzimtVar2;
        this.zzc = zzimtVar3;
        this.zzd = z2;
        this.zze = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final String zza() {
        return ((zzglm) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final p8.p zzb() {
        if (this.zzd) {
            return (zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzg(zzhbx.zzw(((zzgkz) this.zza.zzb()).zzb()), Throwable.class, zzgkd.zza, zzhcw.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgke
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ p8.p zza(Object obj) {
                    return this.zza.zzj((zzgky) obj);
                }
            }, zzhcw.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkf
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ p8.p zza(Object obj) {
                    return this.zza.zzk((Boolean) obj);
                }
            }, zzhcw.zza());
        }
        zzhbx zzhbxVar = (zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzg(zzhbx.zzw(((zzgng) this.zzc.zzb()).zza()), Throwable.class, zzgkg.zza, zzhcw.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkb
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzh((Boolean) obj);
            }
        }, zzhcw.zza());
        zzhbxVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        }, zzhcw.zza());
        return zzhbxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final p8.p zzc(Context context) {
        return ((zzglm) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final p8.p zzd(Context context, String str, View view, Activity activity) {
        return ((zzglm) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final p8.p zze(Context context, String str, View view, Activity activity) {
        return ((zzglm) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final void zzf(InputEvent inputEvent) {
        ((zzglm) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final int zzg() {
        return ((zzglm) this.zzb.zzb()).zzg();
    }

    public final /* synthetic */ p8.p zzh(Boolean bool) {
        return ((zzglm) this.zzb.zzb()).zzb();
    }

    public final /* synthetic */ void zzi() {
        ((zzgkz) this.zza.zzb()).zza(this.zze);
    }

    public final /* synthetic */ p8.p zzj(zzgky zzgkyVar) {
        return ((zzgng) this.zzc.zzb()).zza();
    }

    public final /* synthetic */ p8.p zzk(Boolean bool) {
        return ((zzglm) this.zzb.zzb()).zzb();
    }
}

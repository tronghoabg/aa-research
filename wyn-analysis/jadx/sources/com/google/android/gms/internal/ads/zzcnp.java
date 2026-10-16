package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzcnp implements zzbar {
    private final Context zza;
    private final zzgdl zzb;

    public zzcnp(Context context, H6.a aVar) {
        this.zza = context;
        zzbio zzbioVar = zzbix.zzdI;
        C0395s c0395s = C0395s.f2489e;
        int iIntValue = ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
        int i5 = iIntValue != 1 ? (iIntValue == 2 || iIntValue != 3) ? 3 : 4 : 2;
        zzgeh zzgehVarZze = zzgei.zze();
        zzgehVarZze.zza(((Float) c0395s.f2492c.zzd(zzbix.zzdO)).floatValue());
        zzgei zzgeiVar = (zzgei) zzgehVarZze.zzbu();
        zzgej zzgejVarZzi = zzgek.zzi();
        zzgejVarZzi.zza(((Boolean) c0395s.f2492c.zzd(zzbix.zzdP)).booleanValue());
        zzgejVarZzi.zzb(((Long) c0395s.f2492c.zzd(zzbix.zzdR)).longValue());
        zzgek zzgekVar = (zzgek) zzgejVarZzi.zzbu();
        zzgdo zzgdoVarZzx = zzgdq.zzx();
        zzgdoVarZzx.zzl(i5);
        zzgdoVarZzx.zzd(aVar.f4927a);
        zzgdoVarZzx.zzm(3);
        zzgdoVarZzx.zza(((Boolean) c0395s.f2492c.zzd(zzbix.zzdp)).booleanValue());
        zzgdoVarZzx.zzb(((Boolean) c0395s.f2492c.zzd(zzbix.zzdS)).booleanValue());
        zzgdoVarZzx.zzc(((Boolean) c0395s.f2492c.zzd(zzbix.zzdT)).booleanValue());
        zzgdoVarZzx.zzj(((Integer) c0395s.f2492c.zzd(zzbix.zzdF)).intValue() == -1);
        zzgdoVarZzx.zzi(((Integer) c0395s.f2492c.zzd(zzbix.zzdH)).intValue());
        zzgdoVarZzx.zzg(((Long) c0395s.f2492c.zzd(zzbix.zzdQ)).longValue());
        zzgdoVarZzx.zzf(((Integer) c0395s.f2492c.zzd(zzbix.zzdG)).intValue());
        zzgdoVarZzx.zze(zzgeiVar);
        zzgdoVarZzx.zzh(zzgekVar);
        zzgdoVarZzx.zzk(((Boolean) c0395s.f2492c.zzd(zzbix.zzew)).booleanValue());
        zzgdl zzgdlVarZza = zzgdl.zza(context, zzcfy.zza, (zzgdq) zzgdoVarZzx.zzbu());
        this.zzb = zzgdlVarZza;
        zzgdlVarZza.zzb();
    }

    public final String zza() {
        int iZzh = this.zzb.zzh() - 1;
        return iZzh != 1 ? iZzh != 2 ? iZzh != 3 ? "uns" : "3.0" : "2.0" : "1.0";
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    @Deprecated
    public final void zze(int i5, int i10, int i11) {
        C0392q c0392q = C0392q.f2477g;
        H6.f fVar = c0392q.f2478a;
        Context context = this.zza;
        float fB = H6.f.b(context, i5);
        H6.f fVar2 = c0392q.f2478a;
        float fS = H6.f.s(context.getResources().getDisplayMetrics(), i10);
        zzgdl zzgdlVar = this.zzb;
        long j8 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j8, 0, fB, fS, 0);
        zzgdlVar.zzg(motionEventObtain);
        motionEventObtain.recycle();
        H6.f fVar3 = c0392q.f2478a;
        float fS2 = H6.f.s(context.getResources().getDisplayMetrics(), i5);
        H6.f fVar4 = c0392q.f2478a;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j8, 2, fS2, H6.f.s(context.getResources().getDisplayMetrics(), i10), 0);
        zzgdlVar.zzg(motionEventObtain2);
        motionEventObtain2.recycle();
        H6.f fVar5 = c0392q.f2478a;
        float fS3 = H6.f.s(context.getResources().getDisplayMetrics(), i5);
        H6.f fVar6 = c0392q.f2478a;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j8, 1, fS3, H6.f.s(context.getResources().getDisplayMetrics(), i10), 0);
        zzgdlVar.zzg(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}

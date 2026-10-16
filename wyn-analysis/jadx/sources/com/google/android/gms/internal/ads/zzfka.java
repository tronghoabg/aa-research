package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfka implements zzeua {
    private final Context zza;
    private final Executor zzb;
    private final zzcnq zzc;
    private final zzfjr zzd;
    private final zzfie zze;
    private final zzfkz zzf;
    private final zzfqt zzg;
    private final zzflf zzh;
    private p8.p zzi;

    public zzfka(Context context, Executor executor, zzcnq zzcnqVar, zzfie zzfieVar, zzfjr zzfjrVar, zzflf zzflfVar, zzfkz zzfkzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnqVar;
        this.zze = zzfieVar;
        this.zzd = zzfjrVar;
        this.zzh = zzflfVar;
        this.zzf = zzfkzVar;
        this.zzg = zzcnqVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdvy zze(zzfic zzficVar) {
        zzdvy zzdvyVarZzp = this.zzc.zzp();
        zzdci zzdciVar = new zzdci();
        zzdciVar.zza(this.zza);
        zzdciVar.zzb(((zzfjz) zzficVar).zza);
        zzdciVar.zzf(this.zzf);
        zzdvyVarZzp.zzd(zzdciVar.zze());
        zzdvyVarZzp.zze(new zzdiy().zzn());
        return zzdvyVarZzp;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    @Override // com.google.android.gms.internal.ads.zzeua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(D6.v1 r28, java.lang.String r29, com.google.android.gms.internal.ads.zzety r30, com.google.android.gms.internal.ads.zzetz r31) throws org.json.JSONException, android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfka.zza(D6.v1, java.lang.String, com.google.android.gms.internal.ads.zzety, com.google.android.gms.internal.ads.zzetz):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        throw null;
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zzdJ(zzfmi.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzfjr zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzfie zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzfqt zzi() {
        return this.zzg;
    }

    public final void zzj(int i5) {
        this.zzh.zzj().zza(i5);
    }
}

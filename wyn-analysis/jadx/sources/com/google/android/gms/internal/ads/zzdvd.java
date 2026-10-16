package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdvd implements Callable {
    private final C6.a zza;
    private final Context zzb;
    private final zzdzt zzc;
    private final zzeko zzd;
    private final Executor zze;
    private final zzbaw zzf;
    private final H6.a zzg;
    private final zzfsm zzh;
    private final zzekz zzi;
    private final zzflk zzj;

    public zzdvd(Context context, Executor executor, zzbaw zzbawVar, H6.a aVar, C6.a aVar2, zzclr zzclrVar, zzeko zzekoVar, zzfsm zzfsmVar, zzdzt zzdztVar, zzekz zzekzVar, zzflk zzflkVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzbawVar;
        this.zzg = aVar;
        this.zza = aVar2;
        this.zzd = zzekoVar;
        this.zzh = zzfsmVar;
        this.zzc = zzdztVar;
        this.zzi = zzekzVar;
        this.zzj = zzflkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdvf zzdvfVar = new zzdvf(this);
        zzdvfVar.zza();
        return zzdvfVar;
    }

    public final /* synthetic */ C6.a zza() {
        return this.zza;
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    public final /* synthetic */ zzdzt zzc() {
        return this.zzc;
    }

    public final /* synthetic */ zzeko zzd() {
        return this.zzd;
    }

    public final /* synthetic */ Executor zze() {
        return this.zze;
    }

    public final /* synthetic */ zzbaw zzf() {
        return this.zzf;
    }

    public final /* synthetic */ H6.a zzg() {
        return this.zzg;
    }

    public final /* synthetic */ zzfsm zzh() {
        return this.zzh;
    }

    public final /* synthetic */ zzekz zzi() {
        return this.zzi;
    }

    public final /* synthetic */ zzflk zzj() {
        return this.zzj;
    }
}

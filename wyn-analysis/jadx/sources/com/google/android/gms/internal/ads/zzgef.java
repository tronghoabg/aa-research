package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgef implements zzghi {
    private final zzgdw zza;
    private final zzgec zzb;
    private Context zzc;
    private View zzd;
    private Activity zze;
    private String zzf;
    private Map zzg;
    private zzaxt zzh;
    private zzgen zzi;

    public /* synthetic */ zzgef(zzgdw zzgdwVar, zzgec zzgecVar, byte[] bArr) {
        this.zza = zzgdwVar;
        this.zzb = zzgecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final zzghj zza() {
        zzinh.zzc(this.zzc, Context.class);
        zzinh.zzc(this.zzg, Map.class);
        zzinh.zzc(this.zzh, zzaxt.class);
        zzinh.zzc(this.zzi, zzgen.class);
        return new zzgeg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* bridge */ /* synthetic */ zzghi zzb(zzgen zzgenVar) {
        zzgenVar.getClass();
        this.zzi = zzgenVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* bridge */ /* synthetic */ zzghi zzc(zzaxt zzaxtVar) {
        zzaxtVar.getClass();
        this.zzh = zzaxtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* bridge */ /* synthetic */ zzghi zzd(Map map) {
        this.zzg = map;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* synthetic */ zzghi zze(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* synthetic */ zzghi zzf(Activity activity) {
        this.zze = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* synthetic */ zzghi zzg(View view) {
        this.zzd = view;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* bridge */ /* synthetic */ zzghi zzh(Context context) {
        context.getClass();
        this.zzc = context;
        return this;
    }
}

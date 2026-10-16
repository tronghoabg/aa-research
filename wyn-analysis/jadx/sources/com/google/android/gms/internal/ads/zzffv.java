package com.google.android.gms.internal.ads;

import D6.A1;
import D6.C0395s;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class zzffv implements zzeua {
    protected final zzcnq zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfgm zzd;
    private final zzfie zze;
    private final H6.a zzf;
    private final ViewGroup zzg;
    private final zzfqt zzh;
    private final zzflf zzi;
    private p8.p zzj;

    public zzffv(Context context, Executor executor, zzcnq zzcnqVar, zzfie zzfieVar, zzfgm zzfgmVar, zzflf zzflfVar, H6.a aVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcnqVar;
        this.zze = zzfieVar;
        this.zzd = zzfgmVar;
        this.zzi = zzflfVar;
        this.zzf = aVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcnqVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzdcg zzg(zzfic zzficVar) {
        zzffs zzffsVar = (zzffs) zzficVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjB)).booleanValue()) {
            zzcvp zzcvpVar = new zzcvp(this.zzg);
            zzdci zzdciVar = new zzdci();
            zzdciVar.zza(this.zzb);
            zzdciVar.zzb(zzffsVar.zza);
            zzdcj zzdcjVarZze = zzdciVar.zze();
            zzdiy zzdiyVar = new zzdiy();
            zzfgm zzfgmVar = this.zzd;
            Executor executor = this.zzc;
            zzdiyVar.zzd(zzfgmVar, executor);
            zzdiyVar.zzg(zzfgmVar, executor);
            return zzc(zzcvpVar, zzdcjVarZze, zzdiyVar.zzn());
        }
        zzfgm zzfgmVarZzn = zzfgm.zzn(this.zzd);
        zzdiy zzdiyVar2 = new zzdiy();
        Executor executor2 = this.zzc;
        zzdiyVar2.zzc(zzfgmVarZzn, executor2);
        zzdiyVar2.zzi(zzfgmVarZzn, executor2);
        zzdiyVar2.zzj(zzfgmVarZzn, executor2);
        zzdiyVar2.zzk(zzfgmVarZzn, executor2);
        zzdiyVar2.zzd(zzfgmVarZzn, executor2);
        zzdiyVar2.zzg(zzfgmVarZzn, executor2);
        zzdiyVar2.zzl(zzfgmVarZzn);
        zzcvp zzcvpVar2 = new zzcvp(this.zzg);
        zzdci zzdciVar2 = new zzdci();
        zzdciVar2.zza(this.zzb);
        zzdciVar2.zzb(zzffsVar.zza);
        return zzc(zzcvpVar2, zzdciVar2.zze(), zzdiyVar2.zzn());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzeua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zza(D6.v1 r11, java.lang.String r12, com.google.android.gms.internal.ads.zzety r13, com.google.android.gms.internal.ads.zzetz r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffv.zza(D6.v1, java.lang.String, com.google.android.gms.internal.ads.zzety, com.google.android.gms.internal.ads.zzetz):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        p8.p pVar = this.zzj;
        return (pVar == null || pVar.isDone()) ? false : true;
    }

    public abstract zzdcg zzc(zzcvp zzcvpVar, zzdcj zzdcjVar, zzdiz zzdizVar);

    public final void zzd(A1 a12) {
        this.zzi.zzp(a12);
    }

    public final /* synthetic */ void zze() {
        this.zzd.zzdJ(zzfmi.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzfgm zzi() {
        return this.zzd;
    }

    public final /* synthetic */ zzfie zzj() {
        return this.zze;
    }

    public final /* synthetic */ zzfqt zzk() {
        return this.zzh;
    }

    public final /* synthetic */ void zzl(p8.p pVar) {
        this.zzj = null;
    }
}

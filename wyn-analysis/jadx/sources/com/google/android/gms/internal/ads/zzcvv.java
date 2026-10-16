package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.L0;
import D6.x1;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
final class zzcvv extends zzcvs {
    private final Context zzc;
    private final View zzd;
    private final zzclb zze;
    private final zzfko zzf;
    private final zzcxy zzg;
    private final zzdql zzh;
    private final zzdli zzi;
    private final zzimt zzj;
    private final Executor zzk;
    private x1 zzl;

    public zzcvv(zzcxz zzcxzVar, Context context, zzfko zzfkoVar, View view, zzclb zzclbVar, zzcxy zzcxyVar, zzdql zzdqlVar, zzdli zzdliVar, zzimt zzimtVar, Executor executor) {
        super(zzcxzVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzclbVar;
        this.zzf = zzfkoVar;
        this.zzg = zzcxyVar;
        this.zzh = zzdqlVar;
        this.zzi = zzdliVar;
        this.zzj = zzimtVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzb(ViewGroup viewGroup, x1 x1Var) {
        zzclb zzclbVar;
        if (viewGroup == null || (zzclbVar = this.zze) == null) {
            return;
        }
        zzclbVar.zzaf(zzcnl.zza(x1Var));
        viewGroup.setMinimumHeight(x1Var.f2532c);
        viewGroup.setMinimumWidth(x1Var.f2535f);
        this.zzl = x1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final L0 zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfln unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final zzfko zze() {
        x1 x1Var = this.zzl;
        if (x1Var != null) {
            return zzflm.zzb(x1Var);
        }
        zzfkn zzfknVar = this.zzb;
        if (zzfknVar.zzac) {
            for (String str : zzfknVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfko(view.getWidth(), view.getHeight(), false);
        }
        return (zzfko) zzfknVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final zzfko zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final int zzg() {
        zzbio zzbioVar = zzbix.zzjf;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzjg)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
        super.zzj();
    }

    public final void zzk() {
        zzbnt zzbntVarZzd = this.zzh.zzd();
        if (zzbntVarZzd == null) {
            return;
        }
        try {
            zzbntVarZzd.zze((D6.L) this.zzj.zzb(), new BinderC3877b(this.zzc));
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("RemoteException when notifyAdLoad is called", e7);
        }
    }
}

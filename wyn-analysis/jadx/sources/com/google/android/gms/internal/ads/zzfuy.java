package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfuy extends zzfuu {
    private final zzfuw zza;
    private zzfxj zzc;
    private zzfwi zzd;
    private final String zzg;
    private final zzfvw zzb = new zzfvw();
    private boolean zze = false;
    private boolean zzf = false;

    public zzfuy(zzfuv zzfuvVar, zzfuw zzfuwVar, String str) {
        this.zza = zzfuwVar;
        this.zzg = str;
        zzk(null);
        if (zzfuwVar.zzi() == zzfux.HTML || zzfuwVar.zzi() == zzfux.JAVASCRIPT) {
            this.zzd = new zzfwj(str, zzfuwVar.zzf());
        } else {
            this.zzd = new zzfwm(str, zzfuwVar.zze(), null);
        }
        this.zzd.zza();
        zzfvs.zza().zzb(this);
        this.zzd.zzj(zzfuvVar);
    }

    private final void zzk(View view) {
        this.zzc = new zzfxj(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    public final void zza() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzfvs.zza().zzc(this);
        this.zzd.zzo(zzfwa.zza().zzg());
        this.zzd.zzn(zzfvq.zza().zzb());
        this.zzd.zzk(this, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    public final void zzb(View view) {
        if (this.zzf || zzi() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzp();
        Collection<zzfuy> collectionZze = zzfvs.zza().zze();
        if (collectionZze == null || collectionZze.isEmpty()) {
            return;
        }
        for (zzfuy zzfuyVar : collectionZze) {
            if (zzfuyVar != this && zzfuyVar.zzi() == view) {
                zzfuyVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zzm();
        zzfvs.zza().zzd(this);
        this.zzd.zzb();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    public final void zzd(View view, zzfvb zzfvbVar, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfvbVar, "Ad overlay");
    }

    public final List zzf() {
        return this.zzb.zza();
    }

    public final zzfwi zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzi() {
        return (View) this.zzc.get();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzdmh extends zzcya {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdkk zze;
    private final zzdnw zzf;
    private final zzcyv zzg;
    private final zzfya zzh;
    private final zzddm zzi;
    private final zzcfp zzj;
    private final zzdzt zzk;
    private boolean zzl;

    public zzdmh(zzcxz zzcxzVar, Context context, zzclb zzclbVar, zzdkk zzdkkVar, zzdnw zzdnwVar, zzcyv zzcyvVar, zzfya zzfyaVar, zzddm zzddmVar, zzcfp zzcfpVar, zzdzt zzdztVar) {
        super(zzcxzVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzclbVar);
        this.zze = zzdkkVar;
        this.zzf = zzdnwVar;
        this.zzg = zzcyvVar;
        this.zzh = zzfyaVar;
        this.zzi = zzddmVar;
        this.zzj = zzcfpVar;
        this.zzk = zzdztVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzclb zzclbVar = (zzclb) this.zzd.get();
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhM)).booleanValue()) {
                if (!this.zzl && zzclbVar != null) {
                    zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzclbVar.destroy();
                        }
                    });
                }
            } else if (zzclbVar != null) {
                zzclbVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(boolean r9, android.app.Activity r10) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmh.zza(boolean, android.app.Activity):boolean");
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}

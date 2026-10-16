package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class zzade {
    private final Context zza;
    private boolean zzb;
    private zzvy zzc = zzvy.zzb;
    private final zzvk zzd;
    private Handler zze;
    private zzaer zzf;

    public zzade(Context context) {
        this.zza = context;
        this.zzd = new zzve(context, null, null);
    }

    public final zzade zza(zzvy zzvyVar) {
        this.zzc = zzvyVar;
        return this;
    }

    public final zzade zzb(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzade zzc(zzaer zzaerVar) {
        this.zzf = zzaerVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzadg zzd() {
        /*
            r3 = this;
            boolean r0 = r3.zzb
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzgtr.zzi(r0)
            android.os.Handler r0 = r3.zze
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzaer r2 = r3.zzf
            if (r2 == 0) goto L10
            goto L12
        L10:
            r2 = r1
            goto L1a
        L12:
            r2 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzaer r0 = r3.zzf
            if (r0 == 0) goto L1a
            goto L10
        L1a:
            com.google.android.gms.internal.ads.zzgtr.zzi(r2)
            r3.zzb = r1
            com.google.android.gms.internal.ads.zzadg r0 = new com.google.android.gms.internal.ads.zzadg
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzade.zzd():com.google.android.gms.internal.ads.zzadg");
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zzvy zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzvk zzg() {
        return this.zzd;
    }

    public final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzaer zzi() {
        return this.zzf;
    }
}

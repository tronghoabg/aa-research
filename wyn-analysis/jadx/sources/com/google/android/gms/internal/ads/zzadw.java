package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzadw {
    private final zzadv zza;
    private final zzaed zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdp zzk = zzdp.zza;

    public zzadw(Context context, zzadv zzadvVar, long j8) {
        this.zza = zzadvVar;
        this.zzb = new zzaed(context);
    }

    private final void zzo(int i5) {
        this.zzd = Math.min(this.zzd, i5);
    }

    public final void zza(int i5) {
        if (i5 == 0) {
            this.zzd = 1;
        } else if (i5 != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
        this.zzb.zzd();
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzfm.zzt(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzd(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f10) {
        this.zzb.zzf(f10);
    }

    public final boolean zzf() {
        int i5 = this.zzd;
        this.zzd = 3;
        this.zzf = zzfm.zzt(this.zzk.zzb());
        return i5 != 3;
    }

    public final void zzg(zzdp zzdpVar) {
        this.zzk = zzdpVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z2) {
        if (z2 && (this.zzd == 3 || (this.zzm && !this.zzl))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final void zzj(boolean z2) {
        this.zzi = z2;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (r17 > org.apache.tika.pipes.PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (r24 >= r28) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        if (r21.zzc != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzk(long r22, long r24, long r26, long r28, boolean r30, boolean r31, com.google.android.gms.internal.ads.zzadu r32) throws com.google.android.gms.internal.ads.zzjm {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadw.zzk(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.zzadu):int");
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
        this.zzm = false;
    }

    public final void zzm(int i5) {
        this.zzb.zza(i5);
    }

    public final void zzn(float f10) {
        zzgtr.zza(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f10 == this.zzj) {
            return;
        }
        this.zzj = f10;
        this.zzb.zze(f10);
    }
}

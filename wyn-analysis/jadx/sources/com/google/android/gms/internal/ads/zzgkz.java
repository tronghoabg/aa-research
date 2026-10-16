package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzgkz {
    private final zzgpe zza;
    private final zzgmp zzb;
    private final zzgng zzc;
    private final zzgqo zzd;
    private final zzgew zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    public zzgkz(zzgpe zzgpeVar, zzgmp zzgmpVar, zzgng zzgngVar, zzgqo zzgqoVar, zzgew zzgewVar, boolean z2, long j8, long j10) {
        this.zza = zzgpeVar;
        this.zzb = zzgmpVar;
        this.zzc = zzgngVar;
        this.zzd = zzgqoVar;
        this.zze = zzgewVar;
        this.zzf = z2;
        this.zzg = j8;
        this.zzh = j10;
    }

    private final p8.p zzh(final int i5) {
        zzhbx zzhbxVar = (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzk(zzhbx.zzw(this.zzb.zza()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgfz zzgfzVar = (zzgfz) obj;
                this.zza.zzd(zzgfzVar);
                return zzgfzVar;
            }
        }, zzhcw.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkr
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zze((zzgfz) obj);
            }
        }, zzhcw.zza()), zzgks.zza, zzhcw.zza()), zzgkl.class, zzgkt.zza, zzhcw.zza()), zzgkm.class, zzgku.zza, zzhcw.zza()), zzgkk.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkv
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzf(i5, (zzgkk) obj);
            }
        }, zzhcw.zza());
        this.zzd.zze(BackupConstant.SCENE_BACKUP_RENDER_FAIL, zzhbxVar);
        return zzhbxVar;
    }

    public final void zza(long j8) {
        if (j8 > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, j8);
        } else {
            zzb();
        }
    }

    public final p8.p zzb() {
        zzhbx zzhbxVar = (zzhbx) zzhcf.zzg(zzhbx.zzw(this.zzc.zzb()), Throwable.class, zzgko.zza, zzhcw.zza());
        final zzgpe zzgpeVar = this.zza;
        Objects.requireNonNull(zzgpeVar);
        return (zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzk(zzhbxVar, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkn
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgpeVar.zza((zzggb) obj));
            }
        }, zzhcw.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkp
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc((Boolean) obj);
            }
        }, zzhcw.zza());
    }

    public final /* synthetic */ p8.p zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
        return zzhcf.zza(zzgky.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    public final /* synthetic */ zzgfz zzd(zzgfz zzgfzVar) {
        int iZzj = zzgfzVar.zzj() - 1;
        if (iZzj == 1 || iZzj == 2) {
            return zzgfzVar;
        }
        if (iZzj == 3) {
            zzgqo zzgqoVar = this.zzd;
            int iZzj2 = zzgfzVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj2).length());
            sb2.append(iZzj2);
            zzgqoVar.zzc(1004, sb2.toString());
            throw new zzgkm(zzgfzVar.zzj() - 1);
        }
        if (iZzj != 12) {
            zzgqo zzgqoVar2 = this.zzd;
            int iZzj3 = zzgfzVar.zzj() - 1;
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj3).length());
            sb3.append(iZzj3);
            zzgqoVar2.zzc(WebSocketProtocol.CLOSE_NO_STATUS_CODE, sb3.toString());
            throw new zzgkl(zzgfzVar.zzj() - 1);
        }
        zzgqo zzgqoVar3 = this.zzd;
        int iZzj4 = zzgfzVar.zzj() - 1;
        StringBuilder sb4 = new StringBuilder(String.valueOf(iZzj4).length());
        sb4.append(iZzj4);
        zzgqoVar3.zzc(WebSocketProtocol.CLOSE_NO_STATUS_CODE, sb4.toString());
        throw new zzgkk(zzgfzVar.zzj() - 1);
    }

    public final /* synthetic */ p8.p zze(zzgfz zzgfzVar) {
        if (zzgfzVar.zzj() == 2) {
            return this.zzc.zzd(zzgfzVar.zza(), zzgfzVar.zzb().zzA());
        }
        if (zzgfzVar.zzj() == 3) {
            return this.zzc.zzc(zzgfzVar.zza(), zzgfzVar.zzc().zzA(), zzgfzVar.zzb().zzA());
        }
        throw new AssertionError("Unreachable");
    }

    public final /* synthetic */ zzgky zzf(final int i5, zzgkk zzgkkVar) {
        if (this.zzf && i5 < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(i5);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i5)));
        }
        return zzgky.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    public final /* synthetic */ void zzg(int i5) {
        zzh(i5 + 1);
    }
}

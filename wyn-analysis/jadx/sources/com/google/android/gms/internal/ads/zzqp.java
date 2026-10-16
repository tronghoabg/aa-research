package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzqp {
    private final Context zza;
    private final zzqo zzb;
    private final Handler zzc;
    private final zzql zzd;
    private final BroadcastReceiver zze;
    private final zzqm zzf;
    private zzaco zzg;
    private zzqj zzh;
    private AudioDeviceInfo zzi;
    private zzd zzj;
    private boolean zzk;

    /* JADX WARN: Multi-variable type inference failed */
    public zzqp(Context context, zzqo zzqoVar, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = zzqoVar;
        this.zzj = zzdVar;
        this.zzi = audioDeviceInfo;
        Handler handler = new Handler(zzfm.zzf(), null);
        this.zzc = handler;
        this.zzd = new zzql(this, null);
        this.zze = new zzqn(this, 0 == true ? 1 : 0);
        Uri uriZzc = zzqj.zzc();
        this.zzf = uriZzc != null ? new zzqm(this, handler, applicationContext.getContentResolver(), uriZzc) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final List zzg() {
        zzaco zzacoVar;
        return (Build.VERSION.SDK_INT < 32 || (zzacoVar = this.zzg) == null) ? zzgwt.zzi() : zzacoVar.zzf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh(zzqj zzqjVar) {
        if (!this.zzk || zzqjVar.equals(this.zzh)) {
            return;
        }
        this.zzh = zzqjVar;
        this.zzb.zza(zzqjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzi() {
        zzh(zzqj.zza(this.zza, this.zzj, this.zzi, zzg()));
    }

    public final void zza(zzqj zzqjVar) {
        zzh(zzqjVar);
    }

    public final void zzb(zzd zzdVar) {
        if (Objects.equals(zzdVar, this.zzj)) {
            return;
        }
        this.zzj = zzdVar;
        zzh(zzqj.zza(this.zza, zzdVar, this.zzi, zzg()));
    }

    public final void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.zzi)) {
            return;
        }
        this.zzi = audioDeviceInfo;
        zzh(zzqj.zza(this.zza, this.zzj, audioDeviceInfo, zzg()));
    }

    public final zzqj zzd() {
        if (this.zzk) {
            zzqj zzqjVar = this.zzh;
            zzqjVar.getClass();
            return zzqjVar;
        }
        this.zzk = true;
        zzqm zzqmVar = this.zzf;
        if (zzqmVar != null) {
            zzqmVar.zza();
        }
        Context context = this.zza;
        zzql zzqlVar = this.zzd;
        Handler handler = this.zzc;
        zzcj.zza(context).registerAudioDeviceCallback(zzqlVar, handler);
        if (Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzaco(context, new Runnable() { // from class: com.google.android.gms.internal.ads.zzqk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf();
                }
            }, Boolean.valueOf(zzfm.zzR(context)));
        }
        zzqj zzqjVarZzb = zzqj.zzb(context, context.registerReceiver(this.zze, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.zzj, this.zzi, zzg());
        this.zzh = zzqjVarZzb;
        return zzqjVarZzb;
    }

    public final void zze() {
        zzaco zzacoVar;
        if (this.zzk) {
            this.zzh = null;
            Context context = this.zza;
            zzcj.zza(context).unregisterAudioDeviceCallback(this.zzd);
            if (Build.VERSION.SDK_INT >= 32 && (zzacoVar = this.zzg) != null) {
                zzacoVar.zzg();
                this.zzg = null;
            }
            context.unregisterReceiver(this.zze);
            zzqm zzqmVar = this.zzf;
            if (zzqmVar != null) {
                zzqmVar.zzb();
            }
            this.zzk = false;
        }
    }

    public final /* synthetic */ AudioDeviceInfo zzj() {
        return this.zzi;
    }

    public final /* synthetic */ void zzk(AudioDeviceInfo audioDeviceInfo) {
        this.zzi = null;
    }

    public final /* synthetic */ zzd zzl() {
        return this.zzj;
    }
}

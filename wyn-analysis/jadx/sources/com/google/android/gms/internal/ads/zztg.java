package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zztg implements zzrh {
    private final Context zza;
    private final zztf zzb;
    private final float zzc;
    private zzeg zzd;
    private zzdp zze;
    private zzqj zzf;
    private zzqp zzg;
    private Looper zzh;
    private Context zzi;
    private final zztk zzj;

    public /* synthetic */ zztg(zzte zzteVar, byte[] bArr) {
        this.zza = zzteVar.zzd();
        zztk zztkVarZzg = zzteVar.zzg();
        zztkVarZzg.getClass();
        this.zzj = zztkVarZzg;
        this.zzf = zzteVar.zze();
        this.zzb = zzteVar.zzd() != null ? new zztf(this, null) : null;
        this.zzc = 8.0f;
        this.zze = zzdp.zza;
    }

    private final void zzk(zzra zzraVar) {
        Context context;
        zzl();
        zzqp zzqpVar = this.zzg;
        if (zzqpVar == null && (context = this.zza) != null) {
            zzqp zzqpVar2 = new zzqp(context, new zzqo() { // from class: com.google.android.gms.internal.ads.zztd
                @Override // com.google.android.gms.internal.ads.zzqo
                public final /* synthetic */ void zza(zzqj zzqjVar) {
                    this.zza.zzh(zzqjVar);
                }
            }, zzraVar.zzb, zzraVar.zzc);
            this.zzg = zzqpVar2;
            this.zzf = zzqpVar2.zzd();
        } else if (zzqpVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzraVar.zzc;
            if (audioDeviceInfo != null) {
                zzqpVar.zzc(audioDeviceInfo);
            }
            this.zzg.zzb(zzraVar.zzb);
        }
        this.zzf.getClass();
    }

    private final void zzl() {
        if (this.zza == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzh;
        boolean z2 = looper == null || looper == looperMyLooper;
        String strZzm = zzm(looper);
        String strZzm2 = zzm(looperMyLooper);
        if (!z2) {
            throw new IllegalStateException(zzgui.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", strZzm, strZzm2));
        }
        this.zzh = looperMyLooper;
    }

    private static String zzm(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final zzrc zza(zzra zzraVar) {
        zzk(zzraVar);
        zztk zztkVar = this.zzj;
        zzv zzvVar = zzraVar.zza;
        zzd zzdVar = zzraVar.zzb;
        zzqu zzquVarZza = zztkVar.zza(zzvVar, zzdVar);
        zzrb zzrbVar = new zzrb();
        int i5 = 0;
        if (!Objects.equals(zzvVar.zzp, "audio/raw") ? this.zzf.zzf(zzvVar, zzdVar) != null : zzvVar.zzK == 2) {
            i5 = 2;
        }
        zzrbVar.zzd(i5);
        zzrbVar.zza(zzquVarZza.zzb);
        zzrbVar.zzb(zzquVarZza.zzc);
        zzrbVar.zzc(zzquVarZza.zzd);
        return zzrbVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final zzrg zzb(zzra zzraVar) throws zzqy {
        int i5;
        int iZzI;
        int iIntValue;
        int i10;
        int iIntValue2;
        zzk(zzraVar);
        zzv zzvVar = zzraVar.zza;
        String str = zzvVar.zzp;
        if (Objects.equals(str, "audio/raw")) {
            int i11 = zzvVar.zzK;
            zzgtr.zza(zzfm.zzE(i11));
            i5 = zzvVar.zzJ;
            iIntValue2 = zzfm.zzF(zzvVar);
            iZzI = zzfm.zzI(i11) * zzvVar.zzH;
            iIntValue = i11;
            i10 = 0;
        } else {
            i5 = zzvVar.zzJ;
            zzqu zzquVar = zzqu.zza;
            Pair pairZzf = this.zzf.zzf(zzvVar, zzraVar.zzb);
            if (pairZzf == null) {
                throw new zzqy("Unable to configure passthrough for: ".concat(String.valueOf(zzvVar)));
            }
            iZzI = -1;
            iIntValue = ((Integer) pairZzf.first).intValue();
            i10 = 2;
            iIntValue2 = ((Integer) pairZzf.second).intValue();
        }
        int i12 = i5;
        int i13 = zzvVar.zzj;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i13 == -1) {
            i13 = 768000;
        }
        int i14 = i13;
        int iMax = zzraVar.zzf;
        if (iMax == -1) {
            int i15 = iZzI;
            zzgtr.zzi(AudioTrack.getMinBufferSize(i12, iIntValue2, iIntValue) != -2);
            int i16 = i15 == -1 ? 1 : i15;
            iMax = (((Math.max(r8, zztw.zzb(r8, iIntValue, i10, r11, i12, i14)) + i16) - 1) / i16) * i16;
        }
        zzrf zzrfVar = new zzrf();
        zzrfVar.zzb(i12);
        zzrfVar.zzc(iIntValue2);
        zzrfVar.zza(iIntValue);
        zzrfVar.zze(iMax);
        zzrfVar.zzg(zzraVar.zzd);
        zzrfVar.zzf(zzraVar.zzb);
        zzrfVar.zzd(false);
        zzrfVar.zzh(zzraVar.zze);
        return new zzrg(zzrfVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void zzc(zzre zzreVar) {
        zzl();
        if (this.zzd == null) {
            this.zzd = new zzeg(Thread.currentThread());
        }
        this.zzd.zzc(zzreVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void zzd(zzdp zzdpVar) {
        this.zze = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void zze() {
        zzeg zzegVar = this.zzd;
        if (zzegVar != null) {
            zzegVar.zzg();
        }
        zzqp zzqpVar = this.zzg;
        if (zzqpVar != null) {
            zzqpVar.zze();
        }
    }

    public final zztb zzf(zzrg zzrgVar) throws UnsupportedOperationException, IllegalArgumentException, zzrd {
        Context context;
        try {
            int i5 = zzrgVar.zzg;
            int i10 = zzrgVar.zzh;
            Context context2 = null;
            if (i10 != -1 && (context = this.zza) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.zzi;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.zzi = context.createDeviceContext(i10);
                }
                context2 = this.zzi;
                i5 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzrgVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzrgVar.zzb).setChannelMask(zzrgVar.zzc).setEncoding(zzrgVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzrgVar.zze).setSessionId(i5);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i11 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new zztb(audioTrackBuild, zzrgVar, this.zzb, this.zzc, this.zze);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzrd();
        } catch (IllegalArgumentException e7) {
            e = e7;
            throw new zzrd(e);
        } catch (UnsupportedOperationException e10) {
            e = e10;
            throw new zzrd(e);
        }
    }

    public final zzqj zzg() {
        return this.zzf;
    }

    public final void zzh(zzqj zzqjVar) {
        zzl();
        zzqj zzqjVar2 = this.zzf;
        if (zzqjVar2 == null || zzqjVar.equals(zzqjVar2)) {
            return;
        }
        this.zzf = zzqjVar;
        zzeg zzegVar = this.zzd;
        if (zzegVar != null) {
            zzegVar.zze(-1, zztc.zza);
            zzegVar.zzf();
        }
    }

    public final /* synthetic */ void zzi(zzqj zzqjVar) {
        this.zzf = zzqjVar;
    }

    public final /* synthetic */ zzqp zzj() {
        return this.zzg;
    }
}

package com.google.android.gms.internal.ads;

import G5.AbstractC0525f;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzaco {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    public zzaco(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerZza = context == null ? null : zzcj.zza(context);
        if (audioManagerZza == null || (bool != null && bool.booleanValue())) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        Spatializer spatializer = audioManagerZza.getSpatializer();
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        final Handler handler = new Handler(looperMyLooper);
        this.zzc = handler;
        zzacm zzacmVar = new zzacm(this, runnable);
        this.zzd = zzacmVar;
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzacn
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable2) {
                handler.post(runnable2);
            }
        }, zzacmVar);
    }

    public final boolean zza() {
        return this.zza != null && this.zzb && zzc() && zzd();
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean zzd() {
        Spatializer spatializer = this.zza;
        return spatializer != null && spatializer.isEnabled();
    }

    public final boolean zze(zzd zzdVar, zzv zzvVar) throws IllegalArgumentException {
        int i5;
        if (!zza()) {
            return false;
        }
        String str = zzvVar.zzp;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i5 = zzvVar.zzH;
            if (i5 == 16) {
                i5 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i5 = zzvVar.zzH;
            if (i5 == -1) {
                i5 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i5 = zzvVar.zzH;
            if (i5 == 18 || i5 == 21) {
                i5 = 24;
            }
        } else {
            i5 = zzvVar.zzH;
        }
        int iZzG = zzvVar.zzI;
        if (iZzG == -1 || zzvVar.zzH != i5) {
            iZzG = zzfm.zzG(i5);
        }
        if (iZzG == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iZzG);
        int i10 = zzvVar.zzJ;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return AbstractC0525f.c(spatializer).canBeSpatialized(zzdVar.zza(), channelMask.build());
    }

    public final List zzf() {
        if (!zza()) {
            return zzgwt.zzi();
        }
        if (Build.VERSION.SDK_INT < 36) {
            return zzgwt.zzj(252);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return AbstractC0525f.c(spatializer).getSpatializedChannelMasks();
    }

    public final void zzg() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }
}

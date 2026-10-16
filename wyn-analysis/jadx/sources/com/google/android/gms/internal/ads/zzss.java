package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;

/* loaded from: classes3.dex */
final class zzss {
    private final AudioTrack zza;
    private final zzso zzb;
    private final Handler zzc;
    private AudioRouting$OnRoutingChangedListener zzd;

    public /* synthetic */ zzss(AudioTrack audioTrack, zzso zzsoVar, byte[] bArr) {
        this.zza = audioTrack;
        this.zzb = zzsoVar;
        Handler handlerZzd = zzfm.zzd(null);
        this.zzc = handlerZzd;
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzsr
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                this.zza.zza(audioRouting);
            }
        };
        this.zzd = audioRouting$OnRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(audioRouting$OnRoutingChangedListener, handlerZzd);
    }

    public final /* synthetic */ void zza(final AudioRouting audioRouting) {
        if (this.zzd == null) {
            return;
        }
        zzdi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(audioRouting);
            }
        });
    }

    public final /* synthetic */ void zzb(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(routedDevice);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzd == null) {
            return;
        }
        zztg zztgVar = ((zztf) this.zzb).zza;
        if (zztgVar.zzj() != null) {
            zztgVar.zzj().zzc(audioDeviceInfo);
        }
    }

    public final /* synthetic */ void zzd() {
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.zzd;
        audioRouting$OnRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(W1.p.k(audioRouting$OnRoutingChangedListener));
        this.zzd = null;
    }
}

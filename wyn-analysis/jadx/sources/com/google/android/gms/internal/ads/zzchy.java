package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes3.dex */
public final class zzchy implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzchx zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzchy(Context context, zzchx zzchxVar) {
        this.zza = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.zzb = zzchxVar;
    }

    private final void zzf() {
        if (!this.zzd || this.zze || this.zzf <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    this.zzc = audioManager.abandonAudioFocus(this) == 0;
                }
                this.zzb.zzq();
                return;
            }
            return;
        }
        if (this.zzc) {
            return;
        }
        AudioManager audioManager2 = this.zza;
        if (audioManager2 != null) {
            this.zzc = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.zzb.zzq();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i5) {
        this.zzc = i5 > 0;
        this.zzb.zzq();
    }

    public final void zza(boolean z2) {
        this.zze = z2;
        zzf();
    }

    public final void zzb(float f10) {
        this.zzf = f10;
        zzf();
    }

    public final float zzc() {
        return this.zzc ? this.zze ? 0.0f : this.zzf : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void zzd() {
        this.zzd = true;
        zzf();
    }

    public final void zze() {
        this.zzd = false;
        zzf();
    }
}

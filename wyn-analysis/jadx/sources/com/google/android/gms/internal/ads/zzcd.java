package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import cb.AbstractC1593a;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzcd {
    private final zzguj zza;
    private final Handler zzb;
    private zzcc zzc;
    private zzd zzd;
    private int zzf;
    private zzch zzh;
    private float zzg = 1.0f;
    private int zze = 0;

    public zzcd(final Context context, Looper looper, zzcc zzccVar) {
        this.zza = zzgum.zza(new zzguj() { // from class: com.google.android.gms.internal.ads.zzcb
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return zzcj.zza(context);
            }
        });
        this.zzc = zzccVar;
        this.zzb = new Handler(looper);
    }

    private final void zzf() {
        int i5 = this.zze;
        if (i5 == 1 || i5 == 0 || this.zzh == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.zza.zza();
        zzch zzchVar = this.zzh;
        if (Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(zzchVar.zzc());
        } else {
            audioManager.abandonAudioFocus(zzchVar.zzb());
        }
    }

    private final void zzg(int i5) {
        if (this.zze == i5) {
            return;
        }
        this.zze = i5;
        float f10 = i5 == 4 ? 0.2f : 1.0f;
        if (this.zzg != f10) {
            this.zzg = f10;
            zzcc zzccVar = this.zzc;
            if (zzccVar != null) {
                zzccVar.zza(f10);
            }
        }
    }

    private final void zzh(int i5) {
        zzcc zzccVar = this.zzc;
        if (zzccVar != null) {
            zzccVar.zzb(i5);
        }
    }

    public final float zza() {
        return this.zzg;
    }

    public final void zzb(zzd zzdVar) {
        if (Objects.equals(this.zzd, zzdVar)) {
            return;
        }
        this.zzd = zzdVar;
        this.zzf = zzdVar == null ? 0 : 1;
    }

    public final int zzc(boolean z2, int i5) {
        int iRequestAudioFocus;
        if (i5 == 1 || this.zzf != 1) {
            zzf();
            zzg(0);
            return 1;
        }
        int i10 = 3;
        if (!z2) {
            int i11 = this.zze;
            if (i11 == 1) {
                return -1;
            }
            if (i11 == 3) {
                return 0;
            }
        } else if (this.zze != 2) {
            if (this.zzh == null) {
                zzce zzceVar = new zzce(1);
                zzd zzdVar = this.zzd;
                zzdVar.getClass();
                zzceVar.zzb(zzdVar);
                zzceVar.zzc(true);
                zzceVar.zza(new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.zzca
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final /* synthetic */ void onAudioFocusChange(int i12) {
                        this.zza.zze(i12);
                    }
                }, this.zzb);
                this.zzh = zzceVar.zzd();
            }
            AudioManager audioManager = (AudioManager) this.zza.zza();
            zzch zzchVar = this.zzh;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 26) {
                iRequestAudioFocus = audioManager.requestAudioFocus(zzchVar.zzc());
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerZzb = zzchVar.zzb();
                zzd zzdVarZza = zzchVar.zza();
                if (i12 >= 26) {
                    try {
                        int volumeControlStream = zzdVarZza.zza().getVolumeControlStream();
                        if (volumeControlStream != Integer.MIN_VALUE) {
                            i10 = volumeControlStream;
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListenerZzb, i10, 1);
            }
            if (iRequestAudioFocus == 1 || iRequestAudioFocus == 2) {
                zzg(2);
                return 1;
            }
            zzg(1);
            return -1;
        }
        return 1;
    }

    public final void zzd() {
        this.zzc = null;
        zzf();
        zzg(0);
    }

    public final /* synthetic */ void zze(int i5) {
        if (i5 == -3 || i5 == -2) {
            if (i5 != -2) {
                zzg(4);
                return;
            } else {
                zzh(0);
                zzg(3);
                return;
            }
        }
        if (i5 == -1) {
            zzh(-1);
            zzf();
            zzg(1);
        } else if (i5 != 1) {
            AbstractC1593a.v(new StringBuilder(String.valueOf(i5).length() + 27), "Unknown focus change type: ", i5, "AudioFocusManager");
        } else {
            zzg(2);
            zzh(1);
        }
    }
}

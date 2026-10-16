package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzewq implements zzfcs {
    private final zzhcp zza;
    private final Context zzb;

    public zzewq(zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzewp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 13;
    }

    public final zzewr zzc() {
        int iF;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        C6.n nVar = C6.n.f1857D;
        float fB = nVar.f1869i.b();
        boolean zD = nVar.f1869i.d();
        if (audioManager == null) {
            return new zzewr(-1, false, false, -1, -1, -1, -1, -1, fB, zD, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmE)).booleanValue()) {
            iF = nVar.f1866f.f(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iF = -1;
            streamMaxVolume = -1;
        }
        return new zzewr(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iF, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fB, zD, false);
    }
}

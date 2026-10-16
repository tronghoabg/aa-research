package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzuw implements zzvk {
    private final zzguj zza;
    private final zzguj zzb;
    private boolean zzc;

    public zzuw(final int i5) {
        zzguj zzgujVar = new zzguj() { // from class: com.google.android.gms.internal.ads.zzuv
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzux.zzw(i5, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzguj zzgujVar2 = new zzguj() { // from class: com.google.android.gms.internal.ads.zzuu
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzux.zzw(i5, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzgujVar;
        this.zzb = zzgujVar2;
        this.zzc = true;
    }

    public final void zza(boolean z2) {
        this.zzc = true;
    }

    public final zzux zzb(zzvj zzvjVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzvn zzwkVar;
        int i5;
        zzvp zzvpVar = zzvjVar.zza;
        String str = zzvpVar.zza;
        zzux zzuxVar = null;
        try {
            StringBuilder sb2 = new StringBuilder(str.length() + 12);
            sb2.append("createCodec:");
            sb2.append(str);
            Trace.beginSection(sb2.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (this.zzc && Build.VERSION.SDK_INT >= 36) {
                    zzwkVar = new zzwk(mediaCodecCreateByCodecName);
                    i5 = 4;
                } else {
                    zzwkVar = new zzva(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza());
                    i5 = 0;
                }
                zzux zzuxVar2 = new zzux(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), zzwkVar, zzvjVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzvjVar.zzd;
                    if (surface == null && zzvpVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i5 |= 8;
                    }
                    zzuxVar2.zzt(zzvjVar.zzb, surface, null, i5);
                    return zzuxVar2;
                } catch (Exception e7) {
                    exc = e7;
                    zzuxVar = zzuxVar2;
                    if (zzuxVar != null) {
                        zzuxVar.zzl();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e10) {
                exc = e10;
            }
        } catch (Exception e11) {
            exc = e11;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ zzvm zzc(zzvj zzvjVar) throws IOException {
        throw null;
    }
}

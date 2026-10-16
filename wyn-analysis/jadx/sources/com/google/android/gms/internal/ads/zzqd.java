package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzqd implements zznr, zzqe {
    private boolean zzA;
    private final Context zza;
    private final zzqf zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzau zzo;
    private zzqc zzp;
    private zzqc zzq;
    private zzqc zzr;
    private zzv zzs;
    private zzv zzt;
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzdi.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzqd(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzpw zzpwVar = new zzpw(zzpw.zza);
        this.zzc = zzpwVar;
        zzpwVar.zza(this);
    }

    private final void zzA(int i5, long j8, zzv zzvVar, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = F5.i.j(i5).setTimeSinceCreatedMillis(j8 - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i10 != 1 ? 1 : 2);
            String str = zzvVar.zzo;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.zzp;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i11 = zzvVar.zzj;
            if (i11 != -1) {
                timeSinceCreatedMillis.setBitrate(i11);
            }
            int i12 = zzvVar.zzw;
            if (i12 != -1) {
                timeSinceCreatedMillis.setWidth(i12);
            }
            int i13 = zzvVar.zzx;
            if (i13 != -1) {
                timeSinceCreatedMillis.setHeight(i13);
            }
            int i14 = zzvVar.zzH;
            if (i14 != -1) {
                timeSinceCreatedMillis.setChannelCount(i14);
            }
            int i15 = zzvVar.zzJ;
            if (i15 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i15);
            }
            String str4 = zzvVar.zzd;
            if (str4 != null) {
                String str5 = zzfm.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzvVar.zzA;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    private final void zzB(zzbf zzbfVar, zzxl zzxlVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzxlVar == null || (iZze = zzbfVar.zze(zzxlVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i5 = 0;
        zzbfVar.zzd(iZze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int iZzK = zzfm.zzK(zzagVar.zza);
            i5 = iZzK != 0 ? iZzK != 1 ? iZzK != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i5);
        long j8 = zzbeVar.zzm;
        if (j8 != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(zzfm.zzs(j8));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l10 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.zzk.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private static int zzD(int i5) {
        switch (zzfm.zzJ(i5)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static zzqd zza(Context context) {
        MediaMetricsManager mediaMetricsManagerE = V1.h.e(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerE == null) {
            return null;
        }
        return new zzqd(context, mediaMetricsManagerE.createPlaybackSession());
    }

    private final boolean zzw(zzqc zzqcVar) {
        if (zzqcVar != null) {
            return zzqcVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j8, zzv zzvVar, int i5) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i10 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j8, zzvVar, i10);
    }

    private final void zzy(long j8, zzv zzvVar, int i5) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i10 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j8, zzvVar, i10);
    }

    private final void zzz(long j8, zzv zzvVar, int i5) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i10 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j8, zzvVar, i10);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzc(zznp zznpVar, String str) {
        zzxl zzxlVar = zznpVar.zzd;
        if (zzxlVar == null || !zzxlVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = V1.h.f().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
            zzB(zznpVar.zzb, zzxlVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzd(zznp zznpVar, String str, boolean z2) {
        zzxl zzxlVar = zznpVar.zzd;
        if ((zzxlVar == null || !zzxlVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzde(zznp zznpVar, zzba zzbaVar, zzba zzbaVar2, int i5) {
        if (i5 == 1) {
            this.zzv = true;
            i5 = 1;
        }
        this.zzl = i5;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzdf(zznp zznpVar, zzxh zzxhVar) {
        zzxl zzxlVar = zznpVar.zzd;
        if (zzxlVar == null) {
            return;
        }
        zzv zzvVar = zzxhVar.zzb;
        zzvVar.getClass();
        zzqc zzqcVar = new zzqc(zzvVar, 0, this.zzc.zzb(zznpVar.zzb, zzxlVar));
        int i5 = zzxhVar.zza;
        if (i5 != 0) {
            if (i5 == 1) {
                this.zzq = zzqcVar;
                return;
            } else if (i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                this.zzr = zzqcVar;
                return;
            }
        }
        this.zzp = zzqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzdg(zznp zznpVar, int i5, long j8, long j10) {
        zzxl zzxlVar = zznpVar.zzd;
        if (zzxlVar != null) {
            String strZzb = this.zzc.zzb(zznpVar.zzb, zzxlVar);
            HashMap map = this.zzi;
            Long l10 = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l11 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j8));
            map2.put(strZzb, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzdh(zznp zznpVar, zzjd zzjdVar) {
        this.zzx += zzjdVar.zzg;
        this.zzy += zzjdVar.zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029a  */
    @Override // com.google.android.gms.internal.ads.zznr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzdi(com.google.android.gms.internal.ads.zzbb r20, com.google.android.gms.internal.ads.zznq r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqd.zzdi(com.google.android.gms.internal.ads.zzbb, com.google.android.gms.internal.ads.zznq):void");
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zze(zznp zznpVar, int i5) {
        J.f(this, zznpVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzg(zznp zznpVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzh(zznp zznpVar, zzxc zzxcVar, zzxh zzxhVar, IOException iOException, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zzk(zznp zznpVar, zzv zzvVar, zzje zzjeVar) {
        J.i(this, zznpVar, zzvVar, zzjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zzl(zznp zznpVar, zzv zzvVar, zzje zzjeVar) {
        J.j(this, zznpVar, zzvVar, zzjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zzm(zznp zznpVar, int i5, long j8) {
        J.k(this, zznpVar, i5, j8);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final /* synthetic */ void zzo(zznp zznpVar, Object obj, long j8) {
        J.l(this, zznpVar, obj, j8);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzp(zznp zznpVar, zzbv zzbvVar) {
        zzqc zzqcVar = this.zzp;
        if (zzqcVar != null) {
            zzv zzvVar = zzqcVar.zza;
            if (zzvVar.zzx == -1) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzv(zzbvVar.zzb);
                zztVarZza.zzw(zzbvVar.zzc);
                this.zzp = new zzqc(zztVarZza.zzP(), 0, zzqcVar.zzc);
            }
        }
    }

    public final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}

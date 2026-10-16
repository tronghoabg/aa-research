package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.di.ServiceProvider;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzji implements zzma {
    public static final zzgwt zza = zzgwt.zzn("file", "content", JsonStorageKeyNames.DATA_KEY, "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzabs zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgww zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzji() {
        zzabs zzabsVar = new zzabs(true, 65536);
        zzgww zzgwwVarZza = zzgww.zza();
        zzq(1000, 0, "bufferForPlaybackMs", "0");
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzabsVar;
        this.zze = zzfm.zzt(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzf = zzfm.zzt(1000L);
        this.zzg = zzfm.zzt(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzh = zzfm.zzt(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzi = zzfm.zzt(1000L);
        this.zzj = zzfm.zzt(1000L);
        this.zzk = zzfm.zzt(2000L);
        this.zzl = zzfm.zzt(1000L);
        this.zzm = zzfm.zzt(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgww.zzc(zzgwwVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzqh zzqhVar) {
        Integer num = (Integer) this.zzn.get(zzqhVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzqh zzqhVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzjh zzjhVar = (zzjh) concurrentHashMap.get(zzqhVar);
        if (zzjhVar != null) {
            int i5 = zzjhVar.zza - 1;
            zzjhVar.zza = i5;
            if (i5 == 0) {
                concurrentHashMap.remove(zzqhVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzabs zzabsVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += ((zzjh) it.next()).zzc;
        }
        zzabsVar.zzf(i5);
    }

    private final boolean zzp(zzlz zzlzVar) {
        zzbf zzbfVar = zzlzVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzlzVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i5, int i10, String str, String str2) {
        zzgtr.zzh(i5 >= i10, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzqh zzqhVar) {
        zzjh zzjhVar = (zzjh) this.zzo.get(zzqhVar);
        zzjhVar.getClass();
        return zzjhVar.zzc() * 65536;
    }

    private final int zzs(zzqh zzqhVar) {
        zzjh zzjhVar = (zzjh) this.zzo.get(zzqhVar);
        zzjhVar.getClass();
        return zzjhVar.zzc;
    }

    private static final boolean zzt(boolean z2) {
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zza(zzqh zzqhVar) {
        long id2 = Thread.currentThread().getId();
        long j8 = this.zzp;
        zzgtr.zzj(j8 == -1 || j8 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id2;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzjh zzjhVar = (zzjh) concurrentHashMap.get(zzqhVar);
        if (zzjhVar == null) {
            concurrentHashMap.put(zzqhVar, new zzjh());
        } else {
            zzjhVar.zza++;
        }
        zzjh zzjhVar2 = (zzjh) concurrentHashMap.get(zzqhVar);
        zzjhVar2.getClass();
        int iZzm = zzm(zzqhVar);
        if (iZzm == -1) {
            iZzm = 13107200;
        }
        zzjhVar2.zzc = iZzm;
        zzjhVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzb(zzlz zzlzVar, zzzo zzzoVar, zzabb[] zzabbVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqh zzqhVar = zzlzVar.zza;
        int iZzm = zzm(zzqhVar);
        zzjh zzjhVar = (zzjh) concurrentHashMap.get(zzqhVar);
        zzjhVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzlzVar);
            int length = zzabbVarArr.length;
            int i5 = 0;
            int i10 = 0;
            while (true) {
                int i11 = 13107200;
                if (i5 < length) {
                    zzabb zzabbVar = zzabbVarArr[i5];
                    if (zzabbVar != null) {
                        switch (zzabbVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i11 = 144310272;
                                break;
                            case 2:
                                if (!zZzp) {
                                    i11 = 131072000;
                                    break;
                                } else {
                                    i11 = 19660800;
                                    break;
                                }
                            case 3:
                            case 5:
                            default:
                                i11 = 131072;
                                break;
                            case 4:
                                i11 = 26214400;
                                break;
                        }
                        i10 += i11;
                    }
                    i5++;
                } else {
                    String str = zzfm.zza;
                    iZzm = Math.max(13107200, Math.min(i10, 210239488));
                }
            }
        }
        zzjhVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzc(zzqh zzqhVar) {
        zzn(zzqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzd(zzqh zzqhVar) {
        zzn(zzqhVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final zzabm zze(zzqh zzqhVar) {
        return new zzjg(this, zzqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final long zzf(zzqh zzqhVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzg(zzqh zzqhVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzh(zzlz zzlzVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqh zzqhVar = zzlzVar.zza;
        zzjh zzjhVar = (zzjh) concurrentHashMap.get(zzqhVar);
        zzjhVar.getClass();
        int iZzr = zzr(zzqhVar);
        int iZzs = zzs(zzqhVar);
        boolean z2 = false;
        if (zzqhVar.equals(zzqh.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzlzVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j8 = zZzp ? this.zzh : this.zzg;
        float f10 = zzlzVar.zzf;
        if (f10 > 1.0f) {
            jMin = Math.min(zzfm.zzy(jMin, f10), j8);
        }
        long j10 = zzlzVar.zze;
        if (j10 < Math.max(jMin, 500000L)) {
            boolean zZzt = zzt(zZzp);
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            boolean z10 = runtime.totalMemory() < jMaxMemory || runtime.freeMemory() + ((long) this.zzd.zzh()) >= jMaxMemory / 25;
            if (!zZzt ? iZzr < iZzs : !(!z10 && iZzr >= iZzs)) {
                z2 = true;
            }
            zzjhVar.zzb = z2;
            if (!z2 && zZzt && !z10) {
                zzeh.zzb("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!zzjhVar.zzb && j10 < 500000) {
                zzeh.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j8 || iZzr >= iZzs) {
            zzjhVar.zzb = false;
        }
        return zzjhVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzi(zzlz zzlzVar) {
        long jMin;
        boolean z2;
        boolean z10 = zzlzVar.zzg;
        long j8 = zzlzVar.zze;
        float f10 = zzlzVar.zzf;
        boolean zZzp = zzp(zzlzVar);
        long jZzz = zzfm.zzz(j8, f10);
        if (z10) {
            if (zZzp) {
                jMin = this.zzl;
                z2 = true;
            } else {
                jMin = this.zzk;
                z2 = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z2 = true;
        } else {
            jMin = this.zzi;
            z2 = false;
        }
        long j10 = zzlzVar.zzh;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jZzz >= jMin) {
            return true;
        }
        if (!zzt(z2)) {
            zzqh zzqhVar = zzlzVar.zza;
            if (zzr(zzqhVar) >= zzs(zzqhVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzj(zzqh zzqhVar, zzbf zzbfVar, zzxl zzxlVar, long j8) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzjh) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzabs zzk() {
        return this.zzd;
    }

    public final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}

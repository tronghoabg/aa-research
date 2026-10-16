package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzjd {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i5 = this.zza;
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zzd;
        int i13 = this.zze;
        int i14 = this.zzf;
        int i15 = this.zzg;
        int i16 = this.zzh;
        int i17 = this.zzi;
        int i18 = this.zzj;
        long j8 = this.zzk;
        int i19 = this.zzl;
        String str = zzfm.zza;
        Locale locale = Locale.US;
        StringBuilder sbH = R8.v.h("DecoderCounters {\n decoderInits=", i5, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        R8.v.i(i11, i12, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbH);
        R8.v.i(i13, i14, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbH);
        R8.v.i(i15, i16, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbH);
        R8.v.i(i17, i18, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbH);
        sbH.append(j8);
        sbH.append("\n videoFrameProcessingOffsetCount=");
        sbH.append(i19);
        sbH.append("\n}");
        return sbH.toString();
    }

    public final synchronized void zza() {
    }
}

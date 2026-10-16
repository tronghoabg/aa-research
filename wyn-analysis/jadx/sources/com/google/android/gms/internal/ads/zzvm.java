package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public interface zzvm {
    void zza(int i5, int i10, int i11, long j8, int i12);

    void zzb(int i5, int i10, zziu zziuVar, long j8, int i11);

    void zzc(int i5, boolean z2);

    void zzd(int i5, long j8);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    ByteBuffer zzh(int i5);

    void zzi(Runnable runnable);

    ByteBuffer zzj(int i5);

    void zzk();

    void zzl();

    boolean zzm(zzvl zzvlVar);

    void zzn(Surface surface);

    void zzo();

    void zzp(Bundle bundle);

    void zzq(int i5);

    void zzr(List list);
}

package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i5, int i10, long j8, int i11, int i12, int i13, int i14) {
        zzmjVar.zzc(zzc(i5, i10, j8, i11, i12, i13, i14), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i5, int i10, long j8, int i11, int i12, int i13, int i14) {
        zzmjVar.zzc(zzc(i5, i10, j8, i11, i12, i13, i14), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i5, int i10, long j8, int i11, int i12, int i13, int i14) {
        return new zzmt(i5, i10, i13, i11, i12, SystemClock.elapsedRealtime() - j8, i14);
    }
}

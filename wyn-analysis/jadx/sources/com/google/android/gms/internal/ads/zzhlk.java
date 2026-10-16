package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
class zzhlk {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzhlk(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    public void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void zzb(zzhlk zzhlkVar, int i5) {
        zzhlj.zza(this.zza, zzhlkVar.zza, i5);
        zzhlj.zza(this.zzb, zzhlkVar.zzb, i5);
        zzhlj.zza(this.zzc, zzhlkVar.zzc, i5);
    }

    public zzhlk() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhlk(zzhlk zzhlkVar) {
        this.zza = Arrays.copyOf(zzhlkVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhlkVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhlkVar.zzc, 10);
    }
}

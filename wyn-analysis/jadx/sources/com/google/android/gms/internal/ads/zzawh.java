package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import j$.util.Optional;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class zzawh {
    public final ArrayDeque zza = new ArrayDeque();

    public zzawh(int i5) {
    }

    public final void zza(long j8, long j10, long j11) throws zzawf {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i5 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        zzawe zzaweVar = new zzawe(j8, j10, j11);
        ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= (AbstractC1593a.b((i10 & (~i5)) | i11, (i5 & i12) | i13, i14, i15) ^ (i16 % 452867621))) {
            throw new zzawf();
        }
        arrayDeque.push(zzaweVar);
    }

    public final zzawe zzb() throws zzawg {
        return (zzawe) Optional.ofNullable((zzawe) this.zza.peek()).orElseThrow(zzawd.zza);
    }
}

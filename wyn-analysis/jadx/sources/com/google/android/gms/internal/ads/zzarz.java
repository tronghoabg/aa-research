package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzarz {
    public final int zza;
    public final long zzb;

    private zzarz(int i5, long j8) {
        this.zza = i5;
        this.zzb = j8;
    }

    public static zzarz zza(zzagb zzagbVar, zzeu zzeuVar) throws IOException {
        zzagbVar.zzi(zzeuVar.zzi(), 0, 8);
        zzeuVar.zzh(0);
        return new zzarz(zzeuVar.zzB(), zzeuVar.zzA());
    }
}

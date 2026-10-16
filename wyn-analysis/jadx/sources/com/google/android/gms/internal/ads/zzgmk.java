package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgmk {
    private final zzave zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzgmk(zzave zzaveVar, long j8, long j10, String str) {
        this.zza = zzaveVar;
        this.zzb = j8;
        this.zzc = j10;
        this.zzd = str;
    }

    public static /* synthetic */ zzgmk zza(zzave zzaveVar, byte[] bArr, boolean z2) throws zzavg, zzavc {
        zzaveVar.zza();
        zzaveVar.zzb(bArr);
        List list = (List) zzaveVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzaveVar.zzd(jLongValue, Optional.empty());
        String strZza = zzgel.zza(zzavh.zza(), false);
        int length = strZza.length();
        String str = true != z2 ? "" : "-s";
        return new zzgmk(zzaveVar, jLongValue2, jLongValue3, M6.t(new StringBuilder(str.length() + length + 12), "3.893135394.", strZza, str));
    }

    public final /* synthetic */ String zzb(Map map) {
        return zzgel.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    public final /* synthetic */ void zzc(Map map) throws zzavg, zzavc {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    public final /* synthetic */ String zzd() {
        return this.zzd;
    }
}

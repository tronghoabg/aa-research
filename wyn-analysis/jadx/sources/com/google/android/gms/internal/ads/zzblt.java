package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzblt extends zzbmd {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int iRgb = Color.rgb(12, 174, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE);
        zzc = iRgb;
        zza = Color.rgb(204, 204, 204);
        zzb = iRgb;
    }

    public zzblt(String str, List list, Integer num, Integer num2, Integer num3, int i5, int i10, boolean z2) {
        this.zzd = str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzblw zzblwVar = (zzblw) list.get(i11);
            this.zze.add(zzblwVar);
            this.zzf.add(zzblwVar);
        }
        this.zzg = num != null ? num.intValue() : zza;
        this.zzh = num2 != null ? num2.intValue() : zzb;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i5;
        this.zzk = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final String zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final List zzc() {
        return this.zzf;
    }

    public final List zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzg;
    }

    public final int zzf() {
        return this.zzh;
    }

    public final int zzg() {
        return this.zzi;
    }

    public final int zzh() {
        return this.zzj;
    }

    public final int zzi() {
        return this.zzk;
    }
}

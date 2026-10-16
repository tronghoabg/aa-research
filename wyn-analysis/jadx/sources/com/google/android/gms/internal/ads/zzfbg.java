package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzfbg implements zzfcq {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzfbg(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflv.zze(bundle, "pn", this.zza);
        zzflv.zzh(bundle, "vc", this.zzb);
        zzflv.zze(bundle, "vnm", this.zzc);
        zzflv.zze(bundle, "dl", this.zzd);
        zzflv.zze(bundle, "ins_pn", this.zze);
        zzflv.zze(bundle, "ini_pn", this.zzf);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzgeq implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzgeq(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzgeq zza(zzini zziniVar, zzini zziniVar2) {
        return new zzgeq(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzgdq zzgdqVar = (zzgdq) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        AbstractC3256n.p(sb2, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb2.append(")");
        return new zzgev(executorService, sb2.toString(), zzgdqVar.zzn());
    }
}

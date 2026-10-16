package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzarx implements zzaga {
    private zzagd zza;
    private zzahm zzb;
    private zzaru zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        return zzasa.zza(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zza = zzagdVar;
        this.zzb = zzagdVar.zzs(0, 1);
        zzagdVar.zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzagb r19, com.google.android.gms.internal.ads.zzaha r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarx.zzd(com.google.android.gms.internal.ads.zzagb, com.google.android.gms.internal.ads.zzaha):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        this.zzc = j8 == 0 ? 0 : 4;
        zzaru zzaruVar = this.zze;
        if (zzaruVar != null) {
            zzaruVar.zza(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfbm implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;
    private final zzflg zzc;
    private final H6.a zzd;

    public zzfbm(Context context, zzhcp zzhcpVar, zzflg zzflgVar, H6.a aVar) {
        this.zza = context;
        this.zzb = zzhcpVar;
        this.zzc = zzflgVar;
        this.zzd = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007e, B:19:0x0090, B:21:0x00a4, B:23:0x00ad, B:28:0x00cf, B:30:0x00eb, B:31:0x010f, B:33:0x011a, B:26:0x00bf, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007e, B:19:0x0090, B:21:0x00a4, B:23:0x00ad, B:28:0x00cf, B:30:0x00eb, B:31:0x010f, B:33:0x011a, B:26:0x00bf, B:14:0x0046), top: B:37:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzfbn zzc() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbm.zzc():com.google.android.gms.internal.ads.zzfbn");
    }
}

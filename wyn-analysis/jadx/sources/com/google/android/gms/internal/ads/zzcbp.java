package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzcbp implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcbr zzb;

    public zzcbp(zzcbr zzcbrVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzcbrVar);
        this.zzb = zzcbrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcbr r0 = r7.zzb
            java.util.WeakHashMap r1 = r0.zzb()
            android.content.Context r2 = r7.zza
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzcbq r1 = (com.google.android.gms.internal.ads.zzcbq) r1
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.ads.zzbkh r3 = com.google.android.gms.internal.ads.zzbkm.zzd
            java.lang.Object r3 = r3.zze()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r5 = r1.zza
            long r5 = r5 + r3
            C6.n r3 = C6.n.f1857D
            n7.b r3 = r3.k
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L3b
        L2f:
            com.google.android.gms.internal.ads.zzcbo r1 = r1.zzb
            com.google.android.gms.internal.ads.zzcbn r3 = new com.google.android.gms.internal.ads.zzcbn
            r3.<init>(r2, r1)
            com.google.android.gms.internal.ads.zzcbo r1 = r3.zza()
            goto L44
        L3b:
            com.google.android.gms.internal.ads.zzcbn r1 = new com.google.android.gms.internal.ads.zzcbn
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzcbo r1 = r1.zza()
        L44:
            com.google.android.gms.internal.ads.zzcbq r3 = new com.google.android.gms.internal.ads.zzcbq
            r3.<init>(r0, r1)
            java.util.WeakHashMap r0 = r0.zzb()
            r0.put(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbp.call():java.lang.Object");
    }
}

package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzeaw {
    private final Map zza = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:8:0x0019, B:10:0x0032, B:12:0x0038, B:14:0x0041, B:18:0x0049, B:25:0x0068, B:29:0x0096, B:31:0x00a0, B:32:0x00a8, B:33:0x00af, B:35:0x00b5, B:36:0x00b9, B:38:0x00ce, B:39:0x00d7, B:41:0x00dd, B:43:0x00eb, B:45:0x00f1, B:46:0x0103, B:48:0x0109, B:50:0x011b, B:52:0x0123, B:56:0x0134, B:58:0x013c, B:60:0x0142, B:62:0x014b, B:63:0x0154, B:26:0x0077, B:27:0x0086), top: B:70:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zza(long r8, int r10, long r11) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeaw.zza(long, int, long):void");
    }

    public final synchronized Map zzb() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziQ)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                map.put((zzeaz) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() {
        /*
            r9 = this;
            C6.n r0 = C6.n.f1857D
            n7.b r0 = r0.k
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Map r2 = r9.zza
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La7
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.ads.zzeaz r4 = (com.google.android.gms.internal.ads.zzeaz) r4
            java.lang.Object r3 = r3.getValue()
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            int r4 = r4.zzb()
            r5 = 0
            if (r4 == 0) goto L3e
            r7 = 1
            if (r4 == r7) goto L62
            r7 = 2
            if (r4 == r7) goto L51
            r7 = 3
            if (r4 == r7) goto L40
        L3e:
            r7 = r5
            goto L72
        L40:
            com.google.android.gms.internal.ads.zzbio r4 = com.google.android.gms.internal.ads.zzbix.zziW
            D6.s r7 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r7 = r7.f2492c
            java.lang.Object r4 = r7.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L72
        L51:
            com.google.android.gms.internal.ads.zzbio r4 = com.google.android.gms.internal.ads.zzbix.zziV
            D6.s r7 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r7 = r7.f2492c
            java.lang.Object r4 = r7.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L72
        L62:
            com.google.android.gms.internal.ads.zzbio r4 = com.google.android.gms.internal.ads.zzbix.zziU
            D6.s r7 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r7 = r7.f2492c
            java.lang.Object r4 = r7.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
        L72:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L7a
            r2.remove()
            r7 = r5
        L7a:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L15
            java.util.Iterator r4 = r3.iterator()
        L82:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9c
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = r0 - r5
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L9c
            r4.remove()
            goto L82
        L9c:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L15
            r2.remove()
            goto L15
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeaw.zzc():void");
    }
}

package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzejs implements zzhcc {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzejt zzb;

    public zzejs(zzejt zzejtVar, boolean z2) {
        this.zza = z2;
        Objects.requireNonNull(zzejtVar);
        this.zzb = zzejtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        int i5 = G6.L.f4523b;
        H6.l.c("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // com.google.android.gms.internal.ads.zzhcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzejt r0 = r8.zzb
            android.os.Bundle r9 = (android.os.Bundle) r9
            boolean r1 = r0.zzf()
            if (r1 != 0) goto Lc1
            java.lang.String r1 = "ad_types"
            java.lang.Object r1 = r9.get(r1)
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L17
            java.util.List r1 = (java.util.List) r1
            goto L21
        L17:
            boolean r2 = r1 instanceof java.lang.String[]
            if (r2 == 0) goto L47
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.List r1 = java.util.Arrays.asList(r1)
        L21:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L2e
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L2e
        L42:
            java.util.List r1 = j$.util.DesugarCollections.unmodifiableList(r2)
            goto L49
        L47:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L49:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L52:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 2
            r6 = 3
            r7 = 1
            switch(r3) {
                case -1396342996: goto L87;
                case -1052618729: goto L7d;
                case -239580146: goto L73;
                case 604727084: goto L69;
                default: goto L68;
            }
        L68:
            goto L91
        L69:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L91
            r2 = r7
            goto L92
        L73:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L91
            r2 = r6
            goto L92
        L7d:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L91
            r2 = r4
            goto L92
        L87:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L91
            r2 = 0
            goto L92
        L91:
            r2 = -1
        L92:
            if (r2 == 0) goto La6
            if (r2 == r7) goto La3
            if (r2 == r4) goto La0
            if (r2 == r6) goto L9d
            com.google.android.gms.internal.ads.zzbic$zzd$zza r2 = com.google.android.gms.internal.ads.zzbic.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto La8
        L9d:
            com.google.android.gms.internal.ads.zzbic$zzd$zza r2 = com.google.android.gms.internal.ads.zzbic.zzd.zza.REWARD_BASED_VIDEO_AD
            goto La8
        La0:
            com.google.android.gms.internal.ads.zzbic$zzd$zza r2 = com.google.android.gms.internal.ads.zzbic.zzd.zza.NATIVE_APP_INSTALL
            goto La8
        La3:
            com.google.android.gms.internal.ads.zzbic$zzd$zza r2 = com.google.android.gms.internal.ads.zzbic.zzd.zza.INTERSTITIAL
            goto La8
        La6:
            com.google.android.gms.internal.ads.zzbic$zzd$zza r2 = com.google.android.gms.internal.ads.zzbic.zzd.zza.BANNER
        La8:
            r5.add(r2)
            goto L52
        Lac:
            com.google.android.gms.internal.ads.zzbic$zzaf$zzd r7 = com.google.android.gms.internal.ads.zzejt.zze(r9)
            com.google.android.gms.internal.ads.zzbic$zzab r6 = r0.zzb(r9)
            boolean r4 = r8.zza
            com.google.android.gms.internal.ads.zzejr r2 = new com.google.android.gms.internal.ads.zzejr
            r3 = r8
            r2.<init>()
            com.google.android.gms.internal.ads.zzejh r9 = r0.zza
            r9.zza(r2)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejs.zzb(java.lang.Object):void");
    }
}

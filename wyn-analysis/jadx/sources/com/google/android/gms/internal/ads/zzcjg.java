package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcjg implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcjh zze;

    public zzcjg(zzcjh zzcjhVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        Objects.requireNonNull(zzcjhVar);
        this.zze = zzcjhVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            java.lang.String r1 = "precacheCanceled"
            java.util.HashMap r0 = cb.AbstractC1593a.l(r0, r1)
            java.lang.String r1 = "src"
            java.lang.String r2 = r4.zza
            r0.put(r1, r2)
            java.lang.String r1 = r4.zzb
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L1c
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
        L1c:
            java.lang.String r1 = r4.zzc
            int r2 = r1.hashCode()
            switch(r2) {
                case -1947652542: goto L9b;
                case -1396664534: goto L90;
                case -1347010958: goto L86;
                case -918817863: goto L7b;
                case -659376217: goto L71;
                case -642208130: goto L67;
                case -354048396: goto L5c;
                case -32082395: goto L51;
                case 3387234: goto L47;
                case 96784904: goto L3d;
                case 580119100: goto L32;
                case 725497484: goto L27;
                default: goto L25;
            }
        L25:
            goto La5
        L27:
            java.lang.String r2 = "noCacheDir"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 7
            goto La6
        L32:
            java.lang.String r2 = "expireFailed"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 6
            goto La6
        L3d:
            java.lang.String r2 = "error"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 1
            goto La6
        L47:
            java.lang.String r2 = "noop"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 4
            goto La6
        L51:
            java.lang.String r2 = "externalAbort"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 10
            goto La6
        L5c:
            java.lang.String r2 = "sizeExceeded"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 11
            goto La6
        L67:
            java.lang.String r2 = "playerFailed"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 5
            goto La6
        L71:
            java.lang.String r2 = "contentLengthMissing"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 0
            goto La6
        L7b:
            java.lang.String r2 = "downloadTimeout"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 9
            goto La6
        L86:
            java.lang.String r2 = "inProgress"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 2
            goto La6
        L90:
            java.lang.String r2 = "badUrl"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 8
            goto La6
        L9b:
            java.lang.String r2 = "interrupted"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La5
            r2 = 3
            goto La6
        La5:
            r2 = -1
        La6:
            java.lang.String r3 = "internal"
            switch(r2) {
                case 0: goto Lb4;
                case 1: goto Lb4;
                case 2: goto Lb4;
                case 3: goto Lb4;
                case 4: goto Lb4;
                case 5: goto Lb4;
                case 6: goto Lb2;
                case 7: goto Lb2;
                case 8: goto Laf;
                case 9: goto Laf;
                case 10: goto Lac;
                case 11: goto Lac;
                default: goto Lab;
            }
        Lab:
            goto Lb4
        Lac:
            java.lang.String r3 = "policy"
            goto Lb4
        Laf:
            java.lang.String r3 = "network"
            goto Lb4
        Lb2:
            java.lang.String r3 = "io"
        Lb4:
            java.lang.String r2 = "type"
            r0.put(r2, r3)
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r4.zzd
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Lcb
            java.lang.String r2 = "message"
            r0.put(r2, r1)
        Lcb:
            com.google.android.gms.internal.ads.zzcjh r1 = r4.zze
            java.lang.String r2 = "onPrecacheEvent"
            r1.zzw(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjg.run():void");
    }
}

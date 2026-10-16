package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzelp implements zzelq {
    public static /* synthetic */ zzelv zzl(String str, String str2, String str3, zzelr zzelrVar, String str4, WebView webView, String str5, String str6, zzels zzelsVar) {
        zzfvi zzfviVarZza = zzfvi.zza("Google", str2);
        zzfvh zzfvhVarZzn = zzn("javascript");
        zzfuz zzfuzVarZzp = zzp(zzelrVar.toString());
        zzfvh zzfvhVar = zzfvh.NONE;
        if (zzfvhVarZzn == zzfvhVar) {
            int i5 = G6.L.f4523b;
            H6.l.f("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfuzVarZzp == null) {
            String strValueOf = String.valueOf(zzelrVar);
            int i10 = G6.L.f4523b;
            H6.l.f("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzfvh zzfvhVarZzn2 = zzn(str4);
        if (zzfuzVarZzp != zzfuz.VIDEO || zzfvhVarZzn2 != zzfvhVar) {
            zzfuw zzfuwVarZza = zzfuw.zza(zzfviVarZza, webView, str5, "");
            return new zzelv(zzfuu.zze(zzfuv.zza(zzfuzVarZzp, zzo(zzelsVar.toString()), zzfvhVarZzn, zzfvhVarZzn2, true), zzfuwVarZza), zzfuwVarZza);
        }
        String strValueOf2 = String.valueOf(str4);
        int i11 = G6.L.f4523b;
        H6.l.f("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    public static /* synthetic */ zzelv zzm(String str, String str2, String str3, String str4, zzelr zzelrVar, WebView webView, String str5, String str6, zzels zzelsVar) {
        zzfvi zzfviVarZza = zzfvi.zza(str, str2);
        zzfvh zzfvhVarZzn = zzn("javascript");
        zzfvh zzfvhVarZzn2 = zzn(str4);
        zzfuz zzfuzVarZzp = zzp(zzelrVar.toString());
        zzfvh zzfvhVar = zzfvh.NONE;
        if (zzfvhVarZzn == zzfvhVar) {
            int i5 = G6.L.f4523b;
            H6.l.f("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfuzVarZzp == null) {
            String strValueOf = String.valueOf(zzelrVar);
            int i10 = G6.L.f4523b;
            H6.l.f("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfuzVarZzp != zzfuz.VIDEO || zzfvhVarZzn2 != zzfvhVar) {
            zzfuw zzfuwVarZzb = zzfuw.zzb(zzfviVarZza, webView, str5, "");
            return new zzelv(zzfuu.zze(zzfuv.zza(zzfuzVarZzp, zzo(zzelsVar.toString()), zzfvhVarZzn, zzfvhVarZzn2, true), zzfuwVarZzb), zzfuwVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i11 = G6.L.f4523b;
        H6.l.f("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    private static zzfvh zzn(String str) {
        return "native".equals(str) ? zzfvh.NATIVE : "javascript".equals(str) ? zzfvh.JAVASCRIPT : zzfvh.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzfvc zzo(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.zzfvc r4 = com.google.android.gms.internal.ads.zzfvc.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.zzfvc r4 = com.google.android.gms.internal.ads.zzfvc.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.zzfvc r4 = com.google.android.gms.internal.ads.zzfvc.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.zzfvc r4 = com.google.android.gms.internal.ads.zzfvc.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelp.zzo(java.lang.String):com.google.android.gms.internal.ads.zzfvc");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzfuz zzp(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzfuz r4 = com.google.android.gms.internal.ads.zzfuz.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.zzfuz r4 = com.google.android.gms.internal.ads.zzfuz.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.zzfuz r4 = com.google.android.gms.internal.ads.zzfuz.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelp.zzp(java.lang.String):com.google.android.gms.internal.ads.zzfuz");
    }

    private static final Object zzq(zzelo zzeloVar) {
        try {
            return zzeloVar.zza();
        } catch (RuntimeException e7) {
            C6.n.f1857D.f1868h.zzi(e7, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e7) {
            C6.n.f1857D.f1868h.zzi(e7, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final boolean zza(final Context context) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgq)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzelo() { // from class: com.google.android.gms.internal.ads.zzeln
                @Override // com.google.android.gms.internal.ads.zzelo
                public final /* synthetic */ Object zza() {
                    if (zzfus.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfus.zza(context);
                    return Boolean.valueOf(zzfus.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i5 = G6.L.f4523b;
        H6.l.f("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final String zzb(Context context) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgq)).booleanValue()) {
            return (String) zzq(zzele.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzelv zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzels zzelsVar, final zzelr zzelrVar, final String str5) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgq)).booleanValue() || !zzfus.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzelv) zzq(new zzelo(str7, str, str6, zzelrVar, str4, webView, str5, str8, zzelsVar) { // from class: com.google.android.gms.internal.ads.zzelf
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzelr zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzels zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzelrVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzelsVar;
            }

            @Override // com.google.android.gms.internal.ads.zzelo
            public final /* synthetic */ Object zza() {
                return zzelp.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzelv zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzels zzelsVar, final zzelr zzelrVar, final String str6) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgq)).booleanValue() || !zzfus.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzelv) zzq(new zzelo(str5, str, str8, str4, zzelrVar, webView, str6, str7, zzelsVar) { // from class: com.google.android.gms.internal.ads.zzelg
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzelr zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzels zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzelrVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzelsVar;
            }

            @Override // com.google.android.gms.internal.ads.zzelo
            public final /* synthetic */ Object zza() {
                return zzelp.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zze(final zzfuu zzfuuVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgq)).booleanValue() && zzfus.zzb()) {
            Objects.requireNonNull(zzfuuVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeld
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfuuVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzf(final zzfuu zzfuuVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelh
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgq)).booleanValue() && zzfus.zzb()) {
                    zzfuuVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzg(final zzfuu zzfuuVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeli
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgq)).booleanValue() && zzfus.zzb()) {
                    zzfuuVar.zzd(view, zzfvb.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzh(final zzfuu zzfuuVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelj
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgq)).booleanValue() && zzfus.zzb()) {
                    zzfuuVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final zzfvg zzi(final H6.a aVar, final WebView webView, boolean z2) {
        final boolean z10 = true;
        return (zzfvg) zzq(new zzelo(webView, z10) { // from class: com.google.android.gms.internal.ads.zzelk
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzelo
            public final /* synthetic */ Object zza() {
                H6.a aVar2 = this.zza;
                int i5 = aVar2.f4928b;
                int length = String.valueOf(i5).length();
                int i10 = aVar2.f4929c;
                StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i10).length());
                sb2.append(i5);
                sb2.append(".");
                sb2.append(i10);
                return zzfvg.zza(zzfvi.zza("Google", sb2.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzj(final zzfvg zzfvgVar, final zzfvf zzfvfVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzell
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfvgVar.zzb(zzfvfVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzelq
    public final void zzk(final zzfvg zzfvgVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfvgVar.zzd(view, zzfvb.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}

package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzfuw {
    private final zzfvi zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfux zzg;

    private zzfuw(zzfvi zzfviVar, WebView webView, String str, List list, String str2, String str3, zzfux zzfuxVar) {
        this.zza = zzfviVar;
        this.zzb = webView;
        this.zzg = zzfuxVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfuw zza(zzfvi zzfviVar, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzfws.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfuw(zzfviVar, webView, null, null, str, str2, zzfux.HTML);
    }

    public static zzfuw zzb(zzfvi zzfviVar, WebView webView, String str, String str2) {
        zzfws.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfuw(zzfviVar, webView, null, null, str, "", zzfux.JAVASCRIPT);
    }

    public final zzfvi zzc() {
        return this.zza;
    }

    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.zzc);
    }

    public final Map zze() {
        return DesugarCollections.unmodifiableMap(this.zzd);
    }

    public final WebView zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zze;
    }

    public final zzfux zzi() {
        return this.zzg;
    }
}

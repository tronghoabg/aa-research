package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.C0560y;
import G6.U;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class zzcmo extends zzclm {
    public zzcmo(zzclb zzclbVar, zzbhw zzbhwVar, boolean z2, zzekz zzekzVar) {
        super(zzclbVar, zzbhwVar, z2, new zzbym(zzclbVar, zzclbVar.zzK(), new zzbie(zzclbVar.getContext())), null, zzekzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzac(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzclb)) {
            int i5 = G6.L.f4523b;
            H6.l.f("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzclb zzclbVar = (zzclb) webView;
        zzcdu zzcduVar = this.zzb;
        if (zzcduVar != null) {
            zzcduVar.zze(str, map, 1);
        }
        zzfzu.zza();
        zzfzz zzfzzVar = zzfzz.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return zzL(str, map);
        }
        if (zzclbVar.zzP() != null) {
            zzclbVar.zzP().zzN();
        }
        if (zzclbVar.zzN().zzg()) {
            str2 = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzaG);
        } else if (zzclbVar.zzW()) {
            str2 = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzaF);
        } else {
            str2 = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzaE);
        }
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        Context context = zzclbVar.getContext();
        String str3 = zzclbVar.zzs().f4927a;
        try {
            HashMap map2 = new HashMap();
            map2.put("User-Agent", nVar.f1863c.E(context, str3));
            map2.put("Cache-Control", "max-stale=3600");
            String str4 = (String) new C0560y(context).a(0, str2, map2, null).get(60L, TimeUnit.SECONDS);
            if (str4 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes(StandardCharsets.UTF_8)));
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            int i10 = G6.L.f4523b;
            H6.l.g("Could not fetch MRAID JS.", e7);
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import x3.AbstractC4467j;

/* loaded from: classes3.dex */
public final class zzfvg {
    private final zzfvi zza;
    private final WebView zzb;
    private zzfxj zzc;
    private final HashMap zzd;
    private final zzfvw zze;

    private zzfvg(zzfvi zzfviVar, WebView webView, boolean z2) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzfvw();
        zzfws.zza();
        this.zza = zzfviVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfuu) it.next()).zzb(webView);
            }
            this.zzc = new zzfxj(webView);
        }
        if (!com.moloco.sdk.internal.publisher.H.b0("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        AbstractC4467j.a(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfve(this));
    }

    public static zzfvg zza(zzfvi zzfviVar, WebView webView, boolean z2) {
        return new zzfvg(zzfviVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        AbstractC4467j.f(this.zzb, "omidJsSessionService");
    }

    public final void zzb(zzfvf zzfvfVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfuu) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfvd(this, zzfvfVar, timer), 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzc() {
        zzfxj zzfxjVar = this.zzc;
        if (zzfxjVar == null) {
            return null;
        }
        return (View) zzfxjVar.get();
    }

    public final void zzd(View view, zzfvb zzfvbVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfuu) it.next()).zzd(view, zzfvbVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfvbVar, "Ad overlay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzf(String str) {
        zzfuz zzfuzVar = zzfuz.DEFINED_BY_JAVASCRIPT;
        zzfvc zzfvcVar = zzfvc.DEFINED_BY_JAVASCRIPT;
        zzfvh zzfvhVar = zzfvh.JAVASCRIPT;
        zzfuy zzfuyVar = new zzfuy(zzfuv.zza(zzfuzVar, zzfvcVar, zzfvhVar, zzfvhVar, false), zzfuw.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzfuyVar);
        zzfuyVar.zzb(zzc());
        for (zzfvv zzfvvVar : this.zze.zza()) {
            zzfuyVar.zzd((View) zzfvvVar.zza().get(), zzfvvVar.zzc(), zzfvvVar.zzd());
        }
        zzfuyVar.zza();
    }

    public final /* synthetic */ void zzg(String str) {
        HashMap map = this.zzd;
        zzfuu zzfuuVar = (zzfuu) map.get(str);
        if (zzfuuVar != null) {
            zzfuuVar.zzc();
            map.remove(str);
        }
    }
}

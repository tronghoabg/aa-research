package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcmm {
    private final zzcml zza;
    private final zzcmn zzb;

    public zzcmm(zzcmn zzcmnVar, zzcml zzcmlVar) {
        this.zza = zzcmlVar;
        this.zzb = zzcmnVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            G6.L.k("Click string is empty, not proceeding.");
            return "";
        }
        zzcmn zzcmnVar = this.zzb;
        zzbaw zzbawVarZzS = ((zzcmu) zzcmnVar).zzS();
        if (zzbawVarZzS == null) {
            G6.L.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzbar zzbarVarZzb = zzbawVarZzS.zzb();
        if (zzbarVarZzb == null) {
            G6.L.k("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcmnVar.getContext() != null) {
            return zzbarVarZzb.zzf(zzcmnVar.getContext(), str, ((zzcmw) zzcmnVar).zzE(), zzcmnVar.zzj());
        }
        G6.L.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcmn zzcmnVar = this.zzb;
        zzbaw zzbawVarZzS = ((zzcmu) zzcmnVar).zzS();
        if (zzbawVarZzS == null) {
            G6.L.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzbar zzbarVarZzb = zzbawVarZzS.zzb();
        if (zzbarVarZzb == null) {
            G6.L.k("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcmnVar.getContext() != null) {
            return zzbarVarZzb.zzj(zzcmnVar.getContext(), ((zzcmw) zzcmnVar).zzE(), zzcmnVar.zzj());
        }
        G6.L.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() throws JSONException {
        zzcmn zzcmnVar = this.zzb;
        zzbix.zza(zzcmnVar.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpu)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzcmz zzcmzVarZzP = ((zzclb) zzcmnVar).zzP();
            zzdbv zzdbvVarZzK = zzcmzVarZzP != null ? zzcmzVarZzP.zzK() : null;
            if (zzdbvVarZzK != null) {
                long jZza = zzdbvVarZzK.zza();
                if (jZza > 0) {
                    jSONObject.put("plcmtid", jZza);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            G6.L.l("Error constructing JSON.", e7);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(str);
                }
            });
        } else {
            int i5 = G6.L.f4523b;
            H6.l.f("URL is empty, ignoring message");
        }
    }

    public final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
